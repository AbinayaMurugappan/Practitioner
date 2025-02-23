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

WebUI.click(findTestObject('Object Repository/OrangeHRM/Time-Buzz/Performance_Icon'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM/Time-Buzz/Performance_EmployeeName'), 'Thomas')

WebUI.delay(10)

WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/Time-Buzz/Performance_EmployeeName'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/Time-Buzz/Performance_EmployeeName'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/OrangeHRM/Time-Buzz/Performance_Search'))
      /*
      *  Automate the process of selecting an employee for performance evaluation.
      *
      *  1. Click on the performance icon to access the performance evaluation section.
      *  2. Set the text field for employee name to 'Thomas'.
      *  3. Wait for 10 seconds to allow the interface to update.
      *  4. Simulate pressing the down arrow key to navigate through the suggestions.
      *  5. Simulate pressing the enter key to select the highlighted suggestion.
      *  6. Wait for another 10 seconds to ensure the selection is processed.
      *  7. Click on the search button to initiate the search for the selected employee.
      *
      */