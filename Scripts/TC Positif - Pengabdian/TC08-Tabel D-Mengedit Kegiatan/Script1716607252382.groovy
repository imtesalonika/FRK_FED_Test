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

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (131)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata Sandi_password (7)'), 'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/button_Masuk (8)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (95)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (131)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Pengabdian (8)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Editor_btn btn-warning mr-1'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama Kegiatan_nama_kegiatan (82)'), 'Kegiatan 1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Pilih kategori                      _6ad7de (1)'), 
    'Menulis 1 judul, ada editor, tiap chapter ada Kontributor', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Pilih tahapan                       _1e0045 (1)'), 
    '50% dari isi buku', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Pilih jenis pengerjaan              _80c217 (1)'), 
    'Kelompok', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Pilih peran                         _ac4fe8 (1)'), 
    'Kontributor', true)

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Jumlah                               _63c798'), '6')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan Perubahan (31)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Kegiatan 1 (4)'), 'Kegiatan 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Menulis 1 judul, ada editor, tiap chapte_35b53a (1)'), 
    'Menulis 1 judul, ada editor, tiap chapter ada Kontributor')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_50 dari isi buku (1)'), '50% dari isi buku')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Kelompok (1)'), 'Kelompok')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Kontributor (1)'), 'Kontributor')

WebUI.closeBrowser()

