
public class Detyra2 {
    public static void main(String[] arguments){
        int[] vargu1 = new int[]{1, 2, 3, 4, 5, 2, 5};
        MenaxhimiVargut.shtypVargunNeEkran(vargu1);
        vargu1 = MenaxhimiVargut.shtoAnetareNeVargTeNumrave(
                vargu1, 10
        );
        MenaxhimiVargut.shtypVargunNeEkran(vargu1);

        vargu1 = MenaxhimiVargut.shtoAnetareNeVarg(
                vargu1, 25
        );
        MenaxhimiVargut.shtypVargunNeEkran(vargu1);

        vargu1 = MenaxhimiVargut.shtoAnetareNeVarg(
                vargu1, 35
        );
        MenaxhimiVargut.shtypVargunNeEkran(vargu1);


    }
}

class MenaxhimiVargut{
    public static int NULL_VALUE = Integer.MIN_VALUE;
    public static int[] shtoAnetareNeVargTeNumrave(
            int[] varguNumrave, int numriIRi
    ){
        int[] varguIRi = new int[varguNumrave.length + 1];
        for(int i = 0; i < varguNumrave.length; i++){
            varguIRi[i] = varguNumrave[i];
        }
        varguIRi[varguIRi.length - 1] = numriIRi;
        return varguIRi;
    }

    public static int[] shtoAnetareNeVarg(
            int[] varguNumrave, int numriIRi
    ){
        int availablePosition = MenaxhimiVargut.findFreeSpace(
            varguNumrave
        );

        if(availablePosition == MenaxhimiVargut.NULL_VALUE){
            //Nuk ka hapsire te lire ne varg
            int[] varguIRi = MenaxhimiVargut.createArrayWithInitValues(
                    varguNumrave.length * 2, 
                    MenaxhimiVargut.NULL_VALUE
            );
            for(int i = 0; i < varguNumrave.length; i++){
                varguIRi[i] = varguNumrave[i];
            }
            varguIRi[varguNumrave.length] = numriIRi;
            varguNumrave = varguIRi;
        }else{
            //Ka hapsire te lire ne varg
            varguNumrave[availablePosition] = numriIRi;
        }
        return varguNumrave;
    }

    public static boolean hasValue(int[] vargu, int value){
        for(int numri: vargu){
            if(numri == value){
                return true;
            }
        }
        return false;
    }

    public static int findFreeSpace(int[] vargu){
       for(int i = 0; i < vargu.length; i++){
           if(vargu[i] == MenaxhimiVargut.NULL_VALUE){
               return i;
           }
       }
       return MenaxhimiVargut.NULL_VALUE;
    }

    public static int[] createArrayWithInitValues(
        int sizeOfArray, int initValue
    ){
        int [] newArray = new int[sizeOfArray];
        for(int i = 0; i < sizeOfArray; i++){
            newArray[i] = initValue;
        }
        return newArray;
    }

    public static void shtypVargunNeEkran(int[] vargu){
        System.out.printf("Size: %d : [ ", vargu.length);
        for(int numri: vargu){
            if(numri != MenaxhimiVargut.NULL_VALUE)
                System.out.printf("%d \t", numri);
        }
        System.out.print("]\n");
    }
}
