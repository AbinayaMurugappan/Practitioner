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


WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/Dashboard'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/div_Leave List'))

//WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/path_Today_cls-1'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/input_From Date_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/input_From Date_oxd-input oxd-input--focus'), 
    '2000-12-10')

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/input_To Date_oxd-input oxd-input--active'), 
    '2025-31-12')

WebUI.doubleClick(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/input_To Date_oxd-input oxd-input--active'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/input_To Date_oxd-input oxd-input--active'), 
    '2025')

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/input_From Date_oxd-input oxd-input--focus'), 
    '2025-12-10')

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/input_To Date_oxd-input oxd-input--active'), 
    '2025-12-12')

//WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/div_-- Select --'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/Employee Name'),EmployeeName)
WebUI.delay(10)

WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/Employee Name'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/Employee Name'), Keys.chord(Keys.ENTER))

WebUI.delay(10)
WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/a_Dashboard'))


