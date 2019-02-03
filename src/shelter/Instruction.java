package shelter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Instruction {

    private String instructionContent = "";

    public String getInstructionContent(){ return instructionContent; }

    public Instruction()
    {
        File inFile;
        try {
            inFile = new File( "Instruction.txt");
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        if (inFile.canRead()) {
            Scanner scanner;

            try {
                scanner = new Scanner(inFile);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                return;
            }

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                this.instructionContent += line + "\n";
            }
        }
    }
}