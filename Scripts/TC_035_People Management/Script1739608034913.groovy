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

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/a_Book a Free Demo'))

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/input_Name_Name'), 
    'people89')

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/input_Phone Number_Contact'), 
    '89078888999')

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/input_Email_Email'), 
    'people@gmail.com')

WebUI.setText(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/input_Company Name_CompanyName'), 
    'peopledemo')

WebUI.selectOptionByValue(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/select_CountryAfghanistanAlbaniaAlgeriaAmer_8f0376'), 
    'Cambodia', true)

WebUI.click(findTestObject('Object Repository/Advanced Demo/Page_Upgrade to Advanced from Open Source  _b07b6c/input_Country_action_submitForm'))

WebUI.verifyElementText(findTestObject('Object Repository/Advanced Demo/Page_New Thank You Page  OrangeHRM/p_Well be contacting you shortly'), 
    'We\'ll be contacting you shortly!')

WebUI.mouseOver(findTestObject('Object Repository/Advanced Demo/Page_New Thank You Page  OrangeHRM/a_Solutions'))

WebUI.closeBrowser()

