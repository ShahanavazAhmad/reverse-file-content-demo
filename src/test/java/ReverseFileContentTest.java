import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseFileContentTest {

    @TempDir
    File folder;

    @TempDir
    File folder2;

    ReverseFileContent fileContent = new ReverseFileContent();

    @Test
    public void myTest() throws IOException {

        Scanner content = null;
        List<String> lines = Arrays.asList("This", "is", "HSBC");
        List<String> revertedLines = Arrays.asList("sihT", "si", "CBSH");

        File input = new File(folder, "input.txt");
        Files.write(input.toPath(), lines);

        File testReverseOutput = new File(folder2, "testReverseOutput.txt");
        content=new Scanner(input);
        PrintWriter pwriter =new PrintWriter(testReverseOutput);

        // call actual method to test the reverse of the file contents
        fileContent.reverseFileContent(content, pwriter);

        Assertions.assertAll(
                () -> Assertions.assertTrue(Files.exists(input.toPath())),
                () -> Assertions.assertLinesMatch(revertedLines, Files.readAllLines(testReverseOutput.toPath()))
        );
    }
}
