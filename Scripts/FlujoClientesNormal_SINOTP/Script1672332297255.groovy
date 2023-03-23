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

//Abrir otra pestaña
WebUI.delay(30)

//WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Autenticacin/input_Ingresa el cdigo temporal_mat-input-2'), 
//  'iDckRE3CwE4=')
WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Autenticacin/span_Continuar'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Resumen/a_Crditos'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/a_Renovar crdito'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/svg'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/span_Solicitar'))

//WebUI.verifyTextPresent('tienes un crédito pre-aprobado', false)

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Tasa nominal 15.59_Continuar'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/a_25'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input__TotalIngresos'), '$5.800,00')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input__ActSalariosueldo'), 
    '$2.500,00')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input__TotalGastos'), '$100,00')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input__GasAlimentacion'), 
    '$60,00')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input__GasServiciobasico'), 
    '$20,00')

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input__GasOtros'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/span__checkmark1'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Tiempo Residencia (aos)_AnioResidencia'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Calle Principal_CallePrincipal'), 
    'Calle A')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Nmero_Numero'), '123')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Calle Transversal_CalleTransversal'), 
    'Calle B')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Correo Electrnico_eMailTrabajo'), 
    'bral_9210@hotmail.com')

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/select_Seleccione ProvinciaAZUAYBOLIVARCAAR_79f746'), 
    '17', true)

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/select_Seleccione ProvinciaAZUAYBOLIVARCAAR_79f746'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/select_Seleccione CantnCAYAMBEMEJIAPEDRO MO_d54ebe'), 
    '1701', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/select_Seleccione ParroquiaALANGASAMAGUAAAT_dc6fce'), 
    '170156', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/select_Seleccione Barrio14 DE MARZO4 DE MAR_8c0082'), 
    '170156131', true)

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input__Telefono'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Ingrese un telfono de contacto con su_f71c15'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/span_Familia Segura_checkmark1'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/input_Debers realizar tu pago todos los mes_fca271'))

