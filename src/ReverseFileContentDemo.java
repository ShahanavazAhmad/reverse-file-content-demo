import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReverseFileContentDemo {

    public static void main(String[] args) {

        try{
            File sourceFile=new File("sourceFile.txt");
            Scanner content=new Scanner(sourceFile);
            PrintWriter pwriter =new PrintWriter("reverseFile.txt");

            while(content.hasNextLine())
            {
//                String s=content.nextLine();
                StringBuffer buffer = new StringBuffer(content.nextLine());
                buffer=buffer.reverse();
//                String rs=buffer.toString();
                pwriter.println(buffer.toString());
            }
            content.close();
            pwriter.close();
            System.out.println("File is copied successful!");
        }

        catch(Exception e){
            System.out.println("Something went wrong");
        }


    }
}
