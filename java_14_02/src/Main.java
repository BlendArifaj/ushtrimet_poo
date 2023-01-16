import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("java_14_02/src/logs.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        if(file.canWrite()){
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("This is a text for file! \n");
            fileWriter.close();
        }

        if(file.canRead()){
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }

    }
}

