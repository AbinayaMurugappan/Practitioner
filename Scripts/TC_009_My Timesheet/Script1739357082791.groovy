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

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/My_Timesheet'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/i_My Timesheet_oxd-icon bi-chevron-left'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/i_My Timesheet_oxd-icon bi-chevron-left'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/span_Attendance'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/a_Punch InOut'))

TestData data = findTestData('Data Files/Message File - Comments')

String Value = data.getValue(1,1)

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/textarea_Note_oxd-textarea oxd-textarea--fo_bc10e6'), 
    Value)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/span_Reports'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/a_Attendance Summary'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/li_Project Info'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/a_Customers'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/i_Fresh Books Software Ltd_oxd-icon bi-pencil-fill'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/textarea_Description_oxd-textarea oxd-texta_fed1e5'),Comments)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/div_SuccessSuccessfully Updated'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/a_Dashboard'))


      /*
      *  Automate the process of updating comments in the attendance system.
      *
      *  1. Introduce a delay of 10 seconds to allow the page to load.
      *  2. Navigate to the My Timesheet section and click on the necessary icons to access the attendance features.
      *  3. Retrieve data from a specified test data file and set the text in the comments field.
      *  4. Access the Reports section and navigate to the Attendance Summary.
      *  5. Click through to the Project Info and Customers sections to edit the description.
      *  6. Save the changes and confirm the success message before returning to the Dashboard.
      */