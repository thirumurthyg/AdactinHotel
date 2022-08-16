package org.excel_Adactinhotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;


	public WebDriver getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public WebElement sendKeysexcel(WebElement element, String key) {
		element.sendKeys(key);
		return element;
	}
	public void textClear(WebElement element) {
		element.clear();
	}
	public String getDataFromExcel1(String sheetname, int rowIndex, int cellIndex) throws IOException {
		String res=null;
		
		File file = new File("C:\\Users\\THIRU\\eclipse-workspace\\MAVEN4_ADACTINHOTEL\\Excel\\Book1.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowIndex);
		Cell cell=row.getCell(cellIndex);
		CellType cellType = cell.getCellType();
		
		switch (cellType) {
		case STRING:
			 res= cell.getStringCellValue();			
			break;
			
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				double numericCellValue = cell.getNumericCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
				res = dateFormat.format(numericCellValue);
			} else {
				double d = cell.getNumericCellValue();
				long l = Math.round(d);
				if (l==d) {
					res=String.valueOf(l);
				} else {
						res= String.valueOf(d);
				}
			}			
			break;	

		default:
			break;
		}
		return res;
	}	

	public String getDataFromExcel(String sheetname, int rowIndex, int cellIndex) throws IOException {
		String res=null;
		
		File file = new File("C:\\Users\\THIRU\\eclipse-workspace\\MAVEN4_ADACTINHOTEL\\Excel\\Book1.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowIndex);
		Cell cell=row.getCell(cellIndex);
		CellType cellType = cell.getCellType();
		
		switch (cellType) {
		case STRING:
			 res= cell.getStringCellValue();			
			break;
			
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				double numericCellValue = cell.getNumericCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
				res = dateFormat.format(numericCellValue);
			} else {
				double d = cell.getNumericCellValue();
				BigDecimal bigDecimal = BigDecimal.valueOf(d);
				res= bigDecimal.toString();
			}			
			break;	

		default:
			break;
		}
		return res;
	}	
	public void getUrl(String url) {
		driver.get(url);
	}

	public String getTitle1() {
		String title = driver.getTitle();
		return title;
	}


	public void btnclick(WebElement element) {
		element.click();
	}
//	
//	public void getAttributeValue() {
//		WebElement element
//		
//	}

	public WebElement findElementId(String id) {
		WebElement element = driver.findElement(By.name(id));
		return element;
	}
	public WebElement findElementName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public WebElement findElementClassName(String className) {
		WebElement element = driver.findElement(By.className(className));
		return element;
	}

	public WebElement findelementXpath(String xpathlocator) {
		WebElement element = driver.findElement(By.xpath(xpathlocator));
		return element;
	}
	public WebElement insertTextBox(String cssSelector) {
		WebElement element = driver.findElement(By.cssSelector(cssSelector));
		element.sendKeys("");
		return element;
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public void closeWindow() {
		driver.close();
	}
	public void closeAllWindow() {
		driver.quit();
	}
	public Alert cancelAlerts() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	public Alert acceptAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	}

	public WebDriver switchFrame() {
		WebDriver frame = driver.switchTo().frame(0);
		return frame;
	}

	public void maximaizeWindows() {
		Window window = driver.manage().window();
		window.maximize();// only input not any output
	}

	public String textfromWebpage(String id) {
		WebElement element = driver.findElement(By.id(id));
		String text = element.getText();
		return text;
	}

	public String getEnteredUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public String getPageSource() {
		String source = driver.getPageSource();
		return source;
	}

	public int hashCode() {
		int hashCode = driver.hashCode();
		return hashCode;
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public String windowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	// 20
	public WebDriver swithchParentFrame() {

		WebDriver parentFrame = driver.switchTo().parentFrame();
		return parentFrame;
	}

	public Actions clickAndHold() {
		Actions actions = new Actions(driver);
		Actions hold = actions.clickAndHold();
		return hold;
	}

	public Actions contextClick() {
		Actions actions = new Actions(driver);
		Actions click = actions.contextClick();
		return click;
	}

	public Actions dragAndDrop(WebElement source, WebElement destination) {
		Actions actions = new Actions(driver);
		Actions dragAndDrop = actions.dragAndDrop(source,destination);
		return dragAndDrop;
	}

	public boolean actions1() {
		Actions actions = new Actions(driver);
		boolean equals = actions.build().equals(driver);
		return equals;
	}

	public boolean equals() {
		boolean equals = driver.equals(getTitle1());
		return equals;
	}

	public String toString() {
		String string = driver.toString();
		return string;
	}

	public WebElement selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		return element;
		

	}

	public List allSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public int size2AllSelectedOptions(WebElement element, int size) {

		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		int size2 = allSelectedOptions.size();
		return size2;

	}
	public boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

}
