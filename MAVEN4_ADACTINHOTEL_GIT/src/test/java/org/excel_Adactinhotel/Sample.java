package org.excel_Adactinhotel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Sample {

	public static void main(String[] args) throws IOException {
		BaseClass baseclass = new BaseClass();

		WebElement ccno = baseclass.findElementId("cc_num");
		System.out.println(ccno);
		
	}

}
