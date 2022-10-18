public class Main {
    int numri1;
    double numri2;
    float numri3;
    boolean condition;
    char c;
    String permbajtja;
    int[] vargu1;
    double[] vargu2;
    String[] vargu3;

    int[][] matrix;

    // Comment

    /*
     Block Comment
    */

    public static void main(String[] args) {
        System.out.println("Shuma: " + shuma(5, 6));
        detajet("Detajet e lendes!...");
    }

    static int shuma(int x, int y){
        return x + y;
    }

    static void detajet(String detajet){
        System.out.println(detajet);
    }

    public static int shumaFor(int[] vargu){
        int sum = 0;
        for(int i=0; i<vargu.length; i++){
            sum += vargu[i];
            // sum = sum + vargu[i];
        }
        return sum;
    }

    public static int shumeWhile(int[] vargu){
        int sum = 0;
        int i = 0;
        while(i < vargu.length){
            sum += vargu[i];
            i++;
        }
        return sum;
    }

    public static int shumaDoWhile(int[] vargu){
        int sum = 0;
        int i = 0;
        do{
            sum += vargu[i];
            i++;
        }while (i < vargu.length);
        return sum;
    }

    static void shtypDetajet(boolean allDetails){
        // Emri, Mbiemri, > Mosha
        if(allDetails){
           System.out.println("Emri, Mbiemri, Mosha");
        }else{
            System.out.println("Emri, Mbiemri");
        }
        int x = 1;
        int y = 2;
        int z = 3;
        if (x > y){
            if(x > z){
                System.out.println("X");
            }else if(x == y){

            }
        }else if(x > z){
            if(x < y){
                System.out.println("Y");
            }else{

            }
        }

    }

    static int max(int[] vargu){
        // [1, 5, 2, 101, 5, 10, 25, 64] -> 64
        //Kthen vleren maksimale te vargut
        int max = vargu[0];
        int condition = 100;
        for(int i: vargu){
            if(i >= condition) continue;
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    static int shtypDetajet(int numri){
        switch (numri){
            case 1:
                System.out.println("Keni shtypur numrin e pare");
                break;
            case 7:
                break;
            default:
                System.out.println("Nuk e keni shtypur numrin e sakt!");
        }
        return numri;
    }

    static boolean find(int[] numrat, int toFind){
        for(int numri: numrat){
            if(numri == toFind)
                return true;
        }
        return false;
    }
}