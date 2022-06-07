package pages;

import actions.UIActions.SelectType;

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

	private void selectGenderRadioButton(String gender) {
		uiAction.selectRadioButtonValue(genderRadio, gender, LocateStrategy.XPATH,
				ConditionsEnum.CLICKBLE, 30);
	}

	private void enterFirstName(String firstName) {
		uiAction.type(customerFNameId, firstName, LocateStrategy.ID, ConditionsEnum.VISIBLE, 30);

	}

	private void enterlastName(String lastName) {
		uiAction.type(customerLNameId, lastName, LocateStrategy.ID, ConditionsEnum.VISIBLE, 30);
	}

	private void enterPassword(String password) {
		uiAction.type(passwdId, password, LocateStrategy.ID, ConditionsEnum.PRESENCE, 30);
	}

	private void selectDaysDropDownList(String daysIndex) {
		uiAction.dropDownSelect(daysId, SelectType.INDEX, daysIndex, LocateStrategy.ID,
				ConditionsEnum.PRESENCE, 30);
	}

	private void selectMonthsDropDownList(String month) {
		uiAction.dropDownSelect(monthsId, SelectType.TEXT, month, LocateStrategy.ID,
				ConditionsEnum.PRESENCE, 30);
	}

	private void selectYearDropDownList(String yearIndex) {
		uiAction.dropDownSelect(yearId, SelectType.INDEX, yearIndex, LocateStrategy.ID,
				ConditionsEnum.PRESENCE, 30);
	}

	public void userRegister(String gender, String firstName, String lastName, String password, String daysIndex,
			String month, String yearIndex) {

		selectGenderRadioButton(gender);
		enterFirstName(firstName);
		enterlastName(lastName);
		enterPassword(password);
		selectDaysDropDownList(daysIndex);
		selectMonthsDropDownList(month);
		selectYearDropDownList(yearIndex);

	}

	private void enterAddressFirstName(String firstName) {
		uiAction.type(addressFNameId, firstName, LocateStrategy.ID, ConditionsEnum.PRESENCE, 30);

	}

	private void enterAddressLastName(String lastName) {
		uiAction.type(addressLNameId, lastName, LocateStrategy.ID, ConditionsEnum.PRESENCE, 30);

	}

	private void enterAddress(String address) {

		uiAction.type(addressId, address, LocateStrategy.ID, ConditionsEnum.PRESENCE, 30);

	}

	private void enterCity(String city) {
		uiAction.type(cityId, city, LocateStrategy.ID, ConditionsEnum.PRESENCE, 30);
	}

	private void selectState(String state) {
		uiAction.dropDownSelect(stateId, SelectType.INDEX, state, LocateStrategy.XPATH,
				ConditionsEnum.PRESENCE, 50);
	}

	private void enterPostalCode(String postalCode) {
		uiAction.type(postalCodeId, postalCode, LocateStrategy.ID, ConditionsEnum.PRESENCE, 30);

	}

	private void selectCountry(String country) {
		uiAction.dropDownSelect(countryId, SelectType.INDEX, country, LocateStrategy.ID,
				ConditionsEnum.PRESENCE, 50);
	}

	private void enterPhoneNumber(String phone) {
		uiAction.type(phoneNumberId, phone, LocateStrategy.ID, ConditionsEnum.PRESENCE, 30);
	}

	private void enterAddressAlias(String alias) {

		uiAction.type(addressAliasId, alias, LocateStrategy.ID, ConditionsEnum.PRESENCE, 30);
	}

	public void addressFill(String firstName, String lastName, String address, String city, String state,
			String postalCode, String country, String phone, String alias) {

		enterAddressFirstName(firstName);
		enterAddressLastName(lastName);
		enterAddress(address);
		enterCity(city);
		selectState(state);
		enterPostalCode(postalCode);
		selectCountry(country);
		enterPhoneNumber(phone);
		enterAddressAlias(alias);

	}
}
