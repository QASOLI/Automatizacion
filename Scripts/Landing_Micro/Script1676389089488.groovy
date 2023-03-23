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

WebUI.navigateToUrl(GlobalVariable.URLLANDINGMICRO)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Microcredito/MicroWeb/Page_MicroCreditoInternet - Banco Solidario/input__PrimerNombre'), 
    'Bryan')

WebUI.setText(findTestObject('Object Repository/Microcredito/MicroWeb/Page_MicroCreditoInternet - Banco Solidario/input__PrimerApellido'), 
    'Armas')

WebUI.setText(findTestObject('Object Repository/Microcredito/MicroWeb/Page_MicroCreditoInternet - Banco Solidario/input__Identificacion'), 
    GlobalVariable.IdentificacionMicroapp)

WebUI.selectOptionByValue(findTestObject('Object Repository/Microcredito/MicroWeb/Page_MicroCreditoInternet - Banco Solidario/select_Ao2002200120001999199819971996199519_f0ed33'), 
    GlobalVariable.aniomicro, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Microcredito/MicroWeb/Page_MicroCreditoInternet - Banco Solidario/select_MesEneroFebreroMarzoAbrilMayoJunioJu_5634e8'), 
    GlobalVariable.mesmicro, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Microcredito/MicroWeb/Page_MicroCreditoInternet - Banco Solidario/select_Da0102030405060708091011121314151617_f0f7d8'), 
    GlobalVariable.diamicro, true)

WebUI.setText(findTestObject('Object Repository/Microcredito/MicroWeb/Page_MicroCreditoInternet - Banco Solidario/input__CorreoElectronico'), 
    'barmas@solidario.fin.ec')

WebUI.click(findTestObject('Object Repository/Microcredito/MicroWeb/Page_MicroCreditoInternet - Banco Solidario/input_Ingresa tu correo electrnico_Autorizacion'))

WebUI.click(findTestObject('Object Repository/Microcredito/MicroWeb/Page_MicroCreditoInternet - Banco Solidario/input_He ledo y acepto los trminos y condic_877cc8'))

WebUI.takeFullPageScreenshot()

