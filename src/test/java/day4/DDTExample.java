package day4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExample {

	@Test(dataProvider="testdata")
	public void myTest(String username, String password) {


		System.out.println("Test1 Executed"+username+""+password);
	}
	@DataProvider(name="testdata")
	public Object[][] testDataGeneration(){
		Object [][]arr=new Object[2][2];

		arr[0][0]="Selenium";
		arr[0][1]="Grid";
		arr[1][0]="IDE";
		arr[1][1]="RC";

		return arr;

	}
}
