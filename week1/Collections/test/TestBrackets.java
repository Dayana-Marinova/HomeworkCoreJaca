import static org.junit.Assert.*;
import hackbulgariaCollections.Brackets;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestBrackets {

	private Brackets test = new Brackets();
    
	@Before
    public void setUp() throws Exception {
        this.test = new Brackets();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        assertTrue(test.bracketsCorrect("()()"));
        assertFalse(test.bracketsCorrect(")()"));
        assertFalse(test.bracketsCorrect(")()("));
        assertFalse(test.bracketsCorrect(")()()"));
        assertFalse(test.bracketsCorrect("()()("));
        assertFalse(test.bracketsCorrect("())()()("));
        assertTrue(test.bracketsCorrect("()()()()("));
        assertFalse(test.bracketsCorrect("())))()()()("));
        assertTrue(test.bracketsCorrect("()()(()("));
    }

}
