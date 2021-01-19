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
 *  CASE - C14232 
 *  Menggunakan Fitur Search
 */


/* Call Test Case Page Home User Belum Login */
Mobile.callTestCase(findTestCase("Test Cases/Mobile/On Boarding/Logged Out User/Home/00 - Menampilkan Page Home User Belum Login"), null);

Mobile.delay(2);

/* Verify Card Search / Cari Produk are Exist */
Mobile.verifyElementExist(findTestObject('On - Boarding/Logged Out User/Home/Object Fitur Search/Card - Cari Produk'), 0);

Mobile.tap(findTestObject('On - Boarding/Logged Out User/Home/Object Fitur Search/Card - Cari Produk'), 0);

Mobile.delay(2);

Mobile.setText(findTestObject('On - Boarding/Logged Out User/Home/Object Fitur Search/Input - Search Produk'), 'insight', 0);

/* Press back to hide keyboard text */
Mobile.pressBack();

Mobile.swipe(265, 1693, 250, 174);

Mobile.swipe(265, 1693, 250, 174);

Mobile.delay(2);

Mobile.swipe(215, 299, 265, 1693);

Mobile.swipe(215,  299, 265, 1693);

Mobile.delay(2);

/* Tap on Product insight has been Search */
Mobile.tap(findTestObject('On - Boarding/Logged Out User/Home/Object Fitur Search/Card - Reksa Dana Insight Money'), 0);

Mobile.delay(2);

/* Verify element text on page detail product insight */
Mobile.verifyElementText(findTestObject('On - Boarding/Logged Out User/Home/Object Fitur Search/Label - Reksa Dana Insight Money Detail Page'), 'Reksa Dana Insight Money');

Mobile.delay(2);







