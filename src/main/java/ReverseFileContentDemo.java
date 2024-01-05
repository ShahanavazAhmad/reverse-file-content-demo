import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReverseFileContentDemo {
    public static void main(String[] args) {

        // read from input file: "input.txt"
        File sourceFile=new File("input.txt");
        Scanner content = null;
        PrintWriter pwriter = null;
        try {
            content=new Scanner(sourceFile);
            // write the reversed file contents in output file : "output.txt"
            pwriter =new PrintWriter("output.txt");
            ReverseFileContent fileContent = new ReverseFileContent();

            // call the method to reverse the contents of the file.
            fileContent.reverseFileContent(content, pwriter);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
