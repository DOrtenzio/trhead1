package tombola;

public class Main {
    public static void main(String[] args) {
        EstraiTombola p1=new EstraiTombola();
        p1.settaNomePersona("E1");
        EstraiTombola p2=new EstraiTombola();
        p2.settaNomePersona("E2");
        p1.start();
        p2.start();
    }
}
