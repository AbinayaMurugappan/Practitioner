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

WebUI.click(findTestObject('Object Repository/OrangeHRM/Time-Buzz/MyInfo_Icon'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Time-Buzz/MyInfo_ContactDetails'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Time-Buzz/MyInfo_OtherEmail'), 'Test')

WebUI.click(findTestObject('Object Repository/OrangeHRM/Time-Buzz/MyInfo_Save'))

WebUI.click(findTestObject('Object Repository/OrangeHRM/Time-Buzz/MyInfo_Emergency'))
      /*
      *  Automate the process of updating contact details in the application.
      *
      *  1. Click on the My Info icon to access personal information.
      *  2. Click on the Contact Details section to edit contact information.
      *  3. Set the text for the Other Email field to 'Test'.
      *  4. Click on the Save button to save the changes made.
      *  5. Click on the Emergency section to possibly update emergency contact details.
      *
      */