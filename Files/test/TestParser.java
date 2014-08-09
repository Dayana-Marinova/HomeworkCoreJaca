import static org.junit.Assert.*;

import hackbulgariaFiles.Parser;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestParser {

	private static final Path test = Paths.get("test.properties");
    ArrayList<String> list;
    Map<String, String> map;
    Parser tests = new Parser();

    
    @Before
    public void setUp() throws Exception {
        list = new ArrayList<>((Arrays.asList("# this=comment", "a1=b1", "a2 =b2", "a3    =    b3", "    a4 = b4",
                "a5=b6=b7=b8", "a6=b9 #comment", "a7==b10")));

        map = new HashMap<String, String>();
        map.put("a1", "b1");
        map.put("a2", "b2");
        map.put("a3", "    b3");
        map.put("a4", " b4");
        map.put("a5", "b6=b7=b8");
        map.put("a6", "b9 #comment");
        map.put("a7", "=b10");

        test.toFile().createNewFile();
        final String contents = "# this=comment" + System.lineSeparator() + "a1=b1" + System.lineSeparator() + "a2 =b2"
                + System.lineSeparator() + "a3    =    b3" + System.lineSeparator() + "   a4 = b4"
                + System.lineSeparator() + "a5=b6=b7=b8" + System.lineSeparator() + "a6=b9 #comment"
                + System.lineSeparator() + "a7==b10";
        Files.write(test, contents.getBytes(Charset.defaultCharset()), StandardOpenOption.WRITE);

    }

    @After
    public void tearDown() throws Exception {
        Files.deleteIfExists(test);
    }

    @Test
    public void testParseProperties() throws IOException {
        assertEquals(map, Parser.parser(test.toFile()));
    }

}
