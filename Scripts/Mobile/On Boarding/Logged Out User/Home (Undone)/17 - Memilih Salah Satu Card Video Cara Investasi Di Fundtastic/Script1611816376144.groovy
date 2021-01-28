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


/** CASE - C14243
 **  Memilih salah satu video cara investasi di fundtastic
 **/


/* Start Application */
Mobile.startApplication("/Users/fundtastic/Downloads/mobile-debug.apk", false);

Mobile.delay(2);


/* Swipe To Visible Video */
Mobile.swipe(500, 1492, 493, 750);

Mobile.delay(2);

/* Verify Every Element in Video Investasi Fundtastic */
Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Video Cara Investasi Fundtastic/Title - Gini Nih Cara Investasi di Fundtastic'), 'Gini Nih, Cara Investasi di FUNDtastic');

Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Video Cara Investasi Fundtastic/Text Video - Penggunaan Finansial Pintar'), 'Penggunaan Finansial Pintar');

Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Video Cara Investasi Fundtastic/Text Video - Rekomendasi Sesuai Tujuan Ala Fundtastic'), 'Rekomendasi Sesuai Tujuan Ala FUNDtastic');

Mobile.verifyElementExist(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Video Cara Investasi Fundtastic/Btn Circle - X Sembunyikan Video'), 0);

Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Video Cara Investasi Fundtastic/Text - Sembunyikan'), 'Sembunyikan');

Mobile.delay(2);

/* Tap on Every Video to Test It */
Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Video Cara Investasi Fundtastic/Video - Penggunaan FInansial Pintar'), 0);

Mobile.delay(10);

Mobile.pressBack();

Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Video Cara Investasi Fundtastic/Video - Rekomendasi Sesuai Tujuan Ala Fundtastic'), 0);

Mobile.delay(10);

Mobile.pressBack();













