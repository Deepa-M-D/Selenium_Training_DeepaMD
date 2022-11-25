package reportgeneration;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	public void login() {
		AssertJUnit.assertTrue(true);
		System.out.println("Login Done");
		Reporter.log("Login Done",true);
	}

	@Test(dependsOnMethods = "login")
	public void logOutFromApplication() {
		System.out.println("Logout Done");
	}
}
