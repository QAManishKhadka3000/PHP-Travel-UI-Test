import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('https://www.phptravels.net/index.php')

WebUI.click(findTestObject('User Signup/Page_PHPTRAVELS  Travel Technology Partner/a_My Account'))

WebUI.click(findTestObject('User Signup/Page_PHPTRAVELS  Travel Technology Partner/a_Sign Up'))

WebUI.sendKeys(findTestObject('User Signup/Page_Register/input_First Name_firstname'), 'Manish')

WebUI.sendKeys(findTestObject('User Signup/Page_Register/input_Last Name_lastname'), 'Khadka')

WebUI.sendKeys(findTestObject('User Signup/Page_Register/input_Mobile Number_phone'), '9848505146')

WebUI.sendKeys(findTestObject('User Signup/Page_Register/input_Email_email'), 'manishkhadk362@gmail.com')

WebUI.sendKeys(findTestObject('User Signup/Page_Register/input_Password_password'), 'QAManish')

WebUI.sendKeys(findTestObject('User Signup/Page_Register/input_Confirm Password_confirmpassword'), 'QAManish')

WebUI.click(findTestObject('User Signup/Page_Register/button_Sign Up'))

