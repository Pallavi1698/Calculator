
package Calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment1 {

	private int num1;
	private int num2;


	@BeforeTest
	public void setup() {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.calculator.net/");
	}

	@Test(priority = 1)
	public void Multiplication() {
		num1 = 423;
		num2 = 525;
		int result = num1 * num2;
		System.out.println(result + "result is");
		Assert.assertEquals(222075, result);
	}

	@Test(priority = 2)
	public void division() {
		num1 = 4000;
		num2 = 200;
		int result = num1 / num2;
		System.out.println("Result is :" + result);

		Assert.assertEquals(20, result);
	}

	@Test(priority = 3)
	public void Addition() {
		num1 = (-234234);
		num2 = 345354;
		int result = num1 + num2;
		System.out.println("Result is :" + result);

		Assert.assertEquals(111120, result);
	}

	@Test(priority = 4)
	public void Substraction()

	{
		num1 = (234823);
		num2 = (-23094823);
		int result = num1 - num2;
		System.out.println("Result is :" + result);

		Assert.assertEquals(23329646, result);

	}

}
