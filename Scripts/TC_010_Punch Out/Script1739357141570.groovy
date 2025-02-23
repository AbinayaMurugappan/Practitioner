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

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/i_Today_oxd-icon bi-stopwatch'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/i_Date_oxd-icon bi-calendar oxd-date-input-icon'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/div_14'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/div_DateTimeAMPM'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/textarea_Note_oxd-textarea oxd-textarea--fo_bc10e6'), Notes)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/button_Out'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/li_Reports'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/a_Attendance Summary'))

WebUI.closeBrowser()

      /*
      *  Automate the process of logging attendance in a web application.
      *
      *  1. Click on the stopwatch icon to initiate the attendance logging.
      *  2. Click on the calendar icon to select the date for attendance.
      *  3. Click on the specific date (14) to confirm the selection.
      *  4. Click on the AM/PM dropdown to select the time of attendance.
      *  5. Set the notes for the attendance using the provided text.
      *  6. Click the "Out" button to finalize the attendance logging.
      *  7. Navigate to the reports section by clicking on the reports link.
      *  8. Click on the "Attendance Summary" link to view the summary report.
      *  9. Close the browser after completing the attendance logging process.
      */
