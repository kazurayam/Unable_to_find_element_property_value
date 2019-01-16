import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
	
ResponseObject response = WS.sendRequest(findTestObject('Request'))

println response.getResponseText()

println response.getResponseBodyContent()
	
println "getContentType: " + response.getContentType()

WS.verifyElementPropertyValue(response, 'results[0].queries.getinfo.cats[0].catid', "foo")
	
	
