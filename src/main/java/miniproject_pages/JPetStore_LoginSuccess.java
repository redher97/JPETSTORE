package miniproject_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author akhildarling
 * Class used to verify login Success or not
 */
public class JPetStore_LoginSuccess {
WebDriver driver;
	
	public JPetStore_LoginSuccess(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (how = How.ID , using = "WelcomeContent")
	@CacheLookup
	WebElement welcome_content;
	
	@FindBy (how = How.TAG_NAME, using = "li")
	@CacheLookup
	WebElement invalidLogin;
	
	
	
	
	/**
	 * method to verify success login
	 */
	public String getLoginSuccess() {
		String text="";
		if(welcome_content.getText()!="Welcome Akhil!")
			text = "Login Success";
		else
			text = "Login UnSuccess";
		return text;
	}
	
	public int getNumberofLinks(WebDriver driver) {
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		return (links.size());
	}

	
}
