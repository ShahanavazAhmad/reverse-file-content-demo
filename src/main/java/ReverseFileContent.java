import java.io.PrintWriter;
import java.util.Scanner;

public class ReverseFileContent {

    public void reverseFileContent(Scanner content, PrintWriter pwriter) {

        try{
            while(content.hasNextLine())
            {
                StringBuffer buffer = new StringBuffer(content.nextLine());
                buffer=buffer.reverse();
                pwriter.println(buffer.toString());
            }
            System.out.println("File contents are reversed successful!");
        } catch(Exception e){
            System.out.println("Something went wrong");
        } finally {
            content.close();
            pwriter.close();
        }
    }
}
