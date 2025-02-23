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

/*
 *  Automate the process of assigning leave in the OrangeHRM application.
 *
 *  1. Click on the 'Assign Leave' button to navigate to the leave assignment section.
 *  2. Click on the input field to enter the employee's name.
 *  3. Set the text of the input field to 'Thomas' to search for the employee.
 *  4. Introduce a delay of 10 seconds to allow for any loading processes.
 *  5. Send a down arrow key press to navigate through the suggestions.
 *  6. Send an enter key press to select the highlighted suggestion.
 *  7. Introduce another delay of 10 seconds for the selection to process.
 *  8. Retrieve a value from the test data file to use as a comment.
 *  9. Set the text of the comment box to the retrieved value.
 *  10. Click on the 'Assign' button to complete the leave assignment.
 */
// Click on the 'Assign Leave' button to navigate to the leave assignment section.
WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/Assign Leave'))

// Click on the input field to enter the employee's name.
WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input'))

// Set the text of the input field to 'Thomas' to search for the employee.
WebUI.setText(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input'), 'A')

// Introduce a delay of 10 seconds to allow for any loading processes.
WebUI.delay(10)

// Send a down arrow key press to navigate through the suggestions.
WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input'), Keys.chord(Keys.ARROW_DOWN))

// Send an enter key press to select the highlighted suggestion.
WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/input'), Keys.chord(Keys.ENTER))
// Introduce another delay of 10 seconds for the selection to process.
WebUI.delay(10)

// Retrieve a value from the test data file to use as a comment.
def comment = findTestData('Data Files/Messages').getValue(1, 1)

// Set the text of the comment box to the retrieved value.
WebUI.setText(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/CommentBox'), comment)

// Click on the 'Assign' button to complete the leave assignment.
WebUI.click(findTestObject('Object Repository/OrangeHRM/Page_OrangeHRM/button_Assign'))