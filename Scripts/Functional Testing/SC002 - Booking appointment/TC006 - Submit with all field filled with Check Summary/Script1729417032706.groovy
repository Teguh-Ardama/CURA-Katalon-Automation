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

WebUI.callTestCase(findTestCase('Blocks/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Navbar/i_Navbar'))

WebUI.click(findTestObject('Navbar/a_Login'))

WebUI.callTestCase(findTestCase('Blocks/Login'), [('username') : 'John Doe', ('password') : 'ThisIsNotAPassword'], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Make Appointment/select_Facility'), facility, false)

if (applyReadmission == 'TRUE') {
    WebUI.click(findTestObject('Make Appointment/cb_applyReadmission'))
}

switch (healthcareProgram) {
    case 'Medicare':
        WebUI.click(findTestObject('Make Appointment/rb_Medicare'))

        break
    case 'Medicaid':
        WebUI.click(findTestObject('Make Appointment/rb_Medicaid'))

        break
    default:
        WebUI.click(findTestObject('Make Appointment/rb_None'))

        break
}

WebUI.setText(findTestObject('Make Appointment/input_Visit Date (Required)'), visitDate)

WebUI.setText(findTestObject('Make Appointment/textarea_Comment'), comment)

WebUI.click(findTestObject('Make Appointment/button_Book Appointment'))

if ((visitDate == null) || (visitDate.trim() == '')) {
    WebUI.comment('Field Mandatory belum diisi')
} else {
    WebUI.verifyElementPresent(findTestObject('Appointment Summary/h2_Appointment Confirmation'), 0)

    WebUI.verifyElementText(findTestObject('Appointment Summary/p_Result-Facility'), facility)

    if (applyReadmission == 'TRUE') {
        WebUI.verifyElementText(findTestObject('Appointment Summary/p_Result-applyReadmission'), 'Yes')
    } else {
        WebUI.verifyElementText(findTestObject('Appointment Summary/p_Result-applyReadmission'), 'No')
    }
    
    WebUI.verifyElementText(findTestObject('Appointment Summary/p_Result-healthcareProgram'), healthcareProgram)

    WebUI.verifyElementText(findTestObject('Appointment Summary/p_Result-visitDate'), visitDate)

    WebUI.verifyElementText(findTestObject('Appointment Summary/p_Result-Comment'), comment)
}

