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
 *  CASE -
 *  Menampilkan Page Home User Belum Login
 */


/* Start Application */
Mobile.startApplication("/Users/fundtastic/Downloads/mobile-debug.apk", true);

Mobile.delay(5);

/* Swipe Page On Boarding 1, 2, 3 */
for (int i=0; i<2; i++)
{
	Mobile.swipe(1075, 950, 25, 852);
	Mobile.delay(2);
}

Mobile.tap(findTestObject('Object Repository/On - Boarding/Login/Button Onboarding - Lanjut'), 0);

Mobile.delay(2);

/* Verify element card form login no handphone */
Mobile.verifyElementExist(findTestObject('Object Repository/On - Boarding/Login/Card - Form Login No Handphone'), 0);

Mobile.delay(2);

Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Label - Lewati Page Form Login'), 0);

Mobile.delay(2);

/* Verify element Logo Fundtastic on page Home */
Mobile.verifyElementExist(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Logo - Home Fundtastic'), 0);

Mobile.delay(2);



