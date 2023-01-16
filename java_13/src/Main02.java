public class Main02 {
    public static void main(String[] args){
        calculate(10, 0);
        calculate(10, 5);

        try{
            throwCustomException(1);
        }catch (CustomExceptions e){

        }
    }

    public static void calculate(int a, int b){
//        if(b == 0){
//            System.out.println("Nuk lejohet pjestimi me 0");
//            return;
//        }
        try{
            System.out.printf("Kalkulimi per vlerat: a=%d dhe b=%d \n", a, b);
            System.out.printf("Vlera e kalkuluar: %d \n", (a / b));
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Ka ndodhur nje gabim i padefinuar!");
        }
    }

    public static void throwCustomException(int a) throws CustomExceptions{
        if(a == 1){
            throw new CustomExceptions("Nuk lejohet qe vlera e a = 1");
        }

//        try{
//            if(a == 1){
//                throw new CustomExceptions("Nuk lejohet qe vlera e a = 1");
//            }
//        }catch (CustomExceptions e){
//
//        }
    }
}


class CustomExceptions extends Exception{
    public CustomExceptions(String errorMessage){
        super(errorMessage);
        // write error on log file
    }
}
