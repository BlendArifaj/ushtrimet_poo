import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ClassA objA = new ClassA(10);
        ClassB objB = new ClassB(10, 20);

        objA.shtypDetajet();
        objB.shtypDetajet();

//        objA.setNum(10);
//        objB.setNum(10);

        System.out.printf("Num of class a: %d \n", objA.num);

        System.out.printf("Num of class b: %d \n", objB.num);
        System.out.printf("Num2 of class a: %d \n", objB.num2);


        System.out.println("Is objB instance of Class A? " + (objB instanceof ClassA));
        System.out.println("Is objA instance of Class B? " + (objA instanceof ClassB));
        System.out.println("Is objA instance of Object? " + (objA instanceof Object));

        ArrayList<ClassA> objAs = new ArrayList<ClassA>();
        objAs.add(objA);
        objAs.add(objB);

    }

}

class ClassA{
    int num;

    public ClassA(int num){
        this.num = num;
    }

    public void shtypDetajet(){
        System.out.println("Super klasa: ClassA");
    }

    public void setNum(int num){
        this.num = num;
    }
}

class ClassB extends ClassA {
    int num2;

    public ClassB(int num, int num2) {
        super(num);
        this.num2 = num2;
    }

    public void shtypDetajet(){
        System.out.println("Nenklasa: ClassB");
    }

    public void shtypDetajet(int num){
        System.out.println("Nenklasa: ClassB with num!");
    }

    public void setNum(int num){
        num += 10;
        super.setNum(num);
    }
}

class ClassC extends ClassA {

    public ClassC(int num) {
        super(num);
    }
}

class ClassD extends ClassB{

    public ClassD(int num, int num2) {
        super(num, num2);
    }
}