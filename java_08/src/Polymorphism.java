public class Polymorphism {
    public static void main(String [] args){
        Perdorues perdoruesi1 = new Perdorues("username", "password");
        System.out.println("Qasja e perdoruesit te notat: " + perdoruesi1.hasAccess("notat"));

        perdoruesi1 = new Profesori("username", "password", "titulli");
        System.out.println("Qasja e perdoruesit te notat: " + perdoruesi1.hasAccess("notat"));

        perdoruesi1 = new Student("drejtimi", "username", "password");
        System.out.println("Qasja e perdoruesit te notat: " + perdoruesi1.hasAccess("notat"));

    }
}

class Perdorues{
    String username;
    String password;

    public Perdorues(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean hasAccess(String doc){
        return false;
    }

    public boolean hasAccess(String doc, String ext){
        return true;
    }
}

class Profesori extends Perdorues{
    String titulli;

    public Profesori(String username, String password, String titulli){
        super(username, password);
        this.titulli = titulli;
    }

    public boolean hasAccess(String doc){
        return doc.equals("notat") || doc.equals("student");
    }
}

class Student extends Perdorues {
    String drejtimi;

    public Student(String drejtimi, String username, String password){
        super(username, password);
        this.drejtimi = drejtimi;
    }

    public boolean hasAccess(String doc){
        return doc.equals("provime") || doc.equals("profesor");
    }
}