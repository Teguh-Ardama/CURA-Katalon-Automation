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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Navbar/i_Navbar'))

WebUI.click(findTestObject('Navbar/a_Login'))

WebUI.verifyElementVisible(findTestObject('Login/h2_Login'))

WebUI.verifyElementVisible(findTestObject('Login/p_Please login to make appointment'))

WebUI.verifyElementVisible(findTestObject('Login/Demo Account/label_Demo account'))

WebUI.verifyElementVisible(findTestObject('Login/Demo Account/span_user'))

WebUI.verifyElementVisible(findTestObject('Login/Demo Account/inputFormControl_Username'))

WebUI.verifyElementVisible(findTestObject('Login/Demo Account/span_lock'))

WebUI.verifyElementVisible(findTestObject('Login/Demo Account/inputFormControl_Password'))

WebUI.verifyElementVisible(findTestObject('Login/label_Username'))

WebUI.verifyElementVisible(findTestObject('Login/input_Username'))

WebUI.verifyElementVisible(findTestObject('Login/label_Password'))

WebUI.verifyElementVisible(findTestObject('Login/input_Password'))

WebUI.verifyElementVisible(findTestObject('Login/button_Login'))

WebUI.closeBrowser()

