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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (186)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata Sandi_password (62)'), 'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/button_Masuk (63)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Evaluasi Diri (6)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (186)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Evaluasi Penunjang Lainnya (6)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Tambah Lampiran (6)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Add Files (6)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Upload Lampiran (6)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/div_Lampiran sudah diupload (6)'), 'Lampiran sudah diupload.')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Tambah Lampiran (6)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/div_KUS2001_English_III_Week_15_Vocabulary__dcee2b'), 
    0)

WebUI.closeBrowser()
