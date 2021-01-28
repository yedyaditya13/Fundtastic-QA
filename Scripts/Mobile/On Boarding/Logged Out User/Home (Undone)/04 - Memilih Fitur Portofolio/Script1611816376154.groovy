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
 *  CASE - C14227
 *  Memilih Fitur Portofolio
 */


/* Start Application */
//Mobile.startApplication("/Users/fundtastic/Downloads/mobile-debug.apk", false);
//
//Mobile.delay(2);

/* ============== */


/* Verify icon fitur portofolio and tap it on page Home */
//Mobile.verifyElementExist(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Portofolio/Icon - Portofolio'), 0);

Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Portofolio/Text - Portofolio'), 'Portofolio');

Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Portofolio/Card - Fitur Portofolio'), 0);

Mobile.delay(2);

/* Verify logo and text portofolio on page Form Portofolio */
Mobile.verifyElementExist(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Portofolio/Logo - Form Page Portofolio'), 0);

Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Portofolio/Text - Page Form Portofolio'), 'Silahkan login untuk melihat portofolio kamu');

Mobile.delay(2);

/* Back to page Home */
Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Portofolio/Btn - Back Page Form Portofolio'), 0);

Mobile.delay(3);





