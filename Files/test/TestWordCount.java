import static org.junit.Assert.*;

import hackbulgariaFiles.WordCountResult;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestWordCount {

	@Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws IOException {
        Path path = Paths.get("wordCount.txt");

		assertEquals(20, WordCountResult.CharCount(path));
		assertEquals(3, WordCountResult.wordsCount(path));
		assertEquals(4, WordCountResult.LineCount(path));


    }

}
