package Pages;

import Actions.UIActions.SelectType;

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

		uiAction.selectRadioButtonValue(genderRadio, gender, LocateStrategy.XPATH,
				ConditionsEnum.presenceOfElementLocated, 30);

		uiAction.type(customerFNameId, firstName, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiAction.type(customerLNameId, lastName, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiAction.type(passwdId, password, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiAction.dropDownSelect(daysId, SelectType.INDEX, daysIndex, LocateStrategy.ID,
				ConditionsEnum.presenceOfElementLocated, 30);

		uiAction.dropDownSelect(monthsId, SelectType.TEXT, month, LocateStrategy.ID,
				ConditionsEnum.presenceOfElementLocated, 30);

		uiAction.dropDownSelect(yearId, SelectType.INDEX, yearIndex, LocateStrategy.ID,
				ConditionsEnum.presenceOfElementLocated, 30);

	}

	public void addressFill(String firstName, String lastName, String address, String city, String state,
			String postalCode, String country, String phone, String alias) {

		uiAction.type(addressFNameId, firstName, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiAction.type(addressLNameId, lastName, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiAction.type(addressId, address, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiAction.type(cityId, city, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiAction.dropDownSelect(stateId, SelectType.INDEX, state, LocateStrategy.XPATH,
				ConditionsEnum.presenceOfElementLocated, 50);

		uiAction.type(postalCodeId, postalCode, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiAction.dropDownSelect(countryId, SelectType.INDEX, country, LocateStrategy.ID,
				ConditionsEnum.presenceOfElementLocated, 50);

		uiAction.type(phoneNumberId, phone, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);

		uiAction.type(addressAliasId, alias, LocateStrategy.ID, ConditionsEnum.presenceOfElementLocated, 30);
	}
}
