package tombola;

import java.util.concurrent.TimeUnit;

public class TestTombola {
    //VERSIONE DUE
    public static void main(String[] args) {

        //Creo i due oggetti EstraiTombola
        EstraiTombola p1=new EstraiTombola();
        p1.setEstrazione("E1");
        EstraiTombola p2=new EstraiTombola();
        p2.setEstrazione("          E2");

        //Popolo l'unico array
        p1.popolaArray();

        //Inizio il metodo
        p1.start();     //Prima Estrazione
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch(Exception e) {
            System.out.println(e);
        }
        p2.start();     //Seconda Estrazione

    }
}
