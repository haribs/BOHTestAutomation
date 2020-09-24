package AUT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.BrowserUtil;
import utilities.ElementsUtil;
import utilities.WaitUtil;

public class CRRTest {

	public static void main(String[] args) {

		BrowserUtil browserUtil = new BrowserUtil();
		WebDriver driver = browserUtil.initilize_Driver("chrome");
		WaitUtil waitUtil = new WaitUtil(driver);
		ElementsUtil elementsUtil = new ElementsUtil(driver);
		browserUtil.launchURL("http://dev-crr.bankofhope.com/");

		By btnAddNewCRR = By.xpath("//a[@class='btn crr-bg2']");
		
		waitUtil.waitForElementToBeClickable(btnAddNewCRR, 10).click();

		// Customer Tab
		By customerName = By.xpath("//input[@name='customerName']");
		
		By ddClickCustomerType = By.xpath("(//div[@class='c-btn'])[1]");
		By ddListCustomerTypes = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickCustomerStatus = By.xpath("(//div[@class='c-btn'])[2]");
		By ddListCustomerStatus = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickIDNumberType = By.xpath("(//div[@class='c-btn'])[3]");
		By ddListIDNumberType = By.xpath("//ul[@class='lazyContainer']/li");

		By idNumber = By.xpath("//input[@name='identificationNumber']");

		By ddClickIsCustomerPEP = By.xpath("(//div[@class='c-btn'])[4]");
		By ddListIsCustomerPEP = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickIsCustomerImpEXP = By.xpath("(//div[@class='c-btn'])[5]");
		By ddListIsCustomerImpEXP = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickDoesCustomerChkSer = By.xpath("(//div[@class='c-btn'])[6]");
		By ddListDoesCustomerChkSer = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickIsCustomerATMOpt = By.xpath("(//div[@class='c-btn'])[7]");
		By ddListIsCustomerATMOpt = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickIsCustomerSCC = By.xpath("(//div[@class='c-btn'])[8]");
		By ddListIsCustomerSCC = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickIsCustomerSCCCode = By.xpath("(//div[@class='c-btn'])[9]");
		By ddListIsCustomerSCCCode = By.xpath("//ul[@class='lazyContainer']/li");
		By ddCloseCustomerSCCCode = By.xpath("//div[@class='c-list']");

		By ddClickCitizenship = By.xpath("(//div[@class='c-btn'])[10]");
		By ddListCitizenship = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickIsGC = By.xpath("(//div[@class='c-btn'])[11]");
		By ddListIsGC = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickOccupation = By.xpath("(//div[@class='c-btn'])[12]");
		By ddListOccupation = By.xpath("//ul[@class='lazyContainer']/li");

		By nextButtonCustomer = By.xpath("(//button[@type='button'])[2]");

		waitUtil.waitForElementToBePresent(customerName, 20).sendKeys("Brian Lee");
		elementsUtil.selectAnOptionInDropDown(ddClickCustomerType, ddListCustomerTypes, "personal");
		elementsUtil.selectAnOptionInDropDown(ddClickCustomerStatus, ddListCustomerStatus, "new");
		elementsUtil.selectAnOptionInDropDown(ddClickIDNumberType, ddListIDNumberType, "Passport (for NRA only)");
		elementsUtil.doSendKeys(idNumber, "P0973759436");
		elementsUtil.selectAnOptionInDropDown(ddClickIsCustomerPEP, ddListIsCustomerPEP, "yes");
		elementsUtil.selectAnOptionInDropDown(ddClickIsCustomerImpEXP, ddListIsCustomerImpEXP, "yes");
		elementsUtil.selectAnOptionInDropDown(ddClickDoesCustomerChkSer, ddListDoesCustomerChkSer, "yes");
		elementsUtil.selectAnOptionInDropDown(ddClickIsCustomerATMOpt, ddListIsCustomerATMOpt, "yes");
		elementsUtil.selectAnOptionInDropDown(ddClickIsCustomerSCC, ddListIsCustomerSCC, "yes");

		browserUtil.doScrollPageToEnd();
		elementsUtil.selectingMultipleOptionsInDropDown(ddClickIsCustomerSCCCode, ddListIsCustomerSCCCode,
				"SCC03 - International NGO, Charity or Church", "SCC05 - Tobacco or Vape Shops");
		elementsUtil.doClick(ddCloseCustomerSCCCode);

		elementsUtil.selectAnOptionInDropDown(ddClickCitizenship, ddListCitizenship, "india (IN)");
		elementsUtil.selectAnOptionInDropDown(ddClickIsGC, ddListIsGC, "yes");
		elementsUtil.selectAnOptionInDropDown(ddClickOccupation, ddListOccupation, "P7002 - Owner of Travel Agency");
		elementsUtil.doClick(nextButtonCustomer);

		// Products & Services Tab
		By ddClickProductType = By.xpath("(//div[@class='c-btn'])[13]");
		By ddListProductType = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickProducts = By.xpath("(//div[@class='c-btn'])[14]");
		By ddListProducts = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickServices = By.xpath("(//div[@class='c-btn'])[15]");
		By ddListServices = By.xpath("//ul[@class='lazyContainer']/li");

		By nextButtonPrdSer = By.xpath("(//button[@type='button'])[4]");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		elementsUtil.selectingMultipleOptionsInDropDown(ddClickProductType, ddListProductType, "Adjustable Rate",
				"HETL", "HELOC");
		elementsUtil.doClick(ddClickProductType);
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		elementsUtil.selectingMultipleOptionsInDropDown(ddClickProducts, ddListProducts, "13 - Home Equity Loans",
				"10 - Mortgage Loan-Purchased-ARM", "54 - Purchased Home Mtg Loan ARM");
		elementsUtil.doClick(ddClickProducts);
		elementsUtil.selectingMultipleOptionsInDropDown(ddClickServices, ddListServices, "Online Bill Pay",
				"Safe Deposit Box");
		elementsUtil.doClick(ddClickServices);
		elementsUtil.doClick(nextButtonPrdSer);

		// Delivery Channel Tab
		By ddClickDelChl = By.xpath("(//div[@class='c-btn'])[16]");
		By ddListDelChl = By.xpath("//ul[@class='lazyContainer']/li");

		By nextButtonDelChl = By.xpath("(//button[@type='button'])[6]");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		elementsUtil.selectAnOptionInDropDown(ddClickDelChl, ddListDelChl, "face to face");
		elementsUtil.doClick(nextButtonDelChl);
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);

