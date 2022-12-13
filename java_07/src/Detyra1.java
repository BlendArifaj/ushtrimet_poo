/*
    Te Krijohen klasat: Profesori dhe Studenti, te cilat zgjerohen nga klasa Perdoruesi dhe i kane vecorite e tyre te caktuara!
 */
public class Detyra1 {

}

class Perdoruesi{
    String username;
    String password;

    public Perdoruesi(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean hasAccess(String doc){
        return false;
    }
}

class Profesori extends Perdoruesi{
    String titulli;

    public Profesori(String username, String password, String titulli){
        super(username, password);
        this.titulli = titulli;
    }

    public boolean hasAccess(String doc){
//        if(doc.equals("notat") || doc.equals("student")){
//            return true;
//        }
//
//        return false;
        return doc.equals("notat") || doc.equals("student");
    }
}

class Student extends Perdoruesi {
    String drejtimi;

    public Student(String drejtimi, String username, String password){
        super(username, password);
        this.drejtimi = drejtimi;
    }

    public boolean hasAccess(String doc){
        return doc.equals("provime") || doc.equals("profesor");
    }
}