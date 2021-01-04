import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Board {
	@Keyword
	def create() {
		WebUI.click(findTestObject('Object Repository/Page_Boards  Trello/div_Create new board'))

		WebUI.setText(findTestObject('Object Repository/Page_Boards  Trello/input_contact us__23NUW98LaZfBpQ'), 'yay')

		WebUI.click(findTestObject('Object Repository/Page_Boards  Trello/button_Create Board'))
	}


	@Keyword
	def delete() {
		WebUI.click(findTestObject('Board_Name  Trello/del/a_More'))

		WebUI.click(findTestObject('Board_Name  Trello/del/a_Close Board'))

		WebUI.click(findTestObject('Board_Name  Trello/del/input_Close Board_js-confirm full nch-button nch-button--danger'))

		WebUI.click(findTestObject('Board_Name  Trello/del/a_Permanently Delete Board'))

		WebUI.click(findTestObject('Board_Name  Trello/del/input_Delete Board_js-confirm full nch-button nch-button--danger'))
	}
}
