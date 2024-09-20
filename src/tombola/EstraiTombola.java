package tombola;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class EstraiTombola extends Thread {
    int cont=0;
    String nomePersona;

    ArrayList <Integer> numeriEstratti=new ArrayList<>();

    public void settaNomePersona(String nome) {
        nomePersona=nome;
    }

    public void aggNum(int i) {
        numeriEstratti.add(i);
    }

    public boolean contrNumEstratti(int num) {
        for (int i=0;i<cont;i++){
            if (numeriEstratti.get(i) == num)
                return false;
        }
        return true;
    }

    public void estraiNumero() {
        int temp;
        do {
            temp= (int) (Math.random()*90);
        }while(!contrNumEstratti(temp));
        aggNum(temp);
        cont+=1;
        System.out.println(nomePersona+":"+temp+" num estratti: "+cont);
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public void run() {
        do {
            estraiNumero();
        } while (cont != 90);
    }

}