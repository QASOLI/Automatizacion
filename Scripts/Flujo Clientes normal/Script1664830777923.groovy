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
WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentWindow + 1)

//Ingreso url
WebUI.navigateToUrl('https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1664831675&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d1c29005b-f563-b878-20dd-aaa49188fbaf&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015')

WebUI.setText(findTestObject('Rapiditos Clientes/Flujo Clientes/Outlook/Page_Sign in to your Microsoft account/input_Sign in_loginfmt'), 
    'barmas@solidario.fin.ec')

WebUI.click(findTestObject('Rapiditos Clientes/Flujo Clientes/Outlook/Page_Sign in to your Microsoft account/input_Create one_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Rapiditos Clientes/Flujo Clientes/Outlook/Page_Iniciar sesin en Outlook/input_Escribir contrasea_passwd'), 
    'UqJuYN7n3LhVK8BQTCG8cg==')

WebUI.click(findTestObject('Rapiditos Clientes/Flujo Clientes/Outlook/Page_Iniciar sesin en Outlook/input_He olvidado mi contrasea_idSIButton9'))

WebUI.click(findTestObject('Rapiditos Clientes/Flujo Clientes/Outlook/Page_Iniciar sesin en Outlook/input_No volver a mostrar_idBtn_Back'))

WebUI.click(findTestObject(null))

WebUI.verifyElementClickable(findTestObject('LOGIN_OTP/Login_otp/Abrir notificación'))

WebUI.delay(30)

WebUI.click(findTestObject('LOGIN_OTP/Login_otp/Abrir notificación'))

OTP1 = WebUI.getText(findTestObject('LOGIN_OTP/Login_otp/TomarOTP'))

System.out.println('OTP:' + OTP1)

WebUI.delay(5)

WebUI.switchToWindowIndex(currentWindow //Para regresar al navegador primero
    )

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Autenticacin/input_Ingresa el cdigo temporal_mat-input-2'), 
    OTP1)

//WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Autenticacin/input_Ingresa el cdigo temporal_mat-input-2'), 
//  'iDckRE3CwE4=')
WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Autenticacin/span_Continuar'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Resumen/a_Crditos'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/a_Renovar crdito'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/svg'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/Flujo Clientes/Page_Crditos/span_Solicitar'))

WebUI.verifyTextPresent('tienes un crédito pre-aprobado', false)

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

