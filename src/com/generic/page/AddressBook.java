package com.generic.page;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.commons.lang3.RandomUtils;

import com.generic.selector.AddressBookSelectors;
import com.generic.selector.CheckOutSelectors;
import com.generic.setup.SelTestCase;
import com.generic.setup.Common;
import com.generic.setup.LoggingMsg;
import com.generic.util.SelectorUtil;

public class AddressBook extends SelTestCase {

	public static class shippingAddress {
	
		public static class keys {
	
			public static final String isSavedShipping = "saved-shipping";
	
			public static final String countery = "countery";
			public static final String title = "title";
			public static final String lastName = "lastName";
			public static final String firstName = "firstName";
			public static final String adddressLine = "adddressLine";
			public static final String city = "city";
			public static final String zipcode = "postal";
			public static final String phone = "phone";
		}
	
		//done
		public static void selectCountery(String countery) throws Exception {
			getCurrentFunctionName(true);
			List<String> subStrArr = new ArrayList<String>();
			List<String> valuesArr = new ArrayList<String>();
			logs.debug(MessageFormat.format(LoggingMsg.SELECTING_ELEMENT_VALUE, "Countery ", countery));
			subStrArr.add(AddressBookSelectors.countery);
			valuesArr.add(countery);
			SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
			Thread.sleep(1500);
			getCurrentFunctionName(false);
	
		}
	
		//done
		public static void typeFirstName(String firstName) throws Exception {
			getCurrentFunctionName(true);
			List<String> subStrArr = new ArrayList<String>();
			List<String> valuesArr = new ArrayList<String>();
			logs.debug(MessageFormat.format(LoggingMsg.TYPING_ELEMENT_VALUE, "firstname ", firstName));
			subStrArr.add(AddressBookSelectors.firstName);
			valuesArr.add(firstName);
			SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
			getCurrentFunctionName(false);
	
		}
		
		//done
		public static void typeAddress(String address) throws Exception {
			getCurrentFunctionName(true);
			List<String> subStrArr = new ArrayList<String>();
			List<String> valuesArr = new ArrayList<String>();
			logs.debug(MessageFormat.format(LoggingMsg.TYPING_ELEMENT_VALUE, "address ", address));
			subStrArr.add(AddressBookSelectors.address);
			valuesArr.add(address);
			SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
			getCurrentFunctionName(false);
	
		}
	
		//done
		public static void typeLastName(String lastName) throws Exception {
			getCurrentFunctionName(true);
			List<String> subStrArr = new ArrayList<String>();
			List<String> valuesArr = new ArrayList<String>();
			logs.debug(MessageFormat.format(LoggingMsg.TYPING_ELEMENT_VALUE, "lastname ", lastName));
			subStrArr.add(AddressBookSelectors.lastName);
			valuesArr.add(lastName);
			SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
			getCurrentFunctionName(false);
	
		}
	
		//done
		public static void typeCity(String city) throws Exception {
			getCurrentFunctionName(true);
			List<String> subStrArr = new ArrayList<String>();
			List<String> valuesArr = new ArrayList<String>();
			logs.debug(MessageFormat.format(LoggingMsg.TYPING_ELEMENT_VALUE, "city ", city));
			subStrArr.add(AddressBookSelectors.city);
			valuesArr.add(city);
			SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
			getCurrentFunctionName(false);
	
		}
	
		//done
		public static void typeZipCode(String zip) throws Exception {
			getCurrentFunctionName(true);
			List<String> subStrArr = new ArrayList<String>();
			List<String> valuesArr = new ArrayList<String>();
			logs.debug(MessageFormat.format(LoggingMsg.TYPING_ELEMENT_VALUE, "postal", zip));
			subStrArr.add(AddressBookSelectors.zipcode);
			valuesArr.add(zip);
			SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
			getCurrentFunctionName(false);
	
		}
	
