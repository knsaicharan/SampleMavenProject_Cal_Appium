package com.sample.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sample.core.Driver;



public class LoginPage extends Driver{
	@CacheLookup
	@FindBy(id = "com.android.calculator2:id/digit_9")
	public
	WebElement digit9;

	@CacheLookup
	@FindBy(id = "com.android.calculator2:id/op_add")
	public WebElement add;

	@CacheLookup
	@FindBy(id = "com.android.calculator2:id/digit_1")
	public WebElement digit1;

	@CacheLookup
	@FindBy(id = "com.android.calculator2:id/eq")
	public WebElement btneql;

	@CacheLookup
	@FindBy(id = "com.android.calculator2:id/result")
	public WebElement result;




	public LoginPage() throws Exception {
		super();
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}







}
