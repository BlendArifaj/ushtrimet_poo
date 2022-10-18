public class Detyra1 {
    int vargu1[] = new int[5];
    int[] vargu2; //= {1, 2, 3};
    double[] vargu3;
    char[] vargu4;
    String[] vargu5 = new String[5];

    int[][] matrix1;
    double [][] matrix2;

    int[][][][][][] matrixn;


    public static void main(String[] args){
        boolean kushti1 = false;
        boolean kushti2 = 5 > 6;
        boolean kushti3 = kushti1 ^ kushti2;

        if(kushti1 && kushti3){
            if(kushti3){
                System.out.println("Kushti 1 & 3");
            }else{

            }
        }else if(kushti2){
            System.out.println("Kushti 2");
        }else{
            System.out.println("...");
        }
    }

    static int maxFor(int[] array){
        int vleraMax = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > vleraMax){
                vleraMax = array[i];
            }
        }
        return vleraMax;
    }

    static int maxWhile(int[] array){
        int vleraMax = array[0];
        int i = 1;

        while(i < array.length){
            if(array[i] > vleraMax){
                vleraMax = array[i];
            }
            i++;
//            i += 1;
//            i = i + 1;
        }
        return vleraMax;
    }

    static int maxDoWhile(int[] array){
        int vleraMax = array[0];
        int i = 1;

        do{
            if(array[i] > vleraMax){
                vleraMax = array[i];
            }
            i++;
//            i += 1;
//            i = i + 1;
        }while (i < array.length);

        return vleraMax;
    }

    static void shtypDetajet(char c){
        if(c == 'a' || c == 'd'){

        }else if(c == 'b'){

        }else if(c == 'e'){

        }
        else{

        }

        switch (c){
            case 'a':
            case 'd':
            case 'f':
            case 'z':
                System.out.println("A");
                break;
            case 'b':
                break;
            case 'e':
                // logic
                break;
            default:
                break;
        }

    }
    /*
    [
        [ 1, 2 ,3 ],
        [4, 5, 6]
    ]
     */

    public static void shtypNumrat(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }

    // 1, 2 ,
    public static int max(int[] vargu){
        int varMax = vargu[0];
        for(int anetariVargut : vargu){
            if(anetariVargut > 100) continue;
            if(anetariVargut > varMax)
                varMax = anetariVargut;
        }
//        for(int j = 1; j < vargu.length; j++){
//            if(vargu[j] >= 100) continue;
//
//            if(vargu[j] < 0) break;
//
//            if(j < 100 && vargu[j] > varMax){
//                varMax = vargu[j];
//            }
//        }
        return varMax;
    }
}
