// Trajtimi i gabimeve
public class Main {
    public static void main(String[] args) throws CustomException {
        System.out.println("Calculate a=10, b=0; " + calculate(10, 0));
    }

    public static double calculate(int a, int b) throws CustomException{
        if(b == 0)
            throw new CustomException("Cannot be zero");

        try {
            return a / b;
        } catch (ArithmeticException e){
            return 0;
        } catch (Exception e){
            return 1;
        }
    }
}

class CustomException extends Exception {
    public CustomException(String errorMessage) {
        // logic
        super(errorMessage);
    }
}