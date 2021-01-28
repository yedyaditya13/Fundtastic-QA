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
 *  CASE - C14230
 *  Memilih Fitur Konsultasi
 */


///* Start Application */
//Mobile.startApplication("/Users/fundtastic/Downloads/mobile-debug.apk", false);
//
//Mobile.delay(2);

/* ============== */


/* Verify icon fitur konsultasi and tap it on page Home */
Mobile.verifyElementExist(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Konsultasi/Icon - Fitur Konsultasi'), 0);

Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Konsultasi/Text - Fitur Konsultasi'), 'Konsultasi');

Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Konsultasi/Card - Fitur Konsultasi'), 0);

Mobile.delay(2);

/* Verify logo and text konsultasi on page form konsultasi */
Mobile.verifyElementExist(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Konsultasi/Logo - Konsultasi Page Form Konsultasi'), 0);

Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Konsultasi/Text - sebelum melakukan konsultasi'), 'Sebelum melakukan konsultasi, silahkan login dahulu');

Mobile.delay(2);

/* Back to page Home */
Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Konsultasi/Btn - Back Page Form Konsultasi'), 0);

Mobile.delay(3);