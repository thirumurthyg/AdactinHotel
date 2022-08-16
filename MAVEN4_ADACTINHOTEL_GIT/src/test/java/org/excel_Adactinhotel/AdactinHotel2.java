package org.excel_Adactinhotel;

import org.openqa.selenium.WebElement;

public class AdactinHotel2 {

	public static void main(String[] args) {
		
		BaseClass baseclass = new BaseClass();		
		baseclass.getdriver();		
		
		baseclass.getUrl("https://adactinhotelapp.com/");
		baseclass.maximaizeWindows();
		
		WebElement element = baseclass.findElementId("username");
		baseclass.sendKeysexcel(element, "thirufrns");
	
		WebElement element2 = baseclass.findElementId("password");
		baseclass.sendKeysexcel(element2, "thiru@123");
		
		WebElement element3 = baseclass.findelementXpath("//input[@id='login']");
		baseclass.btnclick(element3);
		
		WebElement element4 = baseclass.findElementId("location");
		baseclass.selectByIndex(element4, 3);
		
		WebElement element5 = baseclass.findelementXpath("//select[@id='hotels']");
		baseclass.selectByIndex(element5, 2);
		
		WebElement element6 = baseclass.findelementXpath("//select[@id='room_type']");
		baseclass.selectByIndex(element6, 2);
		
		WebElement element7 = baseclass.findElementId("Submit");
		//element7.click();
		baseclass.btnclick(element7);
		
		WebElement element8 = baseclass.findElementId("radiobutton_0");
		baseclass.btnclick(element8);
		
		WebElement element9 = baseclass.findElementId("continue");
		baseclass.btnclick(element9);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//baseClass.closeAllWindow();
	}

}
