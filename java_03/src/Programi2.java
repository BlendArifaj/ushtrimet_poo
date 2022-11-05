/*
    Detyra 2: Programi i cili na mundeson te menaxhojme listen e studentave
    Kerkesat: Studenti duhet te kete: emer, mbiemer, nr. te id-se, fakultetin, drejtimin, vitin e studimeve
    Menyra e funksionimit te programit duhet te jete permes terminalit, ku nje perdorues duhet ti kete keto mundesi:
        - Te shtoje nje student te ri ne liste
        - Te largoj nje student nga lista
        - Te shfaq ne ekran te gjithe studentet ne liste
        - Te perditesoj nje student nga lista
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Programi2 {
    public static void main(String[] args){
        ProgramiStudenti programiStudenti = new ProgramiStudenti();
        programiStudenti.start();
    }
}

class Student {
    String emri;
    String mbiemri;
    String ID;
    String fakulteti;
    String drejtimi;
    String vitiStudimeve;

    public Student(String emri, String mbiemri, String ID, String fakulteti, String drejtimi, String vitiStudimeve){
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.ID = ID;
        this.fakulteti = fakulteti;
        this.drejtimi = drejtimi;
        this.vitiStudimeve = vitiStudimeve;
    }

    public void shtypDetajet(){
        System.out.printf("%s - %s %s - %s - %s - %s \n", this.ID, this.emri, this.mbiemri, this.fakulteti, this.drejtimi, this.vitiStudimeve);
//        System.out.println(this.ID + " " + this.emri +" "+ this.mbiemri + " " + this.fakulteti + " " + this.drejtimi + " " +this.vitiStudimeve);
    }
}

class MenaxhoListenStudentave{
    ArrayList<Student> students;
//    Student[] students;

    public MenaxhoListenStudentave(){
        this.students = new ArrayList<Student>();
//        this.students = new Student[10]
    }

    public Student getStudentByID(String ID){
        for(Student student: this.students){
            if(student.ID.equals(ID)){ // String1 == String2  <=>  String1.equals(String2)
                return student;
            }
        }
        return null;
    }
    public void shtypStudentatNeEkran(){
        for(Student student: this.students){
            student.shtypDetajet();
        }
//        for(int i = 0; i < this.students.size(); i++){
//            this.students.get(i).shtypDetajet();
//        }

//        this.students.forEach(student -> student.shtypDetajet());
    }

    public void shtoStudentNeListe(Student newStudent){
        this.students.add(newStudent);
    }

    public boolean largoStudentNgaListSipasID(String ID){
        Student studentiNeListe = this.getStudentByID(ID);
        if(studentiNeListe != null){
            this.students.remove(studentiNeListe);
            return true;
        }
        return false;

//        for(Student student: this.students){
//            if(student.ID.equals(ID)){ // String1 == String2  <=>  String1.equals(String2)
//                this.students.remove(student);
//                break;
//            }
//        }
    }
}

class ProgramiStudenti {
    MenaxhoListenStudentave menaxhoListenStudentave;
    public ProgramiStudenti(){
        this.menaxhoListenStudentave = new MenaxhoListenStudentave();
    }

    public void start(){
        this.shtypMenu();
        this.lexoKerkesenEPerdoruesit();
    }

    public void lexoKerkesenEPerdoruesit(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Shtypni komanden: ");
            char c = sc.next().charAt(0);

            if(c == 'x'){
                break;
            }

            switch (c){
                case 'p':
                    this.menaxhoListenStudentave.shtypStudentatNeEkran();
                    break;
                case 's':
                    this.shtoStudentNeList(sc);
                    break;
                case 'l':
                    this.largoStudentNgaLista(sc);
                    break;
                case 'u':
                    this.perditesoTeDhenatStudentit(sc);
                    break;
                default:
                    System.out.println("Komanda nuk ekziston!");
                    this.shtypMenu();
                    break;
            }
        }
        sc.close();
    }

    public void perditesoTeDhenatStudentit(Scanner sc){
        this.menaxhoListenStudentave.shtypStudentatNeEkran();
        System.out.print("Shtyp ID-n e studentit qe deshironi ta perditesoni: ");
        String ID = sc.next();
        // Stundent ne baze te ID-se
        Student studenti = this.menaxhoListenStudentave.getStudentByID(ID);
        System.out.print("Shtyp fakultetin per perditesim:");
        studenti.fakulteti = sc.next();
        System.out.print("Shtyp drejtimin per perditesim: ");
        studenti.drejtimi = sc.next();
        System.out.println("*** Te dhenat e studentit jane perditesuar me sukses ***");
    }

    public void largoStudentNgaLista(Scanner sc){
        this.menaxhoListenStudentave.shtypStudentatNeEkran();
        System.out.print("Shtyp ID-n e studentit qe deshironi ta largoni nga lista: ");
        String ID = sc.next();
        if(this.menaxhoListenStudentave.largoStudentNgaListSipasID(ID)){
            System.out.println("*** Keni larguar studentin nga lista me sukses ***");
        }else{
            System.out.println("Studenti nuk eshte ne liste!");
        }
    }

    public void shtoStudentNeList(Scanner sc){
        System.out.print("Shtyp emrin e studentit: ");
        String emri = sc.next();
        System.out.print("Shtyp mbiemrin e studentit: ");
        String mbiemri = sc.next();
        System.out.print("Shtyp ID e studentit: ");
        String ID = sc.next();
        String fakulteti = "FIEK";
        String drejtimi = "Kompjuterike";
        String vitiStudimeve = "2020-2024";
        Student newStudent = new Student(emri, mbiemri, ID, fakulteti, drejtimi, vitiStudimeve);
        this.menaxhoListenStudentave.shtoStudentNeListe(newStudent);
        System.out.println("*** Keni shtuar me sukses nje student ne liste ***");
    }

    public void shtypMenu(){
        System.out.println("Per te shfaqur studentet ne liste, shtyp: p");
        System.out.println("Per te shtuar nje student ne liste, shtyp: s");
        System.out.println("Per te larguar nje student nga lista, shtyp: l");
        System.out.println("Per te perditesuar te dhenat e studentit, shtyp: u");
        System.out.println("Per te perfunduar programin, shtyp: x");
    }
}