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
 * CASE - C10141
 * Login dengan no handphone belum terdaftar
*/


/* Set no phone aren't registered on Fundtastic db */
Mobile.setText(findTestObject('Object Repository/On - Boarding/Login/Object No Phone/android.widget.EditText - No Handphone'), '081232425262', 0);

Mobile.tap(findTestObject('Object Repository/On - Boarding/Login/Btn - Masuk login'), 0);

/* Card Alert Text Visible */
Mobile.verifyElementVisible(findTestObject('Object Repository/On - Boarding/Login/Card Alert - Case Phone Login'), 0);

def textAlert = Mobile.getText(findTestObject('Object Repository/On - Boarding/Login/Text Alert - No Handphone Belum Terdaftar'), 0);

Mobile.verifyEqual(textAlert, "Nomor handphone belum terdaftar");

Mobile.delay(2);

/* Clear no phone aren't registered on Fundtastic db */
Mobile.clearText(findTestObject('Object Repository/On - Boarding/Login/Object No Phone/android.widget.EditText - 081232425262'), 0);

Mobile.delay(2);
