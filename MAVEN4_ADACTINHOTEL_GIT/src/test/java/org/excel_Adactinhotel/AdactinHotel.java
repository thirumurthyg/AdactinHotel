package org.excel_Adactinhotel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinHotel {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseClass baseclass = new BaseClass();
		baseclass.getdriver();

		baseclass.getUrl("https://adactinhotelapp.com/");
		baseclass.maximaizeWindows();

		WebElement username = baseclass.findElementId("username");
		String dataFromExcel = baseclass.getDataFromExcel1("Sheet1", 1, 0);
		baseclass.sendKeysexcel(username, dataFromExcel);

		WebElement password = baseclass.findElementId("password");
		String dataFromExcel2 = baseclass.getDataFromExcel1("Sheet1", 1, 1);
		baseclass.sendKeysexcel(password, dataFromExcel2);

		WebElement btn = baseclass.findelementXpath("//input[@id='login']");
		baseclass.btnclick(btn);

		WebElement location = baseclass.findElementId("location");
		String dataFromExcel3 = baseclass.getDataFromExcel1("Sheet1", 1, 5);
		baseclass.sendKeysexcel(location, dataFromExcel3);

		WebElement hotel = baseclass.findelementXpath("//select[@id='hotels']");
		String dataFromExcel4 = baseclass.getDataFromExcel1("Sheet1", 1, 6);
		baseclass.sendKeysexcel(hotel, dataFromExcel4);

		WebElement roomtype = baseclass.findelementXpath("//select[@id='room_type']");
		String dataFromExcel5 = baseclass.getDataFromExcel1("Sheet1", 1, 7);
		baseclass.sendKeysexcel(roomtype, dataFromExcel5);

		WebElement roomno = baseclass.findElementId("room_nos");
		baseclass.sendKeysexcel(roomno, "One");

		WebElement checkin = baseclass.findElementId("datepick_in");
		baseclass.textClear(checkin);
		String dataFromExcel6 = baseclass.getDataFromExcel1("Sheet1", 1, 9);
		baseclass.sendKeysexcel(checkin, dataFromExcel6);

		WebElement checkout = baseclass.findElementId("datepick_out");
		baseclass.textClear(checkout);
		String dataFromExcel7 = baseclass.getDataFromExcel1("Sheet1", 1, 10);
		baseclass.sendKeysexcel(checkout, dataFromExcel7);

		WebElement submit = baseclass.findElementId("Submit");
		baseclass.btnclick(submit);

		WebElement radbtn = baseclass.findElementId("radiobutton_0");
		baseclass.btnclick(radbtn);

		WebElement continu = baseclass.findElementId("continue");
		baseclass.btnclick(continu);

		WebElement firstnam = baseclass.findElementId("first_name");
		String dataFromExcel8 = baseclass.getDataFromExcel1("Sheet1", 1, 2);
		baseclass.sendKeysexcel(firstnam, dataFromExcel8);
		
		WebElement lastnam = baseclass.findElementId("last_name");
		String dataFromExcel9 = baseclass.getDataFromExcel1("Sheet1", 1, 3);
		baseclass.sendKeysexcel(lastnam, dataFromExcel9);
		
		WebElement addres = baseclass.findElementId("address");
		String dataFromExcel10 = baseclass.getDataFromExcel1("Sheet1", 1, 4);
		baseclass.sendKeysexcel(addres, dataFromExcel10);
				
		WebElement ccno = baseclass.findelementXpath("//input[@id=\"cc_num\"]");
		String dataFromExcel11 = baseclass.getDataFromExcel1("Sheet1", 1, 13);
		System.out.println(dataFromExcel11);
		baseclass.sendKeysexcel(ccno, dataFromExcel11);
		
		WebElement cctype = baseclass.findElementId("cc_type");
		String dataFromExcel12 = baseclass.getDataFromExcel1("Sheet1", 1, 14);
		baseclass.sendKeysexcel(cctype, dataFromExcel12);
		
		WebElement ccexp = baseclass.findElementId("cc_exp_month");
		String dataFromExcel13 = baseclass.getDataFromExcel1("Sheet1", 1, 15);
		baseclass.sendKeysexcel(ccexp, dataFromExcel13);
		
		WebElement expyear = baseclass.findElementId("cc_exp_year");
		String dataFromExcel14 = baseclass.getDataFromExcel1("Sheet1", 1, 16);
		baseclass.sendKeysexcel(expyear, dataFromExcel14);
		
		WebElement cvv = baseclass.findElementId("cc_cvv");
		String dataFromExcel15 = baseclass.getDataFromExcel1("Sheet1", 1, 17);
		baseclass.sendKeysexcel(cvv, dataFromExcel15);
		
		WebElement btnBooknow = baseclass.findElementId("book_now");
		baseclass.btnclick(btnBooknow);
		
//	Thread.sleep(5000);
//	baseclass.ge

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		Thread.sleep(10000);
//		baseclass.closeAllWindow();
	}

}
