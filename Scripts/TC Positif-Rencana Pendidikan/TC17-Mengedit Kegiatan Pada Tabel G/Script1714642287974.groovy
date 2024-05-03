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

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Username_username (26)'), 'mario')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (26)'), 
    'mHeVG5S2v2QyQ6TvDNzjuw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_FRK  FED - LOGIN/input_Kata                                 _617843 (26)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rencana Kerja (20)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/a_Rekap Kegiatan (26)'))

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/i_Menunggu_bi bi-pencil-square (2)'))

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Nama Kegiatan_nama_kegiatan (20)'), 'Membimbing dosen baru yang lebih rendah jabatannya')

WebUI.setText(findTestObject('Object Repository/Page_FRK  FED/input_Jumlah Dosen Dibimbing_jumlah_dosen (1)'), '2')

WebUI.click(findTestObject('Object Repository/Page_FRK  FED/button_Simpan Perubahan (10)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_FRK  FED/td_Membimbing dosen baru yang lebih rendah _1011c4'), 
    'Membimbing dosen baru yang lebih rendah jabatannya')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_2 (5)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu (28)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_FRK  FED/td_Menunggu_1 (24)'), 0)

WebUI.closeBrowser()

