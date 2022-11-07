import java.util.ArrayList;

public class ManageStudentWithGrades {
    ArrayList<Student> students;

    public ManageStudentWithGrades(){
        this.students = new ArrayList<Student>();
    }

    public Student getStudentByID(String ID){
        for(Student student: this.students){
            if(student.id.equals(ID)){
                return student;
            }
        }
        return null;
    }

    public void shtypStudentatNeEkran(){
        for(Student student: this.students){
            student.shtypDetajet();
        }
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
    }

    public void shtypNotatStudentitNeEkran(String StudentId){
        Student student = this.getStudentByID(StudentId);

        if(student == null){
            System.out.println("Studenti nuk ekziston ne liste!");
            return;
        }

        for(Nota nota: student.notat){
            nota.shtypDetajet();
        }
    }

    public boolean shtoNoten(String StudentId, Nota nota){
        Student student = this.getStudentByID(StudentId);

        if(student == null){
           return false;
        }

        student.notat.add(nota);
        return true;
    }
}
