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



/**
 * CASE - C10139
 * Login dengan No Handphone Yang Tidak Valid
*/


Mobile.setText(findTestObject('Object Repository/On - Boarding/Login/Field - No Handphone Login'), '01912345678', 0);

Mobile.tap(findTestObject('Object Repository/On - Boarding/Login/Btn - Masuk login'), 0);

/* Card Alert Text Visible */
Mobile.verifyElementVisible(findTestObject('Object Repository/On - Boarding/Login/Card Alert - Case Phone Login'), 0)

def textAlert = Mobile.getText(findTestObject('Object Repository/On - Boarding/Login/Text Alert - Nomor Handphone Tidak Valid'), 0);

Mobile.verifyEqual(textAlert, "Nomor Handphone Tidak Valid");

Mobile.delay(2);