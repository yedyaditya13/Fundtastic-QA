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
 *  CASE - C15767
 *  Menggunakan Fitur Search Produk Kosong
 */


/* Back to Page Cari produk from Page Detail Produk Reksa Dana */
Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Search/Btn - Back Page Detail Produk Reksa Dana'), 0);

Mobile.delay(2);

Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Search/Card - Cari Produk'), 0);

/* Set Text Produk are Empty in Database */
Mobile.setText(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Search/Input - Search Produk'), 'sucor invest', 0);

Mobile.delay(2);

Mobile.pressBack();

/* Verify Logo Empty Search and All Text */
Mobile.verifyElementVisible(findTestObject('On - Boarding/Logged Out User/Home/Object Fitur Search/Logo - Search Empty'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Search/Text Produk Empty - Ups produk tidak ditemukan'), 'Ups, produk tidak ditemukan');

Mobile.verifyElementText(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Search/Text Produk Empty - Hasil pencarian tidak ditemukan'), 'Hasil pencarian tidak ditemukan, coba cari produk yang lain?');

Mobile.delay(2);

/* Back to Home Page */
Mobile.tap(findTestObject('Object Repository/On - Boarding/Logged Out User/Home/Object Fitur Search/Btn - Back Page Search Produk'), 0);












