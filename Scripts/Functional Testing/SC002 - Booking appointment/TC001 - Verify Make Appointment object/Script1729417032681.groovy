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

WebUI.callTestCase(findTestCase('Functional Testing/SC001 - Login/TC002 - Login success'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Make Appointment/h2_Make Appointment'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/label_Facility'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/select_Facility'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/cb_applyReadmission'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/label_applyReadmission'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/label_Healthcare Program'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/rb_Medicare'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/label_Medicare'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/rb_Medicaid'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/label_Medicaid'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/rb_None'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/label_None'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/label_Visit Date (Required)'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/input_Visit Date (Required)'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/span_Visit Date (Required)-calendar'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/label_Comment'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/textarea_Comment'))

WebUI.verifyElementVisible(findTestObject('Make Appointment/button_Book Appointment'))

WebUI.closeBrowser()

