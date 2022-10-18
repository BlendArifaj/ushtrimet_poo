public class Detyra2 {
    final int numri1 = 1;
    double numri2 = 0.2;
    float numri3;
    boolean condition = true; //or false
    char c = 'c';
    String pershkrimi = "Pershkrimi i nje objekti";
    short numri4;

    public static void main(String[] args){
        System.out.println("Hello World!");
        int s = sum(5, 2);
        System.out.println("S: " + s);
    }

    static int sum(int x, int y){
        // logic
        return x + y;
    }
}
