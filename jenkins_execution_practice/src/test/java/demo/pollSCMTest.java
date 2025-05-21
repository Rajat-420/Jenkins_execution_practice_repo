package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class pollSCMTest {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
		Reporter.log("pollScmTest class executed",true);
	}

}
