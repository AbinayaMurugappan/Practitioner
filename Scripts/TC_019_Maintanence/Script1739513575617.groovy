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

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/span_Maintenance'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/button_Cancel'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/span_Maintenance'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/div_Administrator AccessYou have requested _723b17'))

WebUI.verifyElementText(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/input_Username_username'), 
    '')

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/button_Confirm'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/button_Cancel'))

WebUI.closeBrowser()

      /*
      *  Automate interactions with the OrangeHRM web application.
      *
      *  1. Click on the "Maintenance" span element to initiate a process.
      *  2. Click on the "Cancel" button to cancel the current action.
      *  3. Click on the "Maintenance" span element again to re-initiate the process.
      *  4. Click on a div element that indicates administrator access.
      *  5. Verify that the username input field is empty.
      *  6. Click on the "Confirm" button to proceed with the action.
      *  7. Click on the "Cancel" button again to cancel the action.
      *  8. Close the browser to end the session.
      */
