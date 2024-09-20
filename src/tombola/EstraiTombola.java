package tombola;

import java.util.concurrent.TimeUnit;

public class EstraiTombola extends Thread {
    //VERSIONE DUE MA CON QUALCHE RIPETIZIONE
    String nomePersona;
    boolean [] numeriEstratti=new boolean[90];

    public void settaNomePersona(String nome) {
        nomePersona=nome;
    }

    public void aggNum(int i) {
        numeriEstratti[i]=true;
    }

    public boolean contrNumEstratti(int num) {
        return numeriEstratti[num];
    }


    public void estraiNumero() {
        int temp;
        do {
            temp= (int) (Math.random()*90);
            System.out.println(contrNumEstratti(temp));
        }while(contrNumEstratti(temp));
        System.out.println(nomePersona+" ha estratto: "+temp);
        aggNum(temp);
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public void run() {
        for (int i=0;i<90;i++){
            estraiNumero();
        }
    }

}