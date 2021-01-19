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
 * CASE - C10142
 * Login dengan no handphone sudah terdaftar dan valid
*/


/* Set no phone are registered and valid */
Mobile.setText(findTestObject('Object Repository/On - Boarding/Login/Object No Phone/android.widget.EditText - No Handphone'), '087778128777', 0);

Mobile.tap(findTestObject('Object Repository/On - Boarding/Login/Btn - Masuk login'), 0);

Mobile.delay(2);

Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Login/Title Otp - Verifikasi Nomor HP'), 'Verifikasi Nomor HP');

Mobile.delay(2);
