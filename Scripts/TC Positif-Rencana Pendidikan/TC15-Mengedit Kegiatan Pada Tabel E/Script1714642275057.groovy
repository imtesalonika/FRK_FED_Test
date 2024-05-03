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

WebUI.navigateToUrl('http://localhost:8000/')

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (25)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (25)'), 
    'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (25)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (19)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (25)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Menunggu_buttonEdit-1 (2)'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama                                 _c3a99b (5)'), 
    'Bimbingan Skripsi Mahasiswa Sarjana Sistem Informasi')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/div_Jumlah Kelompok'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Jumlah Kelompok_jumlah_kelompok (6)'), '4')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan Perubahan (9)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Bimbingan Skripsi Mahasiswa Sarjana Sist_49e09f'), 
    'Bimbingan Skripsi Mahasiswa Sarjana Sistem Informasi')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_4 (5)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu (27)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu_1 (23)'), 0)

WebUI.closeBrowser()

