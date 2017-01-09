import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(expected, output);
	}
	@Test
	public void testsNameWithTwoSpaces(){
		Person p = new Person();
		String input = "John  Smith";
		String output = p.getInitials(input);
		String expected = "JS";
		assertEquals(expected, output);
	}
}
