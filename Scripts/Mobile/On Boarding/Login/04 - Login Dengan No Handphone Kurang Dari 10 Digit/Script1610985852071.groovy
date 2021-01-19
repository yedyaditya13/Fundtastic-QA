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
 * CASE - C10140
 * Login dengan No Handphone Kurang Dari 10 Digit
*/


/* Set no phone less than 10 digits */
Mobile.setText(findTestObject('On - Boarding/Login/Object No Phone/android.widget.EditText - No Handphone'), '081234567', 0);

Mobile.tap(findTestObject('Object Repository/On - Boarding/Login/Btn - Masuk login'), 0);

/* Card Alert Text Visible */
Mobile.verifyElementVisible(findTestObject('Object Repository/On - Boarding/Login/Card Alert - Case Phone Login'), 0);

def textAlert = Mobile.getText(findTestObject('Object Repository/On - Boarding/Login/Text Alert - Nomor Handphone Tidak Valid'), 0);

Mobile.verifyEqual(textAlert, "Nomor Handphone Tidak Valid");

Mobile.delay(2);

/* Clear no phone less than 10 digits */
Mobile.clearText(findTestObject('On - Boarding/Login/Object No Phone/android.widget.EditText - 081234567'), 0);

Mobile.delay(2);

