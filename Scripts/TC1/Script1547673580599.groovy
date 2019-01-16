import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

def url = 'https://kazurayam.github.com/Unable_to_find_element_property_value/resp.json'

//System.out.println('Url : ’ + url)
	
ResponseObject response = WS.sendRequest(findTestObject('POST-UrlGetInfoCopy'))
	
WS.verifyElementPropertyValue(response, 'results[0].queries.getinfo.cats[0].catid', "foo")
	
	
