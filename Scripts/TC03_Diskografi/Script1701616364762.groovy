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

WebUI.navigateToUrl('https://berandalanjenius.com/')

WebUI.mouseOver(findTestObject('Object Repository/Page_Berandalan Jenius - Professional Punkrockstar/a_Musik'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius - Professional Punkrockstar/span_Diskografi'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius - Professional Punkrockstar/img'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Berandalan Jenius  Kisah Bersama Mu (2020)/a_Musik'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius  Kisah Bersama Mu (2020)/span_Diskografi'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius - Professional Punkrockstar/img_1'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Berandalan Jenius  Ada Kucing (2020)/a_Musik'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius  Ada Kucing (2020)/span_Diskografi'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius - Professional Punkrockstar/img_1_2'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Berandalan Jenius  Danau Galau (2021)/a_Musik'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius  Danau Galau (2021)/span_Diskografi'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius - Professional Punkrockstar/img_1_2_3'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Berandalan Jenius  Genggaman Erat, Jan_b32a6b/a_Musik'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius  Genggaman Erat, Jan_b32a6b/span_Diskografi'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius - Professional Punkrockstar/img_1_2_3_4'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Berandalan Jenius  Danau Galau (2022 R_a1b57c/a_Musik'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius  Danau Galau (2022 R_a1b57c/span_Diskografi'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius - Professional Punkrockstar/img_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Page_Berandalan Jenius  Tua  Bosan (2022)/span_Home'))

WebUI.closeBrowser()

