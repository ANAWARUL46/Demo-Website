package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BNSsignUpPage {
	@FindBy(xpath="//*[@id=\"FN\"]")
	WebElement firstname;
	public void enterFirstName(String FN) {
		firstname.sendKeys(FN);
		
	}
	@FindBy(xpath="//*[@id=\"LN\"]")
	WebElement lastname;
	public void enterLastName(String LN) {
		lastname.sendKeys(LN);
	}	
	@FindBy(xpath="//*[@id=\"EM\"]")
	WebElement email;
	public void enterEmail(String EM) {
		email.sendKeys(EM);
	}
	@FindBy(xpath="//*[@id=\"PW\"]")
	WebElement password;
	public void enterPassword(String PW) {
		password.sendKeys(PW);
	}
	@FindBy(xpath="//*[@id=\"PH\"]")
	WebElement phone;
	public void enterPhone(String PH) {
		phone.sendKeys(PH);
	}
	@FindBy(xpath="/html/body/div/div[2]/form/select[1]")
	WebElement month;
	public void selectMonth(String MN) {
		Select monthselect=new Select (month);
		monthselect.selectByVisibleText(MN);
	}
	@FindBy(xpath="/html/body/div/div[2]/form/select[2]")
	WebElement day;
	public void selectDay(String DY) {
		Select dayselect=new Select (day);
		dayselect.selectByVisibleText(DY);
	}
	@FindBy(xpath="/html/body/div/div[2]/form/select[3]")
	WebElement year;
	public void selectYear(String YR) {
		Select yearselect=new Select (year);
		yearselect.selectByVisibleText(YR);
	}
	@FindBy(xpath="/html/body/div/div[2]/form/input[6]")
	WebElement male;
	public void clickOnMale(String GN) {
		male.click();
	}
	@FindBy(xpath="/html/body/div/div[2]/form/input[8]")
	WebElement submit;
	public void clickOnSubmit() throws InterruptedException {
		submit.submit();
		
	}
	@FindBy(xpath="//*[contains(text(), 'Submitted')]")
	WebElement textMessage;
	public void verifyText(String message) throws InterruptedException {
		String actualMessage=textMessage.getText();
		Assert.assertEquals(actualMessage, message);
		
	}
	

}
