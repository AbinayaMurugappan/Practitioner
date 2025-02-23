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
 *  Automate the process of filling out a demo request form on a website.
 *
 *  1. Open a web browser to the specified URL for upgrading to advanced features.
 *  2. Click on the link to book a free demo.
 *  3. Fill in the form fields with test data for name, phone number, email, and company name.
 *  4. Select a country from the dropdown menu.
 *  5. Submit the form.
 *  6. Verify that the confirmation message appears on the new page.
 *  7. Close the web browser.
 *
 */
// Open a web browser to the specified URL for upgrading to advanced features.
WebUI.openBrowser('https://orangehrm.com/open-source/upgrade-to-advanced')

// Click on the link to book a free demo.
WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/a_Book a Free Demo'))

// Fill in the form fields with test data for name, phone number, email, and company name.
WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/input_Name_Name'), 'John Doe') // Set name
WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/input_Phone Number_Contact'), '1234567890') // Set phone number
WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/input_Email_Email'), 'john.doe@example.com') // Set email
WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/input_Company Name_CompanyName'), 'Example Corp') // Set company name

// Select a country from the dropdown menu.
WebUI.selectOptionByLabel(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/select_CountryAfghanistanAlbaniaAlgeriaAmer_8f0376'), 
    'Greenland', true) // Select country

// Submit the form.
WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/input_Country_action_submitForm'))

// Verify that the confirmation message appears on the new page.
WebUI.verifyElementText(findTestObject('Object Repository/Advanced Demo/Page_New Thank You Page  OrangeHRM/p_Well be contacting you shortly'), 
    'We\'ll be contacting you shortly!') // Verify confirmation message

// Close the web browser.
WebUI.closeBrowser()

