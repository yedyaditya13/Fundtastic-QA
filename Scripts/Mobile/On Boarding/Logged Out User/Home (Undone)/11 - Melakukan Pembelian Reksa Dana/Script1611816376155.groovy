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
 *  CASE - C14236
 *  Melakukan Pembelian Produk Reksa Dana
 */


/* Start Application */
Mobile.startApplication("/Users/fundtastic/Downloads/mobile-debug.apk", false);

Mobile.delay(2);


/* ======

/* Scroll to product reksa dana on Update Terbaru */
Mobile.swipe(289, 1563, 233, 237);

Mobile.delay(2);

Mobile.tap(findTestObject('On - Boarding/Logged Out User/Home/Object Page Keranjang dan Pembelian/Card RD - Update Terbaru'), 0);

Mobile.delay(2);

/* Tap on Btn Beli */
Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Page Keranjang dan Pembelian/Btn - Beli Page Detail RD'), 0);

Mobile.delay(2);

/* Verify logo keranjang on page Form Pembelian */
Mobile.verifyElementExist(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Page Keranjang dan Pembelian/Logo - Page Form Pembelian'), 0);

/* Back to Home Page */
Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Page Keranjang dan Pembelian/Btn - Back Page Form Pembelian'), 0);

Mobile.pressBack();

Mobile.delay(3);
