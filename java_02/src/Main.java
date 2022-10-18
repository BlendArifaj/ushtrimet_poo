public class Main {
    public static void main(String[] args) {
        Fakulteti fiek = new Fakulteti("FIEK", "Prishtine", 150);
        fiek.shtypDetajet();
//        fiek.UUID = "UP";

        if(fiek.numriStudenteve > 100){
            System.out.println("Fakulteti ka me shume se 100 student!");
        }

        Fakulteti fna = new Fakulteti("FNA", "Prishtine", 100);
        fna.shtypDetajet();

    }
}

class Fakulteti {
    final String UUID = "UP_UUID";

    String emri;
    String adresa;
    int numriStudenteve;

    Fakulteti(String emri, String adresa, int numriStudenteve){
        this.emri = emri;
        this.adresa = adresa;
        this.numriStudenteve = numriStudenteve;
    }

    Fakulteti(){
        emri = "Fiek";
        adresa = "Prishtine";
        numriStudenteve = 120;
    }

    void shtypDetajet(){
        System.out.println("Detajet e klases:");
        System.out.println("Emri: " + emri);
        System.out.println("Adresa: " + adresa);
        System.out.println("Nr. Studenteve: " + numriStudenteve);
    }
}