import org.junit.*;
import static org.junit.Assert.*;

public class SomethingTest {
	@Test
	public void testsSomething(){
		Something s = new Something();
		assertEquals(0, s.output(0));
		assertEquals(1, s.output(1));
	}
}