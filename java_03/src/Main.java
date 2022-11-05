/*
    Detyra 1: Numri qift/tek
    Input: Perdoruesi shtyp nje numer permes tastieres
    Ouput: Programi jone i tregon nese numri eshte qift/tek nese 'n'==2 | numri eshte i plotepjestueshem me 'n'
    Shtese: Programi duhet te perfundoj ekzekutimin nese perdoruesi shtyp vleren 0!
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProgramiNumri programi1 = new ProgramiNumri(2);
        programi1.fillo();
    }
}

class ProgramiNumri {
    int n;
    String numriPlotepjestueshem;
    String numriJoPlotepjestueshem;

    final String NUMRI_PLOTEPJESUESHEM_ME_2 = "Numri qe keni shtypur eshte qift!";
    final String NUMRI_JO_PLOTEPJESUESHEM_ME_2 = "Numri qe keni shtypur eshte tek!";
    final String NUMRI_PLOTEPJESUESHEM_ME_N = "Numri qe keni shtypur eshte i plotepjestueshem me numrin e programit!";
    final String NUMRI_JO_PLOTEPJESUESHEM_ME_N = "Numri qe keni shtypur nuk eshte i plotepjestueshem me numrin e programit!";

    public ProgramiNumri(int n){
        this.n = n;
        if(n == 2){
            this.numriPlotepjestueshem = this.NUMRI_PLOTEPJESUESHEM_ME_2;
            this.numriJoPlotepjestueshem = this.NUMRI_JO_PLOTEPJESUESHEM_ME_2;
        }else{
            this.numriPlotepjestueshem = this.NUMRI_PLOTEPJESUESHEM_ME_N;
            this.numriJoPlotepjestueshem = this.NUMRI_JO_PLOTEPJESUESHEM_ME_N;
        }
    }

    void fillo(){
        Scanner sc = new Scanner(System.in);
        int numriIShtypurNgaPerdoruesi = -1;

        while(numriIShtypurNgaPerdoruesi != 0){
            System.out.print("Ju lutem te shtypni nje numer: ");
            numriIShtypurNgaPerdoruesi = sc.nextInt();
            this.kontrolloNeseNumriEshtePlotepjestueshem(numriIShtypurNgaPerdoruesi);
        }

        sc.close();
    }

    void kontrolloNeseNumriEshtePlotepjestueshem(int numriIShtypurNgaPerdoruesi){
        if(numriIShtypurNgaPerdoruesi % this.n == 0){
            System.out.println(this.numriPlotepjestueshem);
        }else{
            System.out.println(this.numriJoPlotepjestueshem);
        }
    }


}

