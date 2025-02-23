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
 *  Automate interactions with a web application to post a message and verify content.
 *
 *  1. Click on the 'Buzz' section to open the posting interface.
 *  2. Set the text for the post to 'Testing' and click the 'Post' button to submit it.
 *  3. Click on the icon to view the most commented posts and set a text input for a new comment.
 *  4. Click on buttons to view the most liked and most commented posts.
 *  5. Verify that the text 'Upcoming Anniversaries' is displayed correctly on the page.
 *  6. Close the browser after completing the actions.
 */
// Click on the 'Buzz' section to open the posting interface.
WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/span_Buzz'))

// Set the text for the post to 'Testing' and click the 'Post' button to submit it.
WebUI.setText(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/textarea_Upgrade_oxd-buzz-post-input'), 
    'Testing')
WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/button_Post'))

// Click on the icon to view the most commented posts and set a text input for a new comment.
WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/i_Most Commented Posts_oxd-icon bi-chat-text-fill'))
WebUI.setText(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/input__oxd-input oxd-input--focus'), 
    'TestRun 01')

// Click on buttons to view the most liked and most commented posts.
WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/button_Most Liked Posts'))
WebUI.click(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/button_Most Commented Posts'))

// Verify that the text 'Upcoming Anniversaries' is displayed correctly on the page.
WebUI.verifyElementText(findTestObject('Object Repository/OrangeHRM/Leaves_Timesheets/Page_OrangeHRM/p_Upcoming Anniversaries'), 
    'Upcoming Anniversaries')
// Close the browser after completing the actions.
WebUI.closeBrowser()
