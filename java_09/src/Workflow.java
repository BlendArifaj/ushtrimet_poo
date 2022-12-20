import java.util.ArrayList;

interface Test {
    private int lmk(){
        return 5;
    }

}

public class Workflow implements Test{
    private int id;
    private String name;
    private ArrayList<Task> tasks;

    public void a() {
    }
}

interface TestInterface {
    public abstract void abstractMethodExample();

    default void defaultMethodExample() {
        privateMethodExample();
        privateStaticMethodExample();
        System.out.println("Inside a default method\n");
    }

    private void privateMethodExample() {
        System.out.println("Inside a private non-static method\n");
    }

    private static void privateStaticMethodExample() {
        System.out.println("Inside a private static method\n");
    }
}

class TestClass implements TestInterface {
    @Override
    public void abstractMethodExample() {
        System.out.println
                ("Inside the implementation of an abstract method");
    }
    public static void main(String[] args) {
        TestInterface test = new TestClass();
        test.defaultMethodExample();
        test.abstractMethodExample();
    }
}