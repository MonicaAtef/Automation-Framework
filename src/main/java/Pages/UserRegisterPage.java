package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserRegisterPage extends PageBase {

	

	public UserRegisterPage(WebDriver ldriver) {
		super(ldriver);
	}

	@FindBy(id="id_gender1") 
	WebElement MrRadioBtn;

	@FindBy(id="id_gender2") 
	WebElement MrsRadioBtn ;

	@FindBy(id="customer_firstname") 
	WebElement firstNameTxt;

	@FindBy(id="customer_lastname") 
	WebElement lastNameTxt;

	@FindBy(id="passwd") 
	WebElement passwordTxt;

	@FindBy(id="days") 
	WebElement daysDropDownList;

	@FindBy(id="months") 
	WebElement monthsDropDownList;

	@FindBy(id="years") 
	WebElement yearsDropDownList;

	@FindBy(id="optin") 
	WebElement optionCheckBox;

	@FindBy(id="firstname") 
	WebElement fisrstNameAddressTxt;

	@FindBy(id="lastname") 
	WebElement lastNameAddressTxt;

	@FindBy(id="address1") 
	WebElement addressTxt;

	@FindBy(id="city") 
	WebElement cityTxt;

	@FindBy(id="id_state") 
	WebElement stateDropDownList;

	@FindBy(id="postcode") 
	WebElement postCodeTxt;

	@FindBy(id="id_country") 
	WebElement countryDropDownList;

	@FindBy(id="phone_mobile") 
	WebElement phoneNumberTxt;

	@FindBy(id="alias") 
	WebElement aliasAddressTxt;
	
	@FindBy(id="submitAccount") 
	WebElement sumbitBtn;

	public void fillUserInfo(String firstName ,String lastName,String password,int daysIndex,
			int monthIndex,int yearsIndex) {

		
		MrsRadioBtn.click();
		
		firstNameTxt.sendKeys(firstName);
		
		lastNameTxt.sendKeys(lastName);
		
		passwordTxt.sendKeys(password);
		
		Select daysSelection = new Select(daysDropDownList);
		daysSelection.selectByIndex(daysIndex);
		
		Select monthsSelection = new Select(monthsDropDownList);
		monthsSelection.selectByIndex(monthIndex);
		
		Select yearsSelection = new Select(yearsDropDownList);
		yearsSelection.selectByIndex(yearsIndex);
		
		optionCheckBox.click();
		

	}
	public void fillUserAddressInfo(String fisrstNameAddress,String lastNameAddress ,
			String address,String city,int stateIndex,String postCode,int countryIndex,String phoneNumber,
			String aliasAddress)
	{
		fisrstNameAddressTxt.sendKeys(fisrstNameAddress);
		
		lastNameAddressTxt.sendKeys(lastNameAddress);
		
		addressTxt.sendKeys(address);
		
		cityTxt.sendKeys(city);
		
		Select statesSelection = new Select(stateDropDownList);
		statesSelection.selectByIndex(stateIndex);
		
		postCodeTxt.sendKeys(postCode);
		
		Select countriesSelection = new Select(countryDropDownList);
		countriesSelection.selectByIndex(countryIndex);
		
		phoneNumberTxt.sendKeys(phoneNumber);
		
		aliasAddressTxt.sendKeys(aliasAddress);
		
		sumbitBtn.click();
	}

}