		// Length of Relationship
		By ddClickLenRel = By.xpath("(//div[@class='c-btn'])[17]");
		By ddListLenRel = By.xpath("//ul[@class='lazyContainer']/li");

		By nextButtonLenRel = By.xpath("(//button[@type='button'])[8]");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		elementsUtil.selectAnOptionInDropDown(ddClickLenRel, ddListLenRel, "Greater than 2 years");
		elementsUtil.doClick(nextButtonLenRel);
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		
		// Geography
		By ddClickPriAddcty = By.xpath("(//div[@class='c-btn'])[18]");
		By ddListPriAddcty = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickMailAddcty = By.xpath("(//div[@class='c-btn'])[19]");
		By ddListMailAddcty = By.xpath("//ul[@class='lazyContainer']/li");

		By nextButtonGeo = By.xpath("(//button[@type='button'])[10]");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		elementsUtil.selectAnOptionInDropDown(ddClickPriAddcty, ddListPriAddcty, "Bermuda (BM)");
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		elementsUtil.selectAnOptionInDropDown(ddClickMailAddcty, ddListMailAddcty, "Angola (AO)");
		elementsUtil.doClick(nextButtonGeo);

		// Transactions
		By ddClickIntlWireMonAvValue = By.xpath("(//div[@class='c-btn'])[20]");
		By ddListIntlWireMonAvValue = By.xpath("//ul[@class='lazyContainer']/li");

		By ddClickIntlACHMonAvValue = By.xpath("(//div[@class='c-btn'])[21]");
		By ddListIntlACHMonAvValue = By.xpath("//ul[@class='lazyContainer']/li");
		
		By ddClickCashMonAvValue = By.xpath("(//div[@class='c-btn'])[22]");
		By ddListCashMonAvValue = By.xpath("//ul[@class='lazyContainer']/li");

		By submitButton = By.xpath("//button[@type='submit']");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		elementsUtil.selectAnOptionInDropDown(ddClickIntlWireMonAvValue, ddListIntlWireMonAvValue, "Less Than or Equal To $33,000");
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		elementsUtil.selectAnOptionInDropDown(ddClickIntlACHMonAvValue, ddListIntlACHMonAvValue, "No International ACH Transactions");
		elementsUtil.selectAnOptionInDropDown(ddClickCashMonAvValue, ddListCashMonAvValue, "Greater than $30,000");
		elementsUtil.doClick(submitButton);
		
		//Back to Dashboard
		By backToDashboard = By.xpath("(//button[@type='button'])[2]");
		
		waitUtil.waitForElementToBeClickable(backToDashboard, 10).click();
		//elementsUtil.doClick(backToDashboard);
		
		//browserUtil.doQuitBrowser();
		

	}

}
