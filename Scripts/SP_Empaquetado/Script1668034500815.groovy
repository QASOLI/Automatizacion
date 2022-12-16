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

WebUI.navigateToUrl('http://172.19.19.94:8091/SimuladorEnPunta/')

WebUI.setText(findTestObject('Object Repository/SimuladorEnPunta_Act/Empaquetado/Page_Login/input_Login_UserName'), 'chavezt')

WebUI.setEncryptedText(findTestObject('Object Repository/SimuladorEnPunta_Act/Empaquetado/Page_Login/input_Oficina_Password'), 
    'SFTQUhjBfIY=')

WebUI.click(findTestObject('Object Repository/SimuladorEnPunta_Act/Empaquetado/Page_Login/input_Oficina_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/SimuladorEnPunta_Act/Empaquetado/Page_Index/a_SIMULADOR'))

WebUI.click(findTestObject('Object Repository/SimuladorEnPunta_Act/Empaquetado/Page_Index/a_MODIFICAR OFERTA'))

WebUI.setText(findTestObject('Object Repository/SimuladorEnPunta_Act/Empaquetado/Page_Simulador/input_Identificacin_inputIdentificacion'), 
    '1722225610')

WebUI.click(findTestObject('Object Repository/SimuladorEnPunta_Act/Empaquetado/Page_Simulador/button_Buscar'))

WebUI.click(findTestObject('Object Repository/SimuladorEnPunta_Act/Empaquetado/Page_Simulador/button_Generar Oferta'))

WebUI.click(findTestObject('Object Repository/SimuladorEnPunta_Act/Empaquetado/Page_Simulador/button_Ofertar'))

WebUI.click(findTestObject('Object Repository/SimuladorEnPunta_Act/Empaquetado/Page_Simulador/button_Generar Campaa'))

WebUI.click(findTestObject('Object Repository/SimuladorEnPunta_Act/Empaquetado/Page_Simulador/span_'))

