import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main3 {
    public static void main(String args[]) throws IOException{
        File file = new File("java_14/src/test_file.txt");

        if(! file.exists()){
            try{
                file.createNewFile();
            }catch (IOException ioe){
                System.out.println("File cannot be created!");
                return;
            }
        }

        if(file.canWrite()){
            FileWriter fw = new FileWriter(file, true);
            fw.write("Shkrimi ne nje fajll!\n");
            fw.close();
        }
//
//        if(!file.canRead()){
//            throw new Exception("");
//        }

        if(file.canRead()){
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }

    }
}
