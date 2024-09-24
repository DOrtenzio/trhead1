package tombola;

import java.util.Scanner;

public class TestTombola {
    //VERSIONE DUE MA CON QUALCHE RIPETIZIONE SOPRATTUTTO SUL SUSSEGUIRSI
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        EstraiTombola p1=new EstraiTombola();
        p1.settaNomePersona("E1");
        EstraiTombola p2=new EstraiTombola();
        p2.settaNomePersona("E2");
        p1.start();
        p2.start();
        System.out.println("Inserire ENTER per uscire");
        try {
            in.nextLine();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
