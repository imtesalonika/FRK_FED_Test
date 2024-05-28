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

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (106)'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (106)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (106)'), 
    'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/button_Masuk (68)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Evaluasi Diri'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (106)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/b_Evaluasi Pengabdian'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/b_Evaluasi Pengabdian'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Tambah                              _80558e'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Add Files'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Upload                              _8f5048'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/div_SuccessBerhasil mengupload lampiran'), 0)

