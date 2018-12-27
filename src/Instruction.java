import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Instruction {

    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("C:\\Users\\Karolina\\IdeaProjects\\Shelter\\Instruction.txt");
        //File inFile = new File("h:" + File.separator + "mytxtfile.txt");

        Scanner scanner = new Scanner(inFile);
        int i = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(i + ": " + line);

            i++;
        }

    }
}//is that really needed?