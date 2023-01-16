public class Main2 {
    public static void main(String args[]){
        calculo(10, 2);
        calculo(5, 0);
        calculo(7, 1);

        try{
            vendosNoten(4);

            vendosNoten(10);
        }
        catch (NotaException ne){
            System.out.println("NotaException: " + ne);
        }
        finally {
            System.out.println("Finally!");
        }

    }

    public static void calculo(int a, int b){
        try{
            System.out.printf("Heresi ne mes te a dhe b: (a / b) = %d \n", (a/b));
        }
        catch (ArithmeticException ae){
            System.out.println("ArithmeticException: " + ae);
        }
        catch(Exception e){
            System.out.println("General Exception: " + e);
        }
    }

    public static void vendosNoten(int nota) throws NotaException{
        if(nota < 5 || nota > 10){
            throw new NotaException("Nota nuk eshte e lejuar!");
        }else{
            System.out.println("Vendosja e notes perfundoj me sukses!");
        }
    }
}

class NotaException extends Exception{
    public NotaException(String errorMessage){
        super(errorMessage);
        // e ruajme gabimin ne nje fajll
    }
}


