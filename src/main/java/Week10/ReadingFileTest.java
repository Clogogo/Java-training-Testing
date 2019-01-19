package Week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileTest {
    public void readFiles() throws IOException {

        StringBuilder stringBuilder = new StringBuilder();

        File file = new File("        C:\\Users\\Chistyle\\IdeaProjects\\Java Training\\src\\Main\\Java\\Week9\\outputFile.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            stringBuilder.append(line);
            stringBuilder.append("\n");
            line = bufferedReader.readLine();
        }
    }


    public static void main(String[] args) throws IOException {
        ReadingFileTest readingFileTest = new ReadingFileTest();
        readingFileTest.readFiles();
    }
}
