package Pages;

import Actions.UIActions2.SelectType;

import utilities.Locaters.LocateStrategy;
import utilities.Wait.ConditionsEnum;

public class RegisterPage extends BasePage {

	public RegisterPage(String testClassName) {
		super(testClassName);
	}

	String genderRadio = "//input[@name='id_gender']";
	String customerFNameId = "customer_firstname";
	String customerLNameId = "customer_lastname";
	String passwdId = "passwd";
	String daysId = "days";
	String monthsId = "months";
	String yearId = "years";
	String addressFNameId = "firstname";
	String addressLNameId = "lastname";
	String addressId = "address1";
	String cityId = "city";
	String stateId = "//select[@id='id_state']";
	String postalCodeId = "postcode";
	String countryId = "id_country";
	String phoneNumberId = "phone_mobile";
	String addressAliasId = "alias";

	public void userRegister(String gender, String firstName, String lastName, String password, String daysIndex,
			String month, String yearIndex) {

		uiActions2.selectRadioButtonValue(genderRadio, gender, LocateStrategy.XPATH,
				ConditionsEnum.presenceOfElementLocated, 30);

		uiActions2.type(customerFNameId, firstName, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiActions2.type(customerLNameId, lastName, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiActions2.type(passwdId, password, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiActions2.dropDownSelect(daysId, SelectType.INDEX, daysIndex, LocateStrategy.ID,
				ConditionsEnum.presenceOfElementLocated, 30);

		uiActions2.dropDownSelect(monthsId, SelectType.TEXT, month, LocateStrategy.ID,
				ConditionsEnum.presenceOfElementLocated, 30);

		uiActions2.dropDownSelect(yearId, SelectType.INDEX, yearIndex, LocateStrategy.ID,
				ConditionsEnum.presenceOfElementLocated, 30);

	}

	public void addressFill(String firstName, String lastName, String address, String city, String state,
			String postalCode, String country, String phone, String alias) {

		uiActions2.type(addressFNameId, firstName, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiActions2.type(addressLNameId, lastName, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiActions2.type(addressId, address, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiActions2.type(cityId, city, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiActions2.dropDownSelect(stateId,SelectType.INDEX, state, LocateStrategy.XPATH,
				ConditionsEnum.presenceOfElementLocated, 50);

		uiActions2.type(postalCodeId, postalCode, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiActions2.dropDownSelect(countryId, SelectType.INDEX, country, LocateStrategy.ID,
				ConditionsEnum.presenceOfElementLocated, 50);

		uiActions2.type(phoneNumberId, phone, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiActions2.type(addressAliasId, alias, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);
	}
}
