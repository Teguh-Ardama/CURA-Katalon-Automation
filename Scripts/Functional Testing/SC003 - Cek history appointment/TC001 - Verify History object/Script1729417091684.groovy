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

WebUI.callTestCase(findTestCase('Functional Testing/SC002 - Booking appointment/TC002 - Submit with all field filled'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Navbar/i_Navbar'))

WebUI.click(findTestObject('Navbar/a_History'))

WebUI.verifyElementVisible(findTestObject('History/h2_History'))

WebUI.verifyElementVisible(findTestObject('History/label_Facility'))

WebUI.verifyElementVisible(findTestObject('History/p_Result-Facility'))

WebUI.verifyElementVisible(findTestObject('History/label_Apply for hospital readmission'))

WebUI.verifyElementVisible(findTestObject('History/p_Result-Apply'))

WebUI.verifyElementVisible(findTestObject('History/label_Healthcare Program'))

WebUI.verifyElementVisible(findTestObject('History/p_Result-Healthcare Program'))

WebUI.verifyElementVisible(findTestObject('History/label_Comment'))

WebUI.verifyElementVisible(findTestObject('History/p_Result-Comment'))

WebUI.verifyElementVisible(findTestObject('History/a_Go to Homepage'))

