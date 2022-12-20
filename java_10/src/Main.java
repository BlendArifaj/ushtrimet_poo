public class Main {
    public static void main(String[] args) {
        ClassB objB = new ClassB(1);
        objB.calculateScore(1);
    }
}

abstract class ClassA {
    private int id;

    public ClassA(int id){
        this.id = id;
    }

    abstract double calculateScore(int state);

    public void shtypDetajet(){
        System.out.println("...");
    }
}

class ClassB extends ClassA {
    public ClassB(int id){
        super(id);
    }

    public double calculateScore(int state){
        // logic
       return 1.0;
    }
}