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
 *  Automate the process of signing up for a 30-day advanced free trial on a website.
 *
 *  1. Open a web browser to the specified URL for upgrading to advanced features.
 *  2. Click on the relevant image to proceed with the upgrade.
 *  3. Input an email address into the designated field.
 *  4. Click the action button to request the email.
 *  5. Enter a subdomain name for the trial system.
 *  6. Provide a full name in the corresponding field.
 *  7. Click the submit button to finalize the form submission.
 *  8. Close the web browser after completing the process.
 */
// Open a web browser to the specified URL for upgrading to advanced features.
WebUI.openBrowser('https://orangehrm.com/open-source/upgrade-to-advanced')

// Click on the relevant image to proceed with the upgrade.
WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/img'))

// Input an email address into the designated field.
WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Human Resources Management Software  O_31d1a1/input_Email_EmailHomePage'), 
    'Test@gmail.com')

// Click the action button to request the email.
WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Human Resources Management Software  O_31d1a1/input_Email_action_request'))
// Enter a subdomain name for the trial system.
WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/input_Name for the Trial System_subdomain'), 
    'Test')
// Provide a full name in the corresponding field.
WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/input_FullName_Name'), 
    'Abi')

// Click the submit button to finalize the form submission.
WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/input_Country_action_submitForm'))

// Close the web browser after completing the process.
WebUI.closeBrowser()