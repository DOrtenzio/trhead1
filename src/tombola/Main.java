package tombola;

public class Main {
    //VERSIONE DUE MA CON QUALCHE RIPETIZIONE SOPRATTUTTO SUL SUSSEGUIRSI
    public static void main(String[] args) {
        EstraiTombola p1=new EstraiTombola();
        p1.settaNomePersona("E1");
        p1.start();
        EstraiTombola p2=new EstraiTombola();
        p2.settaNomePersona("E2");
        p2.start();
    }
}
