package november16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pradeepkumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Namachivayam");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("intern");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("50,000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9442455958");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aaa@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Punitha Namachivayam");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.361,KPK street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("valapandhal");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("ranipet");
		Select drpstate = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		drpstate.selectByVisibleText("Florida");
		Select drpcountry = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		drpcountry.selectByVisibleText("India");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("632318");
        driver.findElement(By.className("smallSubmit")).click();

	}

}
