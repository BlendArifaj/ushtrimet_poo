public class Detyra01 {
    public static void main(String[] args){
        Dog dog = new Dog();
        Animal cat = new Cat();
        Cow cow = new Cow();

        detajet(cat);
        detajet(dog);
        detajet(cow);
    }

    public static void detajet(Animal animal){
        System.out.println("Sound: ");
        animal.sound();
        System.out.println("Has children: " + animal.hasChildren());
    }
}

abstract class Animal {
    abstract void sound();
    abstract boolean hasChildren();
}

class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("dog sound ...");
    }

    @Override
    boolean hasChildren() {
        return false;
    }
}

class Cat extends Animal{

    @Override
    void sound() {
        System.out.println("cat sound ...");
    }

    @Override
    boolean hasChildren() {
        return false;
    }
}

class Cow extends Animal {

    @Override
    void sound() {
        System.out.println("cow sound ...");
    }

    @Override
    boolean hasChildren() {
        return true;
    }
}

