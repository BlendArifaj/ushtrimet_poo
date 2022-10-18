//#include <>
import java.util.Scanner;

public class Detyra_02 {
    public static void main(String[] args){
        ProgramiLexo perdoruesi1 = new ProgramiLexo();
        perdoruesi1.shtypDetajet();
    }
}

class ProgramiLexo{
    final char[] GRUPI_1 = {'A', 'D', 'J', 'F', 'H'};
    final char[] GRUPI_2 = {'E', 'L', 'M', 'O', 'K'};
    final char[] GRUPI_3 = {'B', 'C', 'N', 'Q', 'Z'};
    // GRUPI_4 -> Shkronjat e mbetura

    String emri;
    int mosha;
    int grupi;

    ProgramiLexo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani emrin: ");
        this.emri = sc.next();
        this.grupi = this.caktoGrupin();
        System.out.print("Shkruani moshen: ");
        this.mosha = sc.nextInt();
        sc.close();
    }

    int caktoGrupin(){
        char c = this.emri.toUpperCase().charAt(0);
        if(this.isCharInArray(c, this.GRUPI_1)){
            return 1;
        } else if (this.isCharInArray(c, this.GRUPI_2)) {
            return 2;
        }else if (isCharInArray(c, this.GRUPI_3)){
            return 3;
        }
        return 4;
    }

    boolean isCharInArray(char c, char[] array){
        for(char i : array){
            if(c == i) return true;
        }
        return false;
    }

    void shtypDetajet(){
        System.out.println("Emri: " + this.emri);
        System.out.println("Mosha: " + this.mosha);
        System.out.println("Grupi: " + this.grupi);
    }

}
