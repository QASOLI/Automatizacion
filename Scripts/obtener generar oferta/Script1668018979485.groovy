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

WebUI.setText(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Login/input_Login_UserName (1)'), 'chavezt')

WebUI.setEncryptedText(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Login/input_Oficina_Password (1)'), 
    'SFTQUhjBfIY=')

WebUI.sendKeys(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Login/input_Oficina_Password (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Index/a_SIMULADOR (1)'))

WebUI.click(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Index/a_MODIFICAR OFERTA (1)'))

WebUI.setText(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Simulador/input_Identificacin_inputIdentificacion (1)'), 
    '1722225610')

WebUI.click(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Simulador/button_Buscar (1)'))

WebUI.click(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Simulador/button_Generar Oferta (1)'))

WebUI.click(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Simulador/button_Ofertar'))

WebUI.click(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Simulador/button_Generar Campaa'))

WebUI.click(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Simulador/span_'))

WebUI.click(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Simulador/button_Ofertar'))

WebUI.click(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Simulador/button_Generar Campaa'))

WebUI.click(findTestObject('Object Repository/Simulador_Punta/buscando divs/Page_Simulador/span_'))

