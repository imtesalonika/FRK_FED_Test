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

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (145)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata Sandi_password (21)'), 'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED - LOGIN/button_Masuk (22)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (109)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (145)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Penelitian (9)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Tambah                    Kegiatan (5)'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama Kegiatan_nama_kegiatan (92)'), 'Penelitian 1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Pilih Kategori                      _213432'), 
    'Diterbitkan oleh Jurnal ilmiah/majalah ilmiah ber-ISSN tidak terakreditasi atau proceedings seminar nasional maupun internasional', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Pilih Jenis Pengerjaan              _bcc35e (1)'), 
    'Mandiri', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_FRK  FED/select_Pilih Peran                         _197258'), 
    'Penulis Utama', true)

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan (81)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Penelitian 1 (14)'), 'Penelitian 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Diterbitkan oleh Jurnal ilmiahmajalah il_6aa294'), 
    'Diterbitkan oleh Jurnal ilmiah/majalah ilmiah ber-ISSN tidak terakreditasi atau proceedings seminar nasional maupun internasional')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Mandiri (6)'), 'Mandiri')

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Penulis Utama (1)'), 'Penulis Utama')

WebUI.closeBrowser()

