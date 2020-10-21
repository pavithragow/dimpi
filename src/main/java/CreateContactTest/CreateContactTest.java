package CreateContactTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContactTest {
	public void createContactWithOrg() {
		/*read the test data*/
	 String orgname="Testyantra";
	 String lastname="pavithra";
	 String organizationsearchoptions="organization name";
	 String leadsource="partner";
	 
	 // step1 launch the browser
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://localhost:8888");
	  
	  //step 2:login to application
	  driver.findElement(By.name("user_name")).sendKeys("admin");
	  driver.findElement(By.name("user_password")).sendKeys("admin");
	  driver.findElement(By.id("submitButton")).click();
	  
	  
	  //step3:navigate to organization module
	  driver.findElement(By.linkText("Organizations")).click();
	  
	  //step4:create organization
	  driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	  driver.findElement(By.name("accountname")).sendKeys(orgname);
	 WebElement induweb= driver.findElement(By.name("industry"));
	 Select s1=new Select(induweb);
	 //sel.selectByVisibleText(industry);
	 driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	 

	  // step5:navigate to contact module
	  
	  
	  // step6:click on create contact button
	  //step7:enter  the last name  and click ON ORGANIZATION LOOKUP IMAGE
	  //step8: select the created organization from new window 
	  //step9:verify
	  //step10: logout
	  
}

}
