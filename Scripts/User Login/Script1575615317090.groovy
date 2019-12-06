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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.phptravels.net/index.php')

WebUI.click(findTestObject('Object Repository/User Signup/Page_PHPTRAVELS  Travel Technology Partner/a_My Account'))

WebUI.click(findTestObject('Object Repository/User Login/Page_PHPTRAVELS  Travel Technology Partner/a_Login'))

WebUI.sendKeys(findTestObject('Object Repository/User Login/Page_Login/input_Email_username'), 'manishkhadk362@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/User Login/Page_Login/input_Password_password'), 'QAManish')

WebUI.click(findTestObject('Object Repository/User Login/Page_Login/label_Remember Me'))

WebUI.click(findTestObject('Object Repository/User Login/Page_Login/button_Login'))

WebUI.getText(findTestObject('Object Repository/Page_My Account/h3_Hi Manish Khadka'))

