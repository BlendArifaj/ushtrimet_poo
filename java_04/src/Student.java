import java.util.ArrayList;

public class Student {
    String emri;
    String mbiemri;
    String id;
    String drejtimi;
    ArrayList<Nota> notat;

    public Student(String emri, String mbiemri, String id, String drejtimi) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.id = id;
        this.drejtimi = drejtimi;
        this.notat = new ArrayList<Nota>(); // Ne moment kur te krijohet nje student i ri, ai do te krijohet pa ndonje note
    }
    
    public double notaMesatare(){
        double countNotat = 0;
        for(Nota nota: this.notat){
            countNotat += nota.vlera;
        }

        if(countNotat == 0){
            return 0;
        }

        return countNotat / this.notat.size();
    }

    public void shtypDetajet(){
        System.out.printf("%s - %s %s - %s - %f", this.id, this.emri, this.mbiemri, this.drejtimi, this.notaMesatare());
    }
}
