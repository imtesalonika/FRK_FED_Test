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

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (153)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata Sandi_password (29)'), 'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/button_Masuk (30)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (116)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (153)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Penelitian (17)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Editor_btn btn-warning mr-1 (2)'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama Kegiatan_nama_kegiatan (99)'), 'Kegiatan 1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Pendahuluan                         _0a79b4'), 
    'Buku Jadi', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Mandiri                             _22c5f5'), 
    'Kelompok', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Editor                              _e664c0'), 
    'Kontributor', true)

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan Perubahan (35)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Kegiatan 1 (8)'), 'Kegiatan 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Buku Jadi'), 'Buku Jadi')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Kelompok (3)'), 'Kelompok')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Kontributor (3)'), 'Kontributor')

WebUI.closeBrowser()

