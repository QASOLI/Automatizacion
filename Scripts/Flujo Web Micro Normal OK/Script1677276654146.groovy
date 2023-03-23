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

WebUI.navigateToUrl('https://bs-autentica.com/bancaweb3.0/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Autenticacin/input_Banca por internet_mat-input-0'), 
    '2300549587B')

WebUI.setEncryptedText(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Autenticacin/input_Usuario_mat-input-1'), 
    'GYDmRgS5yd5vvbvKzxSMZQ==')

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Autenticacin/span_Ingresar'))

WebUI.setEncryptedText(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Autenticacin/input_Ingresa el cdigo temporal_mat-input-2'), 
    'OZDE7IGCDIc=')

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Autenticacin/span_Continuar'))

WebUI.verifyTextPresent('TIENES PRE-APROBADO', false)

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/span_Aplicar Ahora'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/img'))

WebUI.verifyTextPresent('por ser un cliente preferencial', false)

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input_Cundo deseas pagar tu primera cuota_b_d16ea4'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/span_Plan D_checkmark1'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input_Costo mensual del seguro_btnAceptar'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input_Cuenta de ahorros conmigo_btnAceptarS_11e6da'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input_Cuenta de ahorros conmigo_btnAceptarS_11e6da'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input_Costo mensual del seguro_btnAceptar'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__CodigoDactilar'))

WebUI.setText(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__CodigoDactilar'), '1111111111')

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input_Cuenta de ahorros conmigo_btnAceptarS_11e6da'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input_Cuenta de ahorros conmigo_btnAceptarS_11e6da'))

WebUI.verifyTextPresent('Felicidades', false)

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__btn btn-default'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__btn btn-default'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__btn btn-default'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__btn btn-default'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__btn btn-default'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__btn btn-default'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__btn btn-default'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__btn btn-default'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__btn btn-default'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__btn btn-default'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__btn btn-default'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input__btn btn-default'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input_Todos los campos  son obligatorios_bt_3b7b65'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input_Todos los campos  son obligatorios_bt_3b7b65'))

WebUI.verifyTextPresent('Tu dinero ya está disponible en la cuenta', false)

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input_Gracias por confiar en Banco Solidari_92ad5e'))

WebUI.click(findTestObject('Object Repository/MicroWeb Flujo Normal Ok/Page_Resumen/input_Gracias por confiar en Banco Solidari_92ad5e'))

WebUI.closeBrowser()

