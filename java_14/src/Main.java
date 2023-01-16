import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // file
        String filename = "java_14/src/test_file";
        File file = new File("java_14/src/test_file");

        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new Date(file.lastModified()));
        System.out.println("--------");

        //we can create file if this doesn't exists
        if(!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(filename, true);

        fw.write("Write on file \n");
        fw.close();
        // or
        //PrintWriter output = new PrintWriter(fw);
        //output.println(7);
        //output.close();

        try {
            Scanner input = new Scanner(file);
            while(input.hasNextInt()) {
                System.out.println(input.nextInt());
            }
        }catch (IOException e) {
            // logic ...
        }


    }

}