package Week10;

import org.junit.Test;

import java.io.IOException;

public class ReadingFileTestTest {

    @Test(expected = IOException.class)
    public void testReadingFileError() throws IOException {

        //given
        ReadingFileTest readingFileTest = new ReadingFileTest();
        String filePath = "C:\\Users\\Chistyle\\IdeaProjects\\Java Training\\src\\Main\\Java\\Week9\\outputFile.txt";

        //when
        readingFileTest.readFiles();

        //then
    }

}