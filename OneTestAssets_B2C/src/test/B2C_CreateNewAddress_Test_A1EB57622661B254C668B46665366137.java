/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.compare.IStringComparison;
import com.ibm.rational.test.lt.datacorrelation.execution.action.AssignVariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.CustomCodeAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.http.IBasicAuthentication;
import com.ibm.rational.test.lt.execution.http.IConnectionRecord;
import com.ibm.rational.test.lt.execution.http.IHTTPRequest;
import com.ibm.rational.test.lt.execution.http.IHTTPSessionTypes;
import com.ibm.rational.test.lt.execution.http.INtlmAuthenticationContext;
import com.ibm.rational.test.lt.execution.http.ISSLInfo;
import com.ibm.rational.test.lt.execution.http.connection.IConnectionLimitsAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.ConfigConnection;
import com.ibm.rational.test.lt.execution.http.impl.DynamicHTTPRequestsContainer;
import com.ibm.rational.test.lt.execution.http.impl.DynamicRequestContainer;
import com.ibm.rational.test.lt.execution.http.impl.HTTPAction;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPage;
import com.ibm.rational.test.lt.execution.http.impl.HTTPParallel;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostData;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk;
import com.ibm.rational.test.lt.execution.http.impl.HTTPRequest;
import com.ibm.rational.test.lt.execution.http.impl.HTTPThink;
import com.ibm.rational.test.lt.execution.http.impl.INextActionGenerator;
import com.ibm.rational.test.lt.execution.http.impl.PerHostPortConnectionAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.RequestHeaderData;
import com.ibm.rational.test.lt.execution.http.impl.SSLInfo;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.execution.http.util.ConnectionRecordFactory;
import com.ibm.rational.test.lt.execution.http.util.CookieCacheUtil;
import com.ibm.rational.test.lt.execution.http.util.HTTPDataArea;
import com.ibm.rational.test.lt.execution.http.util.PageCacheUtil;
import com.ibm.rational.test.lt.execution.http.vp.IHTTPStatusCodeVP;
import com.ibm.rational.test.lt.execution.http.vp.impl.HTTPStatusCodeVP;
import com.ibm.rational.test.lt.execution.protocol.IProxyServerInfo;
import com.ibm.rational.test.lt.execution.protocol.impl.HTTPTestScriptHelper;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKTimeoutControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.If;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.custom.ICustomCode2;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.RPTCustomCodeExceptionEvent;
import com.ibm.rational.test.lt.kernel.services.RPTCustomCodeVPFailureEvent;
import com.ibm.rational.test.lt.kernel.services.RPTEvent;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@SuppressWarnings("all")
public class B2C_CreateNewAddress_Test_A1EB57622661B254C668B46665366137 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(3);
	private DataVar[] vars = new DataVar[10];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public B2C_CreateNewAddress_Test_A1EB57622661B254C668B46665366137(IContainer container, String invocationId) {
		super(container, "B2C_CreateNewAddress", invocationId, "A1EB57622661B254C668B46665366137");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.CONTINUE);

	}

    public void execute() {
    	try {
				CookieCacheUtil.clearCookieCache((ITestExecutionServices)this);
	PageCacheUtil.clearPageCache((ITestExecutionServices)this);
	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, true);

	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), new RPTContinueEvent("Page title verification failed"), 1, "Page title verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), new RPTContinueEvent("Response code verification failed"), 1, "Response code verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), new RPTContinueEvent("Response size verification failed"), 1, "Response size verification failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(confCon_1(this));
	this.add(ltIf_1(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: B2C_CreateNewAddress_Test_A1EB57622661B254C668B46665366137 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		this.httpTestScriptHelper.preFinishHelper();

		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EAF847C11D22ADC18CE53736636331");	
			vars[0] = new DataVar("hostname", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[1] = new DataVar("store_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[2] = new DataVar("store_name", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[3] = new DataVar("lang_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[4] = new DataVar("catalog_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[5] = new DataVar("port_num", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[6] = new DataVar("personalizationID", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[7] = new DataVar("WCToken", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[8] = new DataVar("WCTrustedToken", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[9] = new DataVar("addressId", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_2",
					(String)(vars[0].getValue()== null?"HOSTNAME": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)("443")), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"HOSTNAME",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private If ltIf_1(IContainer parent) {
		If ifObj = new If(parent, "If", "A1EAF8575CD1D4C0C18CE53736636331");
		ifObj.setCondition(stringComparison_1(ifObj));
		ifObj.setThen(ltContainer_1(ifObj));
		ifObj.setElse(null);
		return ifObj;
	}


	private  IStringComparison stringComparison_1(IContainer parent) {
		IStringComparison cond = new com.ibm.rational.test.lt.compare.StringEquals(parent, "stringComparison_1", "A1EAF8575CD1D4C3C18CE53736636331");
		cond.setOperands(vars[9], "-1");
		cond.setNegative(true);
		cond.setCaseSensitive(true);		
		return cond;
	}

	private Container ltContainer_1(final IContainer parent) {
		Container container = new Container(parent, "Then Block", "A1EAF8575CD1D4D1C18CE53736636331") {

            public void execute() {                
                	this.add(page_1(this));
                super.execute();
            }
       
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }		
		};		
		return container;
	}
private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(9593, 1, parent, parent, "A1EAF847C4FCF7F8C18CE53736636331");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "AddNewAddress", "A1EAF847C4FCF7F8C18CE53736636331") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1EAF847C4FCF7E7C18CE53736636331", false, true,
						"Config_2", "/wcs/resources/store/STOREID/person/@self/contact?langId=LANGID",	"/wcs/resources/store/STOREID/person/@self/contact?langId=LANGID", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

	this.add(dataVarAssign_1(this));
{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(3, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_2(this, true, "A1EAF847C4FCF7E7C18CE53736636331", false, false,
						"Config_2", "/wcs/resources/store/STOREID/person/@self?langId=LANGID",	"/wcs/resources/store/STOREID/person/@self?langId=LANGID", true, false), 50, 100, "A1EAF847C4FCF7FCC18CE53736636331", 3);
				httpParallel.addRequest(1, request_3(this, false, "A1EAF847C4FF3EF7C18CE53736636331", false, false,
						"Config_2", "/wcs/resources/store/STOREID/cart/@self/usable_shipping_info?langId=LANGID",	"/wcs/resources/store/STOREID/cart/@self/usable_shipping_info?langId=LANGID", true, false), 50, 100, "A1EAF847C4FCF7FCC18CE53736636331", 3);
				httpParallel.addRequest(2, request_4(this, false, "A1EAF847C4FF3F8CC18CE53736636331", true, false,
						"Config_2", "/wcs/resources/store/STOREID/cart/@self/shipping_info?langId=LANGID",	"/wcs/resources/store/STOREID/cart/@self/shipping_info?langId=LANGID", true, false), 50, 100, "A1EAF847C4FCF7FCC18CE53736636331", 3);
				httpParallel.addRequest(1, request_5(this, false, "A1EAF847C4FF3EF7C18CE53736636331", true, false,
						"Config_2", "/wcs/resources/store/STOREID/cart/@self/usable_shipping_info?langId=LANGID",	"/wcs/resources/store/STOREID/cart/@self/usable_shipping_info?langId=LANGID", true, false), 40, 100, "A1EAF847C4FF3F9AC18CE53736636331", 3);
				httpParallel.addRequest(0, request_6(this, false, "A1EAF847C4FCF7E7C18CE53736636331", false, false,
						"Config_2", "/wcs/resources/store/STOREID/cart/@self?currency=USD&sortOrderItemBy=orderItemID&langId=LANGID",	"/wcs/resources/store/STOREID/cart/@self?currency=USD&sortOrderItemBy=orderItemID&langId=LANGID", true, false), 40, 100, "A1EAF847C4FF3F9AC18CE53736636331", 3);
			} // Parallal Block End 

	this.add(new CustomCode_1(this, dcVars[2]));
{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_7(this, true, "A1EAF847C4FCF7E7C18CE53736636331", true, false,
						"Config_2", "/search/resources/api/v2/products?currency=USD&id=14280&storeId=STOREID&langId=LANGID",	"/search/resources/api/v2/products?currency=USD&id=14280&storeId=STOREID&langId=LANGID", true, false), 40, 100, "A1EAF847C4FF40A0C18CE53736636331", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_1(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EAF847C4FCF7FCC18CE53736636331", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/checkout/shipping", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCTrustedToken", "WCTRUSTEDTOKEN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCToken", "WCTOKEN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCPersonalization", "PERSONALIZATIONID", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "304", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[0], "\"addressId\":\"(.*?)\"", 1, 1, 0, 0, false, "Content: addressId", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_uri", 57, 6, true, (IDCCoreVar)vars[3], false, "langId", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
		ISubRule sub_1 = new SubRule("req_uri", 21, 7, true, (IDCCoreVar)vars[1], false, "store", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
		ISubRule sub_2 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_8", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
		ISubRule sub_3 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Origin_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Origin", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
		ISubRule sub_5 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_hdr_WCTrustedToken_1", 0, 14, false, (IDCCoreVar)vars[8], false, "WCTrustedToken", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("req_hdr_WCToken_1", 0, 7, false, (IDCCoreVar)vars[7], false, "WCToken", null, 0, false);
	subContainer_1.addSubInstruction(sub_7);
		ISubRule sub_8 = new SubRule("req_hdr_WCPersonalization_1", 0, 17, false, (IDCCoreVar)vars[6], false, "WCPersonalization", null, 0, false);
	subContainer_1.addSubInstruction(sub_8);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EAF847C4FCF7FFC18CE53736636331",
			true,
			false
		);
		
		req.setExpectedResponseCode(201);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(201)), IHTTPStatusCodeVP.SMART_MATCH, new RPTContinueLoopEvent("Response code verification failed", "OUTERMOST"), 1));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("{\"firstName\":\"fst\",\"lastName\":\"lst\",\"addressLine1\":\"address ");
strBuf_1.append("line 1\",\"addressLine2\":\"\",\"city\":\"city\",\"country\":\"country\",");
strBuf_1.append("\"state\":\"state\",\"zipCode\":\"987987\",\"phone1\":\"\",\"nickName\":\"a");
strBuf_1.append("ddressename\",\"email1\":\"last@company.com\",\"addressType\":\"Ship");
strBuf_1.append("pingAndBilling\",\"addressLine\":[\"address line 1\"],\"isNew\":\"tr");
strBuf_1.append("ue\"}");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1EAF847C4FCF84CC18CE53736636331", postData, requestData_1, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_0);

	}

