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

WebUI.navigateToUrl('http://172.19.19.94:8091/bancaweb3.0/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/ClienteNormal_Flujo/Page_Autenticacin/input_Banca por internet_mat-input-0'), 
    '1715070825B')

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/ClienteNormal_Flujo/Page_Autenticacin/input_Usuario_mat-input-1'), 
    'GYDmRgS5yd5vvbvKzxSMZQ==')

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/ClienteNormal_Flujo/Page_Autenticacin/span_Ingresar'))

WebUI.delay(7)

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/ClienteNormal_Flujo/Page_Autenticacin/input_Ingresa el cdigo temporal_mat-input-2'), 
    'EfIRQyeSOK4=')

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/ClienteNormal_Flujo/Page_Autenticacin/span_Continuar'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/ClienteNormal_Flujo/Page_Resumen/a_Crditos'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/ClienteNormal_Flujo/Page_Crditos/a_Renovar crdito'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/ClienteNormal_Flujo/Page_Crditos/svg'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/ClienteNormal_Flujo/Page_Crditos/span_Solicitar'))

