import java.util.ArrayList;

public class Detyra_k1 {
    public static void main(String[] args){
        Employee p1 = new Employee(1, "Punetori 1", new ArrayList<>());
        Employee p11 = new Employee(11, "Punetori 11", new ArrayList<>());
        p1.ekipa.add(p11);

        Employee p2 = new Employee(2, "Punetori 2", new ArrayList<>());
        Employee p3 = new Employee(3, "Punetori 3", new ArrayList<>());

        ArrayList<Employee> ekipaPronari = new ArrayList<>();
        ekipaPronari.add(p1);
        ekipaPronari.add(p2);
        ekipaPronari.add(p3);

        Employee pronari = new Employee(4, "Pronari", ekipaPronari);
        Company kompania = new Company(123, "Kompania FIEK", pronari);
        kompania.shtypDetajet();
    }
}

class Company {
    int id;
    String emri;
    Employee pronari;

    public Company(int id, String emri, Employee pronari){
        this.id = id;
        this.emri = emri;
        this.pronari = pronari;
    }

    public void shtypDetajet(){
        System.out.println("Te dhenat e kompanise: ");
        System.out.printf(
                "Id: %d, Emri: %s, Pronari: %s \n",
                this.id, this.emri, this.pronari.emri);
        System.out.println("Te dhenat per punetoret e kompanise:");
        this.pronari.shtypDetajet();
    }
}

class Employee{
    int id;
    String emri;
    ArrayList<Employee> ekipa;

    public Employee(int id, String emri, ArrayList<Employee> ekipa){
        this.id = id;
        this.emri = emri;
        this.ekipa = ekipa;
    }

    public void shtypDetajet(){
        System.out.printf("Id: %d, emri: %s\n", this.id, this.emri);
        for(Employee e: this.ekipa){
            e.shtypDetajet();
        }
    }
}