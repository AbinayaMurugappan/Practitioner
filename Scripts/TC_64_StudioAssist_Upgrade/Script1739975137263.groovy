import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


/*
 *  Automate the process of navigating to a specific webpage and interacting with elements on that page.
 *
 *  1. Open a web browser.
 *  2. Navigate to the specified URL for upgrading to advanced features.
 *  3. Select an option from a dropdown menu related to the upgrade.
 *  4. Verify the presence of a specific header on the page.
 *  5. Click on a link to book a free demo.
 *  6. Submit a form by clicking a button.
 *  7. Close the web browser.
 *
 */
// Open a web browser
WebUI.openBrowser('')

// Navigate to the specified URL for upgrading to advanced features
WebUI.navigateToUrl('https://orangehrm.com/open-source/upgrade-to-advanced')

// Select an option from a dropdown menu related to the upgrade
WebUI.selectOptionByValue(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/select_En                                  _726c91'), 
    '/es/open-source/upgrade-to-advanced', true)

// Verify the presence of a specific header on the page
WebUI.verifyElementPresent(findTestObject('Object Repository/Advanced Demo/Page_Open Source  OrangeHRM/h1_Upgrade to                              _f4b44d'), 
    0)

// Click on a link to book a free demo
WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Open Source  OrangeHRM/a_Book a Free Demo'))

// Submit a form by clicking a button
WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Open Source  OrangeHRM/input_Country_action_submitForm'))

// Close the web browser
WebUI.closeBrowser()