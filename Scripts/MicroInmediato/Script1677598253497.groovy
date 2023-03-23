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

Mobile.startApplication('C:\\Users\\ARMASB\\OneDrive - Banco Solidario\\Escritorio\\MicroAppsQA03_SegIncedioRegCiv.apk', 
    true)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - Usuario de BankPlus'), 'matad', 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - Contrasea de BankPlus'), '111111', 
    0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - Crea tu PIN - Usa 4 dgitos'), '1234', 
    0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.LinearLayout'), 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - Nmero de cdula del cliente'), GlobalVariable.IdentificacionMicroapp, 
    0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.TextView - CONSULTAR'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.TextView - SI CALIFICA'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.TextView - CONFIRMAR LA UBICACIN'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.Button - SIGUIENTE'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.Button - SIGUIENTE (1)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - 0'), '40', 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - 0 (1)'), '30', 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - 0 (2)'), '10', 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - 0 (3)'), '5', 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - 0 (4)'), '30', 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - 0 (5)'), '50', 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - 0 (6)'), '10', 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - 0 (7)'), '2', 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - 0 (8)'), '11000', 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - 0 (9)'), '7000', 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - 0 (10)'), '750', 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - 0 (11)'), '400', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.setText(findTestObject('Object Repository/App-Micro/android.widget.EditText - Monto'), '750', 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.CheckedTextView - 24'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.Spinner (1)'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.CheckedTextView - CAPITAL DE TRABAJO'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.TextView - DDMMAA'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.TextView - CALCULAR CUOTA'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.Button - SEGUIR'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.TextView - Tomar foto de la cdula'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.TextView - TOMAR FOTO'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.TextView - Tomar foto del negocio'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.Button - FINALIZAR'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.Button - 3'), 0)

Mobile.tap(findTestObject('Object Repository/App-Micro/android.widget.Button - 4'), 0)

Mobile.closeApplication()