		//done
		public static void typePhone(String phone) throws Exception {
			getCurrentFunctionName(true);
			List<String> subStrArr = new ArrayList<String>();
			List<String> valuesArr = new ArrayList<String>();
			logs.debug(MessageFormat.format(LoggingMsg.TYPING_ELEMENT_VALUE, "phone", phone));
			subStrArr.add(AddressBookSelectors.phone);
			valuesArr.add(phone);
			SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
			getCurrentFunctionName(false);
	
		}
	
		//done
		public static void checkSaveAddress(boolean check) throws Exception {
			getCurrentFunctionName(true);
			List<String> subStrArr = new ArrayList<String>();
			List<String> valuesArr = new ArrayList<String>();
			logs.debug(LoggingMsg.SAVING_ADDRESS);
			subStrArr.add(AddressBookSelectors.CheckSaveAddress);
			valuesArr.add(String.valueOf(check));
			SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
			getCurrentFunctionName(false);
	
		}

		//done
		public static void typeEmailAddress(String mail) throws Exception {
			getCurrentFunctionName(true);
			List<String> subStrArr = new ArrayList<String>();
			List<String> valuesArr = new ArrayList<String>();
			subStrArr.add(AddressBookSelectors.emailAddress);
			valuesArr.add(mail);
			SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
			getCurrentFunctionName(false);
			
		}
		
		//done
		public static void selectState(String state) throws Exception {
			getCurrentFunctionName(true);
			List<String> subStrArr = new ArrayList<String>();
			List<String> valuesArr = new ArrayList<String>();
			subStrArr.add(AddressBookSelectors.state);
			valuesArr.add(state);
			SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
			getCurrentFunctionName(false);
			
		}
	
	}// shipping address

	//done
	public static void clickEditAddress() throws Exception {
		getCurrentFunctionName(true);
		List<String> subStrArr = new ArrayList<String>();
		List<String> valuesArr = new ArrayList<String>();
		logs.debug(MessageFormat.format(LoggingMsg.CLICKING_Edit_BUTTON, "edit address"));
		subStrArr.add(AddressBookSelectors.editAddress);
		valuesArr.add("");
		SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
		getCurrentFunctionName(false);

	}

	//done
	public static void clickSaveEditAddress() throws Exception {
		getCurrentFunctionName(true);
		List<String> subStrArr = new ArrayList<String>();
		List<String> valuesArr = new ArrayList<String>();
		logs.debug(MessageFormat.format(LoggingMsg.CLICKING_Edit_BUTTON, "edit address"));
		subStrArr.add(AddressBookSelectors.clickEditAddress);
		valuesArr.add("");
		SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
		getCurrentFunctionName(false);

	}

	//done
	public static String getFirstAddressDetails() throws Exception {
		getCurrentFunctionName(true);
		List<String> subStrArr = new ArrayList<String>();
		List<String> valuesArr = new ArrayList<String>();
		subStrArr.add(AddressBookSelectors.addressDetail);
		valuesArr.add("");
		SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
		logs.debug(MessageFormat.format(LoggingMsg.ADDRESS_DETAIL, SelectorUtil.textValue.get()));
		getCurrentFunctionName(false);
		return SelectorUtil.textValue.get();
	}

	
	public static String getAlertInfo() throws Exception {
		getCurrentFunctionName(true);
		List<String> subStrArr = new ArrayList<String>();
		List<String> valuesArr = new ArrayList<String>();
		Thread.sleep(500);
		subStrArr.add(AddressBookSelectors.alertInfo);
		valuesArr.add("");
		SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
		logs.debug(MessageFormat.format(LoggingMsg.DEFAULT_ADDRESS_UPDATE_MESSAGE, SelectorUtil.textValue.get()));
		getCurrentFunctionName(false);
		return SelectorUtil.textValue.get();
	}

