import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManageFile {
    public static void main(String args[]) throws IOException {
        File file = new File("java_13/src/log_file.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                System.out.println("Ka ndodhur nje gabim: " + e);
            }
        }

        FileWriter writer = new FileWriter(file, true);
        writer.write("This is a file text 2!");
        writer.close();

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }
}
