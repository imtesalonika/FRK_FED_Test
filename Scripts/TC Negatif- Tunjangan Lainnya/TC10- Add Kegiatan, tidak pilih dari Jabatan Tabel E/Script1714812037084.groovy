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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.setText(findTestObject('Object Repository/Test Add Data Tunjangan Lainnya - TC Negatif/Tabel E/Page_FRK  FED - LOGIN/input_Username_username'), 
    'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Add Data Tunjangan Lainnya - TC Negatif/Tabel E/Page_FRK  FED - LOGIN/input_Kata                                 _617843'), 
    'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.sendKeys(findTestObject('Object Repository/Test Add Data Tunjangan Lainnya - TC Negatif/Tabel E/Page_FRK  FED - LOGIN/input_Kata                                 _617843'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Test Add Data Tunjangan Lainnya - TC Negatif/Tabel E/Page_FRK  FED/a_Rencana Kerja'))

WebUI.click(findTestObject('Object Repository/Test Add Data Tunjangan Lainnya - TC Negatif/Tabel E/Page_FRK  FED/a_Rekap Kegiatan'))

WebUI.click(findTestObject('Object Repository/Test Add Data Tunjangan Lainnya - TC Negatif/Tabel E/Page_FRK  FED/b_Tunjangan Lainnya'))

WebUI.click(findTestObject('Object Repository/Test Add Data Tunjangan Lainnya - TC Negatif/Tabel E/Page_FRK  FED/button_Tambah Kegiatan'))

WebUI.setText(findTestObject('Object Repository/Test Add Data Tunjangan Lainnya - TC Negatif/Tabel E/Page_FRK  FED/input_Nama Kegiatan_nama_kegiatan'), 
    'Kegiatan')

WebUI.click(findTestObject('Object Repository/Test Add Data Tunjangan Lainnya - TC Negatif/Tabel E/Page_FRK  FED/button_Simpan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Test Add Data Tunjangan Lainnya - TC Negatif/Tabel E/Page_FRK  FED/label_Jabatan'), 
    0)

WebUI.closeBrowser()

