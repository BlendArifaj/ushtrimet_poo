/*
    Te krijohet klasa Studenti me anetaret
        vecorite:
            - Id
            - Emri
            - Mbiemri
            - Notat (varg i numrave) int[]
        metodat:
            - notaMesatare() -> kthen noten mesatare te nje studenti
            - shtypDetajet() -> shtyp detajet e studentit ne formatin:
                    id - emri mbiemri - nota mesatare
            - notaMax() -> nota maksimale e nje studenti
            - notaMin() -> nota minimale e nje studenti
     Kerkesat:
        - Ne programin kryesor main, te krijohet dhe te perdoret objekti
            i klases Student.
 */
public class detyra_1 {
    public static void main(String[] args){
        int[] notat = {5,6,7,8,9,10,10};
        Student studenti = new Student(
                "STUDENT-1", "Student", "Student", notat
        );
        studenti.shtypDetajet();
    }
}

class Student {
    String id;
    String emri;
    String mbiemri;
    int[] notat;

    public Student(String id, String emri, String mbiemri, int[] notat){
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.notat = notat;
    }

    public double notaMesatare(){
        double shuma = 0.0;
        for(int nota : this.notat){
            shuma += nota;
        }
        return shuma / this.notat.length;
    }

    public void shtypDetajet(){
        System.out.printf("%s - %s %s - %f",
                this.id, this.emri, this.mbiemri, this.notaMesatare());
    }

    public int vleraMax(){
        int max = this.notat[0];
        for(int nota : this.notat){
            if(nota > max){
                max = nota;
            }
        }
        return max;
    }

}