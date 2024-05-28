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

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (163)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata Sandi_password (39)'), 'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/button_Masuk (40)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (126)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (163)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Penelitian (27)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Ketua_btn btn-warning mr-1 (4)'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama Kegiatan_nama_kegiatan (104)'), 'Kegiatan 1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Tingkat regional daerah,            _1a4a1e'), 
    'Tingkat regional daerah, institusional(minimum fakultas)', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Ketua                               _f12a49'), 
    'Anggota', true)

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Jumlah Anggota_jumlah_anggota (4)'), '6')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Individual                          _e324d9'), 
    'Kelompok', true)

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan Perubahan (43)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Kegiatan 1 (18)'), 'Kegiatan 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Tingkat regional daerah, institusional(m_764747 (1)'), 
    'Tingkat regional daerah, institusional(minimum fakultas)')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Kelompok (6)'), 'Kelompok')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Anggota (10)'), 'Anggota')

WebUI.closeBrowser()

