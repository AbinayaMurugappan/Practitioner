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

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/i_More_oxd-icon bi-three-dots-vertical'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/li_Configuration'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/a_Email Configuration'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/li_Configuration_1'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/li_Modules'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/span_Configuration'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/a_Localization'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/span_Configuration'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/a_LDAP Configuration'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/span_Enable_oxd-switch-input oxd-switch-inp_d5f3ba'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/span_Configuration'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/li_Modules'))

WebUI.closeBrowser()

