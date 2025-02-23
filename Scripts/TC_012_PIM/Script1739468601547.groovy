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

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/a_PIM'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    EmpID)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/div_Reset  Search'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/i_M_oxd-icon bi-check oxd-checkbox-input-icon'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/i_Actions_oxd-icon bi-check oxd-checkbox-in_fe61ad'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/input_Employee Full Name_firstName'), FirstName)

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/input_Employee Full Name_middleName'), MiddleName)

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/input_Employee Full Name_lastName'), LastName)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/span_Employee Id_oxd-switch-input oxd-switc_efe210'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/span_Employee Id_oxd-switch-input oxd-switc_efe210'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/a_Reports'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/i_Actions_oxd-icon bi-check oxd-checkbox-in_fe61ad'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin/Page_OrangeHRM/i_Configuration_oxd-icon bi-question-lg'))

WebUI.closeBrowser()

