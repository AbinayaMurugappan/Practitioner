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

WebUI.selectOptionByValue(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/select_En                                  _726c91'), 
    '/es/open-source/upgrade-to-advanced', true)

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Open Source  OrangeHRM/input_Name_Name'), 'Abi')

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Open Source  OrangeHRM/input_Phone Number_Contact'), 
    '89009888999')

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Open Source  OrangeHRM/input_Email_Email'), 'abi@yahoo.com')

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Open Source  OrangeHRM/input_Company Name_CompanyName'), 
    'Company')

WebUI.selectOptionByValue(findTestObject('Object Repository/Advanced Demo/Page_Open Source  OrangeHRM/select_PasAfghanistanAlbaniaAlgeriaAmerican_373589'), 
    'Belarus', true)

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Open Source  OrangeHRM/input_Country_action_submitForm'))

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Page not found  OrangeHRM/button_Agenda una Demo Gratis'))

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_GET esbook-a-free-demo/h1_Emergency Uncaught TypeError SilverStrip_974ee6'))

WebUI.closeBrowser()

