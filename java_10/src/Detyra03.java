//Të shkruhet një program në gjuhën programuese Java, i cili e përmban klasën Fakulteti i cili i ka anëtarët
//private: id dhe emri, dhe anëtarin e mbrojtur adresa. Klasa Fakulteti zgjerohet prej klasës abstrakte Detajet
//– që e ka anëtarin privat kodi dhe implementon ndërfaqen FakultetiInterface – e cila i ka metodat: shtypDetajet()
//        dhe shtypKodin(). Në programin kryesor të krijohet një objekt i klasës Fakulteti dhe të thirren metodat
//        shtypDetajet dhe shtypKodin.

public class Detyra03 {
    public static void main(String[] arguments){
        Fakulteti fk = new Fakulteti(1, "FIEK", "Prishtine", 1);
        fk.shtypDetajet();
        fk.shtypKodin();
    }
}

interface FakultetiInterface {
    abstract void shtypDetajet();
    abstract void shtypKodin();
}

abstract class Detajet implements FakultetiInterface {
    private int kodi;
    protected Detajet(int kodi){
        this.kodi = kodi;
    }
    public void shtypKodin(){
        System.out.println(this.kodi);
    }
}

class Fakulteti extends Detajet{
    private int id;
    private String emri;
    protected String adresa;

    protected Fakulteti(int id, String emri, String adresa, int kodi) {
        super(kodi);
        this.id = id;
        this.emri = emri;
        this.adresa = adresa;
    }

    public void shtypDetajet(){
        System.out.println("ID: " + this.id);
        System.out.println("emri: " + this.emri);
        System.out.println("adresa: " + this.adresa);
        this.shtypKodin();
    }
}
