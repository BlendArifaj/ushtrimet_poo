public class Nota {
    String id;
    String lenda;
    int vlera;

    public Nota(String id, String lenda, int vlera) {
        this.id = id;
        this.lenda = lenda;
        this.vlera = vlera;
    }

    public void shtypDetajet(){
        System.out.printf("%s - %s - %d", this.id, this.lenda, this.vlera);
    }

}
