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
 * CASE - C10143, C10147
 * Memilih button Back pada page OTP
 * dan Memilih link "Punya Masalah Login?Hubungi Kami"
 * 
*/


/* Tap button Back on Page OTP */
Mobile.tap(findTestObject('Object Repository/On - Boarding/Login/Btn - Back page OTP'), 0);

Mobile.delay(2);

/* Verify text and link Punya Masalah Login?Hubungi Kami */
Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Login/Text - Punya Masalah Login'), 'Punya Masalah Login?');

Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Login/Text Link - Hubungi Kami'), 'Hubungi Kami');

Mobile.delay(2);

Mobile.tap(findTestObject('Object Repository/On - Boarding/Login/Text Link - Hubungi Kami'), 0);

Mobile.delay(2);




