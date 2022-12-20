public class Detyra2 {

}

interface Interface1 {
    public static int ID = 5;

    abstract void detajet();

    default void perdorMetodenPrivate(){ metodaImplementuar();}

    private void metodaImplementuar(){

    }
}

interface Interface2 {

}

class ClassC implements Interface1, Interface2 {
    @Override
    public void detajet() {
        this.perdorMetodenPrivate();
    }
}
