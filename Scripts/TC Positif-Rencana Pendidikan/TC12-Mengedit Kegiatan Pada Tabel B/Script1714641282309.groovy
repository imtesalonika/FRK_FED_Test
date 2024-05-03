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

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (15)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (15)'), 
    'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (15)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/span_Rencana Kerja (2)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (15)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/i_Menunggu_bi bi-pencil-square'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama                                 _c3a99b (1)'), 
    'Asistensi Praktikum Kelompok')

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Jumlah Kelas_jumlah_kelas (2)'), '10')

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_SKS Praktikum (1 SKS  2 jam)_sks_matakuliah (2)'), '3')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan Perubahan (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Asistensi Praktikum Kelompok'), 'Asistensi Praktikum Kelompok')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_10 (2)'), 0)

WebUI.rightClick(findTestObject('Object Repository/Page_FRK  FED/td_10 (2)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/td_3 (2)'))

WebUI.rightClick(findTestObject('Object Repository/Page_FRK  FED/td_3 (2)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/div_Rekap Kegiatan                Rencana K_e0d485'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu (17)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu_1 (13)'), 0)

WebUI.closeBrowser()

