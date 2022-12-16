import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Punetori p1 = new Punetori(1, "Punetori 1", new ArrayList<Punetori>());
        Punetori p2 = new Punetori(2, "Punetori 2", new ArrayList<Punetori>());
        Punetori p3 = new Punetori(3, "Punetori 3", new ArrayList<Punetori>());

        ArrayList<Punetori> ekipaPronari = new ArrayList<Punetori>();
        ekipaPronari.add(p1);
        ekipaPronari.add(p2);
        ekipaPronari.add(p3);

        Punetori pronari = new Punetori(4, "Pronari", ekipaPronari);

        Kompania kompania = new Kompania(1, "Kompania", pronari);

        kompania.shtypDetajet();
    }
}

class Kompania {
    private int id;
    private String emri;
    private Punetori pronari;
    public Kompania(int id, String emri, Punetori pronari){
        this.id = id;
        this.emri = emri;
        this.pronari = pronari;
    }

    public void shtypDetajet(){
        System.out.println("Detajet e kompanise:");
        System.out.println("Id: " + this.id + ", Emri: " + this.emri);
        System.out.println("Pronari: " + this.pronari.getEmri());
        System.out.println("Punetoret e kompanise:");
        this.pronari.shtypDetajet();
    }
}

class Punetori {
    private int id;
    private String emri;
    private ArrayList<Punetori> ekipa;

    public Punetori(int id, String emri, ArrayList<Punetori> ekipa){
        this.id = id;
        this.emri = emri;
        this.ekipa = ekipa;
    }

    public String getEmri(){
        return this.emri;
    }

    public void shtypDetajet(){
        System.out.printf("Id: %d, Emri: %s \n", this.id, this.emri);
        for (Punetori p: this.ekipa) {
            p.shtypDetajet();
        }
    }

}