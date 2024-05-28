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

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (127)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata Sandi_password (3)'), 'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/button_Masuk (4)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (91)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (127)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Pengabdian (4)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Tambah                    Kegiatan (4)'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama Kegiatan_nama_kegiatan (79)'), 'Penelitian 1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Pilih kategori                      _fe4a9e (1)'), 
    'Menulis 1 judul, direncanakan terbit ber-ISBN, ada kontrak penerbitan dan atau sudah diterbitkan dan ber-ISN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Pilih tahapan                       _938b37 (1)'), 
    'Pendahuluan', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Pilih jenis pengerjaan              _22d8df (1)'), 
    'Mandiri', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Pilih peran                         _0a5114 (1)'), 
    'Editor', true)

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Jumlah Anggota_jumlah_anggota (1)'), '5')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan (71)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Penelitian 1 (4)'), 'Penelitian 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Menulis 1 judul, direncanakan terbit ber_5c71e6 (1)'), 
    'Menulis 1 judul, direncanakan terbit ber-ISBN, ada kontrak penerbitan dan atau sudah diterbitkan dan ber-ISN')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Pendahuluan (1)'), 'Pendahuluan')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Mandiri (1)'), 'Mandiri')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Editor (1)'), 'Editor')

WebUI.closeBrowser()

