import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ LangTest.class })
public class AllTests {
	public static Test suit()
	{
		TestSuite suite = new TestSuite("All JUnit test");
		suite.addTest(new JUnit4TestAdapter(MyLang.class));
		return suite;
	}

}
