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

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Human Resources Management Software  O_31d1a1/input_Email_EmailHomePage'), 
    'Testuser@gmail.com')

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Human Resources Management Software  O_31d1a1/input_Email_action_request'))

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/input_Name for the Trial System_subdomain'), 
    'Quadre')

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/h1_Revolutionize Your Human Resource Manage_2bfb7e'))

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/input_Name for the Trial System_subdomain'), 
    'Penty')

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/input_FullName_Name'), 
    'Abi')

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/input_Email_Email'), 
    'Testuser@gmail.com')

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/input_Phone Number_Contact'), 
    '8765456666666')

WebUI.selectOptionByValue(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/select_CountryAfghanistanAlbaniaAlgeriaAmer_8f0376'), 
    'Fiji', true)

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_30-Day Advanced Free Trial  OrangeHRM/input_Country_action_submitForm'))

WebUI.closeBrowser()

