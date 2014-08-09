import static org.junit.Assert.*;

import hackbulgariaFiles.FileUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestFileUtils {
	
	private static final Path test = Paths.get("test.txt");

	@Before
	public void setUp() throws Exception {
		test.toFile().createNewFile();
        final String contents = "test";
        Files.write(test, contents.getBytes(Charset.defaultCharset()), StandardOpenOption.WRITE);
	}

	@After
	public void tearDown() throws Exception {
		Files.deleteIfExists(test);
	}

	@Test
    public void testReadForm() throws IOException {
        assertEquals("test", FileUtils.readFrom(test));
	}

}
