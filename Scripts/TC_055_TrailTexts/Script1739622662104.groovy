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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://orangehrm.com/open-source/upgrade-to-advanced')

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/img'))

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Human Resources Management Software  O_31d1a1/input_Email_action_request'))

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/a_OrangeHRM'))

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/a_Executive Profile'))

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/a_Press Releases'))

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/a_Careers'))

WebUI.verifyElementText(findTestObject('Object Repository/Advanced Demo/Page_OrangeHRM Careers Join Our Team  OrangeHRM/h1_Grow with OrangeHRM'), 
    'Grow with OrangeHRM')

WebUI.closeBrowser()
      /*
      *  Automate the navigation and interaction with the OrangeHRM website.
      *
      *  1. Open a web browser to start the automation process.
      *  2. Navigate to the specified URL for upgrading to advanced features.
      *  3. Click on various elements on the page to explore different sections such as email request, executive profile, press releases, and careers.
      *  4. Verify that the text "Grow with OrangeHRM" is present on the careers page.
      *  5. Close the web browser after completing the interactions.
      *
      */

