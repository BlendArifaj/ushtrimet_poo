import java.util.ArrayList;

/*
    Te krijohet klasa FakultetiStafiAkademik me anetaret
        vecorite:
            - Id
            - Emri
            - ArrayList<StafiAkademik>
                (StafiAkademik ka vecorite: ID, Titulli, Lenda)
        metodat:
            - shtypDetajet() -> shtyp detajet ne formatin:
                    id - emri - stafi akademik ...
            - stafiAkademikPerLenden(String lenda)
            - stafiAkademikPerTitullin(String titulli)
 */
public class detyra_3 {
    public static void main(String[] args){
        StafiAkademik prof1 = new StafiAkademik("PR-1", "POO", "PHD");
        StafiAkademik prof2 = new StafiAkademik("PR-2", "UEB-1", "PROF");

        ArrayList<StafiAkademik> stafiAkademik = new ArrayList<StafiAkademik>();
        stafiAkademik.add(prof1);
        stafiAkademik.add(prof2);

        FakultetiStafiAkademik fakulteti = new FakultetiStafiAkademik(
            "FK-1", "FIEK", stafiAkademik
        );

        fakulteti.shtypDetajet();
    }
}

class StafiAkademik{
    String id;
    String lenda;
    String titulli;

    public StafiAkademik(String id, String lenda, String titulli) {
        this.id = id;
        this.lenda = lenda;
        this.titulli = titulli;
    }

    public void shtypDetajet(){
        System.out.printf("%s - %s - %s \n", this.id, this.lenda, this.titulli);
    }
}

class FakultetiStafiAkademik{
    String id;
    String emri;
    ArrayList<StafiAkademik> stafiAkademik;

    public FakultetiStafiAkademik(String id, String emri, ArrayList<StafiAkademik> stafiAkademik) {
        this.id = id;
        this.emri = emri;
        this.stafiAkademik = stafiAkademik;
    }

    public void shtypDetajet(){
//        System.out.printf("ID: %s \n Emri: %s \n ", this.id, this.emri);
        System.out.println("ID: " + this.id);
        System.out.println("Emri: " + this.emri);
        System.out.println("Stafi akademik: ");
        for(StafiAkademik stafi : this.stafiAkademik){
            stafi.shtypDetajet();
        }
    }

}