private AssignVariableAction dataVarAssign_1(final IContainer parent) {
	AssignVariableAction varAction = new AssignVariableAction(parent, "A1EAF857C7775070C18CE53736636331");

	varAction.add(vars[9] , dcVars[0]);

	return varAction;
}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EAF847C4FCF88FC18CE53736636331", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(11);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/checkout/shipping", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCTrustedToken", "WCTRUSTEDTOKEN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCToken", "WCTOKEN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCPersonalization", "PERSONALIZATIONID", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_9 = new SubRule("req_uri", 49, 6, true, (IDCCoreVar)vars[3], false, "langId_2", null, 0, false);
	subContainer_2.addSubInstruction(sub_9);
		ISubRule sub_10 = new SubRule("req_uri", 21, 7, true, (IDCCoreVar)vars[1], false, "store_2", null, 0, false);
	subContainer_2.addSubInstruction(sub_10);
		ISubRule sub_11 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_9", null, 0, false);
	subContainer_2.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_2", null, 0, false);
	subContainer_2.addSubInstruction(sub_12);
		ISubRule sub_13 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_2", null, 0, false);
	subContainer_2.addSubInstruction(sub_13);
		ISubRule sub_14 = new SubRule("req_hdr_WCTrustedToken_1", 0, 14, false, (IDCCoreVar)vars[8], false, "WCTrustedToken_2", null, 0, false);
	subContainer_2.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_hdr_WCToken_1", 0, 7, false, (IDCCoreVar)vars[7], false, "WCToken_2", null, 0, false);
	subContainer_2.addSubInstruction(sub_15);
		ISubRule sub_16 = new SubRule("req_hdr_WCPersonalization_1", 0, 17, false, (IDCCoreVar)vars[6], false, "WCPersonalization_2", null, 0, false);
	subContainer_2.addSubInstruction(sub_16);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EAF847C4FCF7FCC18CE53736636331"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EAF847C4FCF892C18CE53736636331",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EAF847C4FF3F05C18CE53736636331", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(11);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/checkout/shipping", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCTrustedToken", "WCTRUSTEDTOKEN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCToken", "WCTOKEN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCPersonalization", "PERSONALIZATIONID", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_17 = new SubRule("req_uri", 68, 6, true, (IDCCoreVar)vars[3], false, "langId_3", null, 0, false);
	subContainer_3.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_uri", 21, 7, true, (IDCCoreVar)vars[1], false, "store_3", null, 0, false);
	subContainer_3.addSubInstruction(sub_18);
		ISubRule sub_19 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_10", null, 0, false);
	subContainer_3.addSubInstruction(sub_19);
		ISubRule sub_20 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_3", null, 0, false);
	subContainer_3.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_3", null, 0, false);
	subContainer_3.addSubInstruction(sub_21);
		ISubRule sub_22 = new SubRule("req_hdr_WCTrustedToken_1", 0, 14, false, (IDCCoreVar)vars[8], false, "WCTrustedToken_3", null, 0, false);
	subContainer_3.addSubInstruction(sub_22);
		ISubRule sub_23 = new SubRule("req_hdr_WCToken_1", 0, 7, false, (IDCCoreVar)vars[7], false, "WCToken_3", null, 0, false);
	subContainer_3.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_hdr_WCPersonalization_1", 0, 17, false, (IDCCoreVar)vars[6], false, "WCPersonalization_3", null, 0, false);
	subContainer_3.addSubInstruction(sub_24);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EAF847C4FCF7FCC18CE53736636331"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EAF847C4FF3F08C18CE53736636331",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EAF847C4FF3F9AC18CE53736636331", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/checkout/shipping", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCTrustedToken", "WCTRUSTEDTOKEN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCToken", "WCTOKEN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCPersonalization", "PERSONALIZATIONID", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "188", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_26 = new SubRule("req_uri", 61, 6, true, (IDCCoreVar)vars[3], false, "langId_4", null, 0, false);
	subContainer_5.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_uri", 21, 7, true, (IDCCoreVar)vars[1], false, "store_4", null, 0, false);
	subContainer_5.addSubInstruction(sub_27);
		ISubRule sub_28 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_11", null, 0, false);
	subContainer_5.addSubInstruction(sub_28);
		ISubRule sub_29 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_4", null, 0, false);
	subContainer_5.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Origin_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Origin_2", null, 0, false);
	subContainer_5.addSubInstruction(sub_30);
		ISubRule sub_31 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_4", null, 0, false);
	subContainer_5.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_hdr_WCTrustedToken_1", 0, 14, false, (IDCCoreVar)vars[8], false, "WCTrustedToken_4", null, 0, false);
	subContainer_5.addSubInstruction(sub_32);
		ISubRule sub_33 = new SubRule("req_hdr_WCToken_1", 0, 7, false, (IDCCoreVar)vars[7], false, "WCToken_4", null, 0, false);
	subContainer_5.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_hdr_WCPersonalization_1", 0, 17, false, (IDCCoreVar)vars[6], false, "WCPersonalization_4", null, 0, false);
	subContainer_5.addSubInstruction(sub_34);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EAF847C4FCF7FCC18CE53736636331"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"PUT",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EAF847C4FF3F9DC18CE53736636331",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_2(HTTPPostData postData) {
				StringBuffer strBuf_2 = new StringBuffer();
strBuf_2.append("{\"x_calculateOrder\":\"1\",\"x_calculationUsage\":\"-1,-2,-3,-4,-5");
strBuf_2.append(",-6,-7\",\"x_allocate\":\"***\",\"x_backorder\":\"***\",\"x_remerge\":\"");
strBuf_2.append("***\",\"x_check\":\"*n\",\"orderId\":\".\",\"addressId\":\"ADDRESSID\"}");
String requestData_2 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1EAF847C4FF3FEAC18CE53736636331", postData, requestData_2, "UTF-8", 9, 176);
	postData.addDataChunk(pdc_1);

	IDataSub subContainer_4 = new DataSub();
	pdc_1.addDataSub(subContainer_4);

		ISubRule sub_25 = new SubRule("req_content", 167, 9, true, (IDCCoreVar)vars[9], false, "addressId", null, 0, false);
	subContainer_4.addSubInstruction(sub_25);
	



	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EAF847C4FF4025C18CE53736636331", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(11);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/checkout/shipping", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCTrustedToken", "WCTRUSTEDTOKEN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCToken", "WCTOKEN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCPersonalization", "PERSONALIZATIONID", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_35 = new SubRule("req_uri", 68, 6, true, (IDCCoreVar)vars[3], false, "langId_5", null, 0, false);
	subContainer_6.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_uri", 21, 7, true, (IDCCoreVar)vars[1], false, "store_5", null, 0, false);
	subContainer_6.addSubInstruction(sub_36);
		ISubRule sub_37 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_12", null, 0, false);
	subContainer_6.addSubInstruction(sub_37);
		ISubRule sub_38 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_5", null, 0, false);
	subContainer_6.addSubInstruction(sub_38);
		ISubRule sub_39 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_5", null, 0, false);
	subContainer_6.addSubInstruction(sub_39);
		ISubRule sub_40 = new SubRule("req_hdr_WCTrustedToken_1", 0, 14, false, (IDCCoreVar)vars[8], false, "WCTrustedToken_5", null, 0, false);
	subContainer_6.addSubInstruction(sub_40);
		ISubRule sub_41 = new SubRule("req_hdr_WCToken_1", 0, 7, false, (IDCCoreVar)vars[7], false, "WCToken_5", null, 0, false);
	subContainer_6.addSubInstruction(sub_41);
		ISubRule sub_42 = new SubRule("req_hdr_WCPersonalization_1", 0, 17, false, (IDCCoreVar)vars[6], false, "WCPersonalization_5", null, 0, false);
	subContainer_6.addSubInstruction(sub_42);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EAF847C4FF3F05C18CE53736636331"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EAF847C4FF4028C18CE53736636331",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EAF847C4FF40A0C18CE53736636331", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(11);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/checkout/shipping", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCTrustedToken", "WCTRUSTEDTOKEN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCToken", "WCTOKEN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("WCPersonalization", "PERSONALIZATIONID", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[1], ".*", 1, 0, 0, 0, false, "Content:cartConetent", null, 0, false);
	IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_43 = new SubRule("req_uri", 88, 6, true, (IDCCoreVar)vars[3], false, "langId_6", null, 0, false);
	subContainer_7.addSubInstruction(sub_43);
		ISubRule sub_44 = new SubRule("req_uri", 21, 7, true, (IDCCoreVar)vars[1], false, "store_6", null, 0, false);
	subContainer_7.addSubInstruction(sub_44);
		ISubRule sub_45 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_13", null, 0, false);
	subContainer_7.addSubInstruction(sub_45);
		ISubRule sub_46 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_6", null, 0, false);
	subContainer_7.addSubInstruction(sub_46);
		ISubRule sub_47 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_6", null, 0, false);
	subContainer_7.addSubInstruction(sub_47);
		ISubRule sub_48 = new SubRule("req_hdr_WCTrustedToken_1", 0, 14, false, (IDCCoreVar)vars[8], false, "WCTrustedToken_6", null, 0, false);
	subContainer_7.addSubInstruction(sub_48);
		ISubRule sub_49 = new SubRule("req_hdr_WCToken_1", 0, 7, false, (IDCCoreVar)vars[7], false, "WCToken_6", null, 0, false);
	subContainer_7.addSubInstruction(sub_49);
		ISubRule sub_50 = new SubRule("req_hdr_WCPersonalization_1", 0, 17, false, (IDCCoreVar)vars[6], false, "WCPersonalization_6", null, 0, false);
	subContainer_7.addSubInstruction(sub_50);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EAF847C4FF3F05C18CE53736636331"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EAF847C4FF40A3C18CE53736636331",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, new RPTContinueLoopEvent("Response code verification failed", "OUTERMOST"), 1));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public class CustomCode_1 extends CustomCodeAction {

		IDataCorrelationVar outVar;
		/**
		 * @param parent
		 * @param name
		 */
		public CustomCode_1(IContainer parent, IDataCorrelationVar outVar) {
			super(parent, "customcode.GetAllProductIdsFromCart", "A1EAF84AC450CF00C18CE53736636331");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
	
	
			IDCCoreVar[] inputVars = {
				dcVars[1]
			};
			
			ICustomCode2 ccclass = 	new customcode.GetAllProductIdsFromCart();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}




	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EAF847C4FF4127C18CE53736636331", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/checkout/shipping", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_51 = new SubRule("req_uri", 79, 6, true, (IDCCoreVar)vars[3], false, "langId_7", null, 0, false);
	subContainer_8.addSubInstruction(sub_51);
		ISubRule sub_52 = new SubRule("req_uri", 64, 7, true, (IDCCoreVar)vars[1], false, "storeId", null, 0, false);
	subContainer_8.addSubInstruction(sub_52);
		ISubRule sub_53 = new SubRule("req_uri", 47, 8, false, (IDCCoreVar)dcVars[2], false, "USD", null, 0, false);
	subContainer_8.addSubInstruction(sub_53);
		ISubRule sub_54 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_14", null, 0, false);
	subContainer_8.addSubInstruction(sub_54);
		ISubRule sub_55 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_7", null, 0, false);
	subContainer_8.addSubInstruction(sub_55);
		ISubRule sub_56 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_7", null, 0, false);
	subContainer_8.addSubInstruction(sub_56);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EAF84AC450CF00C18CE53736636331"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EAF847C4FF40A0C18CE53736636331"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EAF847C4FF412AC18CE53736636331",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
}
