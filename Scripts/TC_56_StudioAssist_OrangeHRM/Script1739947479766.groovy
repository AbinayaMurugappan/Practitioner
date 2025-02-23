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
 *  Automate the login process and navigate to the About section of the OrangeHRM application.
 *
 *  1. Open a web browser to start the automation.
 *  2. Navigate to the login page of the OrangeHRM application.
 *  3. Input the username and password into the respective fields.
 *  4. Verify that the text 'OrangeHRM OS 5.7' is present on the page.
 *  5. Click the login button to submit the credentials.
 *  6. Wait for the page to load completely.
 *  7. Click on the user dropdown image to access user options.
 *  8. Click on the About link to view information about the application.
 *  9. Click on the button that follows the About link.
 */
// Open a web browser to start the automation
WebUI.openBrowser('')

// Navigate to the login page of the OrangeHRM application
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

// Input the username and password into the respective fields
WebUI.setText(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input_Username_username'), 'Admin') // Set the username
WebUI.setText(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input_Password_password'), 'admin123') // Set the password

// Verify that the text 'OrangeHRM OS 5.7' is present on the page
WebUI.verifyTextPresent('OrangeHRM OS 5.7', true) // Check for the presence of the text

// Click the login button to submit the credentials
WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/button_Login')) // Click the login button

// Wait for the page to load completely
WebUI.waitForPageLoad(10) // Wait for the page to load with a timeout of 10 seconds

// Click on the user dropdown image to access user options
WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/img_Upgrade_oxd-userdropdown-img')) // Click the user dropdown

// Click on the About link to view information about the application
WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/a_About')) // Click the About link

// Click on the button that follows the About link
WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/button_')) // Click the button after the About link