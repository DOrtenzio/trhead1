package tombola;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class EstraiTombola extends Thread {
    //VERSIONE DUE

    //Stringa identificativa dell'estrattore
    String nomePersona;

    //Array in comune dove sono contenuti tutti i num da 1 a 90
    private static ArrayList <Integer> numeriDisponibili =new ArrayList<>();

    //Inposto il nome dell'estrazione
    public void setEstrazione(String nome) {
        nomePersona=nome;
    }

    //Inserisco nell'arraylist tutti i num da 1 a 90
    public void popolaArray(){
        for (int i=1;i<91;i++){ numeriDisponibili.add(i); }
    }

    //Cancello il numero con l'indice estratto casualmente
    public void removNumero(int i) {
        numeriDisponibili.remove(i);
    }

    //Estrazione di un numero
    public void estraiNumero() {
        //Estraggo l'indice casuale
        int i= (int) (Math.random() * numeriDisponibili.size());
        //Restituisco un informazione sulla codizione del tombolino o indico il numero estratto
        String s;
        if (numeriDisponibili.isEmpty())
            s="Numeri terminati.";
        else
            s=nomePersona+" ha estratto: "+numeriDisponibili.get(i);
        System.out.println(s);
        //Rimuovo il numero
        removNumero(i);
        //Pausa così che il secondo estrattore abbia il tempo di estrarre il suo numero così che non capiti ch possano essere estratte 2 indici uguali
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public void run() {
        while (true) estraiNumero();
    }
}