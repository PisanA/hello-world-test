import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.After;

import java.io.*;
import java.util.Locale;

public class HelloWorldTest {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
    	System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@Test
	public void testMainMethod() {
    	HelloWorld.main(new String[] {"arg1", "arg2", "arg3"});
        
    	Assert.assertEquals("The main() method should print out \"Hello, World!\" \nCheck carefully!" 
			    + "One missing/extra character like a space can fail this test case\n"
			    ,"Hello, World!", outputStreamCaptor.toString());
	}
	
	
	@After
	public void tearDown() {
    	System.setOut(standardOut);
	}
}
