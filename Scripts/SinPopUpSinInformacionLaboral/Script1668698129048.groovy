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

WebUI.navigateToUrl('https://bpservicepos.com/bancaweb3.0/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Autenticacin/input_Banca por internet_mat-input-0'), 
    '1001396082B')

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Autenticacin/input_Usuario_mat-input-1'), 
    'GYDmRgS5yd5vvbvKzxSMZQ==')

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Autenticacin/button_Ingresar'))

WebUI.verifyTextPresent('Ingresa el código temporal', false)

WebUI.setEncryptedText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Autenticacin/input_Ingresa el cdigo temporal_mat-input-2'), 
    'NquYGn8SMjs=')

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Autenticacin/button_Continuar'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Resumen/a_Crditos'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/a_Renovar crdito'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/use'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/button_Solicitar'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/a_10'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input__TotalIngresos'), 
    '$2.500,00')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input__ActSalariosueldo'), 
    '$1.790,00')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input__TotalGastos'), 
    '$200,00')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input__GasAlimentacion'), 
    '$100,00')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input__GasServiciobasico'), 
    '$50,00')

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/span__checkmark1'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input_Tiempo Residencia (aos)_AnioResidencia'))

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input_Debers realizar tu pago todos los mes_fca271'))

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input_Nombre Empresa_NombreEmpresa'), 
    'Conduit')

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/select_Seleccione ProvinciaAZUAYBOLIVARCAAR_79f746'), 
    '17', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/select_Seleccione CantnCAYAMBEMEJIAPEDRO MO_d54ebe'), 
    '1701', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/select_Seleccione ParroquiaALANGASAMAGUAAAT_dc6fce'), 
    '170108', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/select_Seleccione Barrio1 DE MAYO10 DE JUNI_1cc827'), 
    '170108294', true)

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input_Calle Principal_CallePrincipal'), 
    'CALLE A')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input_Nmero_Numero'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input_Calle Transversal_CalleTransversal'), 
    'CALLE B')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input_Extensin_ExtensionTrabajo'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input_Correo Electrnico_eMailTrabajo'), 
    'qasolidario01@gmail.com')

WebUI.click(findTestObject('Object Repository/Rapiditos Clientes/SinPopUp_SinInformacionLaboral/Page_Solicitar crdito/input_Debers realizar tu pago todos los mes_fca271'))

