import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.Keys

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
 *  CASE - C14241
 *  Memilih Icon Keranjang Pada Page Detail Produk Reksa Dana
 */
/* Start Application */
//Mobile.startApplication('/Users/fundtastic/Downloads/mobile-debug.apk', false)
//
//Mobile.delay(2)

/* ============== */
Mobile.tap(findTestObject('On - Boarding/Logged Out User/Home/Object Fitur Search/Card - Cari Produk'), 0);

Mobile.delay(2);

Mobile.setText(findTestObject('On - Boarding/Logged Out User/Home/Object Fitur Search/Input - Search Produk'), 'insight', 
    0);

Mobile.delay(2);

/* Tap on Product insight has been Search */
Mobile.tap(findTestObject('On - Boarding/Logged Out User/Home/Object Fitur Search/Card - Reksa Dana Insight Money'), 0);

Mobile.delay(2);

/* Verify element text on page detail product insight */
Mobile.verifyElementText(findTestObject('On - Boarding/Logged Out User/Home/Object Fitur Search/Label - Reksa Dana Insight Money Detail Page'), 
    'Reksa Dana Insight Money')

Mobile.delay(2);

/* Tap on icon Keranjang on page Detail Reksa Dana */
Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Page Keranjang/Icon - Cart Page Detail RD'), 
    0);

Mobile.delay(2);

/*====
 */
/* Verify element text etc on page form page keranjang */
Mobile.verifyElementExist(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Page Keranjang/Logo - Cart Page Form Keranjang'), 
    0);

// Cannot read enter key in text
//Mobile.verifyElementText(findTestObject('null'), 'Sebelum memasuki keranjang, silakan login terlebih dahulu');
//def textPgCart = Mobile.getText(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Page Keranjang/Text - Sebelum memasuki keranjang'), 
//    0);
//
//String strKey = Keys.chord(Keys.ENTER);
//
//Mobile.verifyEqual(textPgCart, 'Sebelum memasuki keranjang,' .. 'silakan login terlebih dahulu')

Mobile.delay(2);

/* Back to page Home */
Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Page Keranjang/Btn - Back Page Form Keranjang'), 
    0);

Mobile.delay(2);

Mobile.pressBack();

Mobile.delay(3);


