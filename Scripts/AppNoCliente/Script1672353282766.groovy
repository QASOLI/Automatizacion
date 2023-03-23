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

Mobile.startApplication('C:\\Users\\ARMASB\\Downloads\\app-debug (11).apk', true)

Mobile.setText(findTestObject('Object Repository/App No Cliente Valida/android.widget.EditText'), '0922660808', 0)

Mobile.tap(findTestObject('Object Repository/App No Cliente Valida/android.widget.Button - CONTINUAR'), 0)

Mobile.tap(findTestObject('Object Repository/App No Cliente Valida/android.widget.Button - CONTINUAR (1)'), 0)

Mobile.tap(findTestObject('Object Repository/App No Cliente Valida/android.widget.Button - EMPECEMOS'), 0)

Mobile.tap(findTestObject('Object Repository/App No Cliente Valida/android.widget.Button - CONTINUAR (2)'), 0)

Mobile.setText(findTestObject('Object Repository/App No Cliente Valida/android.widget.EditText (1)'), '0996903086', 0)

Mobile.setText(findTestObject('Object Repository/App No Cliente Valida/android.widget.EditText (2)'), 'barmas@solidario.fin.ec', 
    0)

Mobile.tap(findTestObject('Object Repository/App No Cliente Valida/android.widget.Button - CONTINUAR (3)'), 0)

Mobile.tap(findTestObject('Object Repository/App No Cliente Valida/android.widget.Button - LO ENTIENDO'), 0)

Mobile.setText(findTestObject('Object Repository/App No Cliente Valida/android.widget.EditText (3)'), '42385727', 0)

Mobile.setText(findTestObject(''), '0922660808B', 0)

Mobile.setText(findTestObject('Object Repository/App No Cliente Valida/android.widget.EditText (5)'), '11111111B', 0)

Mobile.setText(findTestObject('Object Repository/App No Cliente Valida/android.widget.EditText - 0922660808'), '0922660808B', 
    0)

Mobile.setText(findTestObject('Object Repository/App No Cliente Valida/android.widget.EditText (6)'), '11111111B', 0)

Mobile.tap(findTestObject('Object Repository/App No Cliente Valida/android.widget.Button - CONTINUAR (4)'), 0)

Mobile.closeApplication()