	//done
	public static void clickAddNewAddress() throws Exception {
		getCurrentFunctionName(true);
		List<String> subStrArr = new ArrayList<String>();
		List<String> valuesArr = new ArrayList<String>();
		logs.debug(MessageFormat.format(LoggingMsg.CLICKING_ADD_ADDRESS_BUTTON, "add address"));
		subStrArr.add(AddressBookSelectors.addNewAddress);
		valuesArr.add("");
		SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
		Thread.sleep(1500);
		getCurrentFunctionName(false);
	}

	//done
	public static void updateAddress() throws Exception {
		getCurrentFunctionName(true);
		shippingAddress.typeFirstName("Accept");
		clickSave();
		getCurrentFunctionName(false);

	}
	
	public static void fillAddressForm(String mail, String Countery, String firstName,
			String lastName, String address, String city, String zip, String phone, boolean defaultAddress) throws Exception {
		shippingAddress.typeEmailAddress(mail);
		shippingAddress.typeFirstName(firstName);
		shippingAddress.typeLastName(lastName);
		shippingAddress.typeAddress(address);
		shippingAddress.typeCity(city);
		shippingAddress.typeZipCode(zip);
		shippingAddress.selectCountery(Countery);
		shippingAddress.selectState(city);
		shippingAddress.typePhone(phone);
		
		if (defaultAddress)
			checkSetAsDefaultAddress(defaultAddress);
		Thread.sleep(1000);
	}

	//done
	public static void fillAndClickSave(String mail, String Countery, String firstName,
			String lastName, String address, String city, String zip, String phone, boolean defaultAddress) throws Exception {
		getCurrentFunctionName(true);
		fillAddressForm(mail, Countery, firstName, lastName, address, city, zip, phone, defaultAddress);
		clickSave();
		getCurrentFunctionName(false);
	}
	
	//done
	public static void fillAndClickUpdate(String mail, String Countery, String firstName,
			String lastName, String address, String city, String zip, String phone, boolean defaultAddress) throws Exception {
		getCurrentFunctionName(true);
		fillAddressForm(mail, Countery, firstName, lastName, address, city, zip, phone, defaultAddress);
		clickSaveEditAddress();
		getCurrentFunctionName(false);
	}

	//done
	public static void fillAndClickSave(String mail, String Countery, String firstName, String lastName,
			String address, String city, String postal, String phone) throws Exception {
		getCurrentFunctionName(true);

		fillAndClickSave(mail, Countery,  firstName,
				lastName, address, city, postal, phone, false);

		getCurrentFunctionName(false);
	}
	
	//done
	public static void clickSave() throws Exception {
		getCurrentFunctionName(true);
		List<String> subStrArr = new ArrayList<String>();
		List<String> valuesArr = new ArrayList<String>();
		logs.debug(MessageFormat.format(LoggingMsg.CLICKING_SAVE_ADDRESS_BUTTON, "save address"));
		subStrArr.add(AddressBookSelectors.saveAddress);
		valuesArr.add("");
		SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
		getCurrentFunctionName(false);
	}
	
	//done
	public static void checkSetAsDefaultAddress(boolean check) throws Exception {
		getCurrentFunctionName(true);
		List<String> subStrArr = new ArrayList<String>();
		List<String> valuesArr = new ArrayList<String>();
		logs.debug(MessageFormat.format(LoggingMsg.CLICKING_MAKE_THIS_MY_DEFAULT_ADDRESS_CHECKBOX,
				"MAKE THIS MY DEFAULT ADDRESS"));
		subStrArr.add(AddressBookSelectors.defaultAddress);
		valuesArr.add(String.valueOf(check));
		SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
		getCurrentFunctionName(false);

	}

	//done
	public static void clickRemoveAddress() throws Exception {
		getCurrentFunctionName(true);
		List<String> subStrArr = new ArrayList<String>();
		List<String> valuesArr = new ArrayList<String>();
		logs.debug("Removing First Address");
		subStrArr.add(AddressBookSelectors.removeBtn);
		valuesArr.add("");
		SelectorUtil.initializeSelectorsAndDoActions(subStrArr, valuesArr);
		getCurrentFunctionName(false);
		
	}
}
