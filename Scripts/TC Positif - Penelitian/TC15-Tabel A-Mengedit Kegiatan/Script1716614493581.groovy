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

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (150)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata Sandi_password (26)'), 'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/button_Masuk (27)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (114)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (150)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Penelitian (14)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Ketua_btn btn-warning mr-1 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama Kegiatan_nama_kegiatan (97)'), 'Kegiatan 1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Proposal                            _417a29'), 
    'Analisa Data', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Ketua                               _6666eb'), 
    'Anggota', true)

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Jumlah                               _bcc18f'), '5')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan Perubahan (32)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Kegiatan 1 (5)'), 'Kegiatan 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Analisa Data'), 'Analisa Data')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Anggota (7)'), 'Anggota')

WebUI.closeBrowser()

