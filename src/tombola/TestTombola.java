package tombola;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TestTombola {
    //VERSIONE DUE
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        EstraiTombola p1=new EstraiTombola();
        p1.setEstrazione("E1");
        EstraiTombola p2=new EstraiTombola();
        p2.setEstrazione("          E2");
        p1.popolaArray();
        p1.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch(Exception e) {
            System.out.println(e);
        }
        p2.start();

        System.out.println("Inserire ENTER per uscire");
        try {
            in.nextLine();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
