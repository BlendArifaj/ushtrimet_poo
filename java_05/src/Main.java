//Klasat statike
public class Main {
    public static void main(String[] args){
        ClassA objA = new ClassA(10);
        objA.shtypDetajet();

        ClassA.shtypTipin();
        System.out.println(ClassA.CLASS_ID);

        int random = MenaxhimiINumrave.randomNumber();
        System.out.println("Numri i rastesishem: " + random);

        boolean compare = MenaxhimiINumrave.compareTwoNumbers(1, 5);
    }
}

class ClassA{
    int numri;
    static String CLASS_ID = "CLASS_A";

    ClassA(int numri){
        this.numri = numri;
    }
    public void shtypDetajet(){
        System.out.println("Numri: " + this.numri);
    }

    public static void shtypTipin(){
//        String classId = ClassA.CLASS_ID;
        System.out.println("ClassA");
    }
}

class MenaxhimiINumrave{
    public static int randomNumber(){
        return (int)(100 * Math.random());
    }

    public static boolean compareTwoNumbers(int num1, int num2){
        return num1 > num2;
    }

}