public class Main {
    public static void main(String[] args) {
        Perdoruesi perdoruesi = Perdoruesi.getInstance("UTF");
        perdoruesi.setCode("UTF-8");
        String code = perdoruesi.getCode();

        perdoruesi.username = "dadasdsa";


    }
}

// public protected private
class Perdoruesi {
    public String username;
    protected String password;
    private String code;

    private Perdoruesi(String code){
        this.code = code;
    }

    public static Perdoruesi getInstance(String code){
        return new Perdoruesi(code);
    }

    public String getCode(){
        return this.code;
    }

    public void setCode(String newCode){
        this.code = newCode;
    }

    public void setUsername(String newUsername){
        if(newUsername.equals("")){
            return;
        }
    }
}
//
//class IT extends Perdoruesi {
//    public void shtypDetajet(){
//        System.out.println(super.getCode());
//        super.password = "test";
//        super.username = "test";
//    }
//}