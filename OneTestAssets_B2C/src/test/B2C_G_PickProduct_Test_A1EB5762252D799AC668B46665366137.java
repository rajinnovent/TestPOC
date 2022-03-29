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
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.If;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.TestFlowControlAction;
import com.ibm.rational.test.lt.kernel.custom.ICustomCode2;
import com.ibm.rational.test.lt.kernel.dc.IKDCCoreVar;
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
public class B2C_G_PickProduct_Test_A1EB5762252D799AC668B46665366137 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(9);
	private DataVar[] vars = new DataVar[29];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public B2C_G_PickProduct_Test_A1EB5762252D799AC668B46665366137(IContainer container, String invocationId) {
		super(container, "B2C_G_PickProduct", invocationId, "A1EB5762252D799AC668B46665366137");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.CONTINUE);

	}

    public void execute() {
    	try {
			

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
		For loopNm_2 = Loop_1(this);
		this.add(loopNm_2);
		loopNm_2.addVarsToInit(Arrays.asList((IKDCCoreVar)vars[4],(IKDCCoreVar)vars[2],(IKDCCoreVar)vars[12],(IKDCCoreVar)vars[11],(IKDCCoreVar)vars[0],(IKDCCoreVar)vars[20],(IKDCCoreVar)vars[6],(IKDCCoreVar)vars[22],(IKDCCoreVar)vars[13],(IKDCCoreVar)vars[1],(IKDCCoreVar)vars[21],(IKDCCoreVar)vars[28],(IKDCCoreVar)vars[3],(IKDCCoreVar)vars[10]));
		
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: B2C_G_PickProduct_Test_A1EB5762252D799AC668B46665366137 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1EAF555806B6AAEE6D6B53662323963");	
			vars[0] = new DataVar("hostname", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[1] = new DataVar("store_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[2] = new DataVar("store_name", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[3] = new DataVar("lang_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[4] = new DataVar("catalog_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[5] = new DataVar("port_num", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[6] = new DataVar("contract_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[7] = new DataVar("personalizationID", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[8] = new DataVar("WCToken", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[9] = new DataVar("WCTrustedToken", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[10] = new DataVar("product_identifier", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[11] = new DataVar("product_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[12] = new DataVar("part_number", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[13] = new DataVar("sku_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[14] = new DataVar("sku_identifier", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[15] = new DataVar("sku_partnumber", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[16] = new DataVar("orderId", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[17] = new DataVar("orderItemId", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[18] = new DataVar("current_nbr_items_in_cart", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[19] = new DataVar("local_nbr_items", vars[18], IDataArea.TEST, "IGNORE", false, false);

	
		vars[20] = new DataVar("category_name_lower", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[21] = new DataVar("category_name", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[22] = new DataVar("category_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[23] = new DataVar("category_identifier", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[24] = new DataVar("category_identifiers", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[25] = new DataVar("category_ids", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[26] = new DataVar("category_names", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[27] = new DataVar("inventoryQuantity", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[28] = new DataVar("enable_80_20", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
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
					Integer.parseInt((String)(vars[5].getValue()== null?"443": (String)vars[5].getValue())), 
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

	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent,
				 "Loop3",
				 "A1EB1AE524EE1DB0D99FB83331643537",
				 0,
				 0,
				 0,
				 1,
				 1,
				 true, 
				 false,
				 null) {

			
		  
		    public void executeLoop() { 
		    	
	
	
	
	               
				this.add(page_1(this));
	this.add(ltIf_2(this));
	this.add(page_3(this));
			super.executeLoop();
		    }
		
		};
		return forLoop;
	}
private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(12541, 1, parent, parent, "A1EB1AE3E3A01673D99FB83331643537");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "BrowseToProductsList", "A1EB1AE3E3A01673D99FB83331643537") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1EAF55582BD2814E6D6B53662323963", false, false,
						"Config_2", "/search/resources/store/STOREID/sitecontent/suggestions?catalogId=CATALOGID&contractId=CONTRACTID&suggestType=Category&suggestType=Brand&langId=LANGID",	"/search/resources/store/STOREID/sitecontent/suggestions?catalogId=CATALOGID&contractId=CONTRACTID&suggestType=Category&suggestType=Brand&langId=LANGID", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

	this.add(new CustomCode_1(this, dcVars[1]));
	this.add(ltIf_1(this));
			
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB1AE3E3A0167DD99FB83331643537", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/CATEGORYNAMELOWER", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[0], ".*", 1, 0, 0, 0, false, "Content:CategorySuggestions", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_uri", 144, 6, true, (IDCCoreVar)vars[3], false, "langId_77", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
		ISubRule sub_1 = new SubRule("req_uri", 87, 10, true, (IDCCoreVar)vars[6], false, "contractId_25", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
		ISubRule sub_2 = new SubRule("req_uri", 66, 9, true, (IDCCoreVar)vars[4], false, "catalogId", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
		ISubRule sub_3 = new SubRule("req_hdr_Referer_1", 27, 17, false, (IDCCoreVar)vars[20], false, "Referer_197", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_uri", 24, 7, true, (IDCCoreVar)vars[1], false, "store", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
		ISubRule sub_5 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_192", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_202", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_98", null, 0, false);
	subContainer_1.addSubInstruction(sub_7);
	


		
				
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
			"A1EB1AE3E3A0176FD99FB83331643537",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, new RPTContinueLoopEvent("Response code verification failed", "INNERMOST"), 1));

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
			super(parent, "customcode.PickOneTopCategory", "A1EB1AE3E3A017FBD99FB83331643537");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
	
	
			IDCCoreVar[] inputVars = {
				dcVars[0],
vars[28]
			};
			
			ICustomCode2 ccclass = 	new customcode.PickOneTopCategory();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}




	private If ltIf_1(IContainer parent) {
		If ifObj = new If(parent, "If", "A1EB1AE3E3A01801D99FB83331643537");
		ifObj.setCondition(stringComparison_1(ifObj));
		ifObj.setThen(ltContainer_1(ifObj));
		ifObj.setElse(ltContainer_2(ifObj));
		return ifObj;
	}


	private  IStringComparison stringComparison_1(IContainer parent) {
		IStringComparison cond = new com.ibm.rational.test.lt.compare.StringEquals(parent, "stringComparison_1", "A1EB1AE3E3A01805D99FB83331643537");
		cond.setOperands(dcVars[1], "-1");
		cond.setNegative(true);
		cond.setCaseSensitive(true);		
		return cond;
	}

	private Container ltContainer_1(final IContainer parent) {
		Container container = new Container(parent, "Then Block", "A1EB1AE3E3A0181BD99FB83331643537") {

            public void execute() {                
                		For loopNm_1 = Loop_2(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(Arrays.asList((IKDCCoreVar)vars[0],(IKDCCoreVar)vars[20],(IKDCCoreVar)vars[6],(IKDCCoreVar)vars[22],(IKDCCoreVar)vars[2],(IKDCCoreVar)vars[1],(IKDCCoreVar)vars[21],(IKDCCoreVar)vars[28],(IKDCCoreVar)vars[3]));
		
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
	private For Loop_2(IContainer parent) {
		For forLoop = new For(parent,
				 "Loop2",
				 "A1EB1AE3E3A0181FD99FB83331643537",
				 -1,
				 0,
				 0,
				 0,
				 1,
				 true, 
				 false,
				 null) {

			
		  
		    public void executeLoop() { 
		    	
	
	
	
	               
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_2(this, true, "A1EAF55582BD2814E6D6B53662323963", false, false,
						"Config_2", "/search/resources/api/v2/urls?identifier=CATEGORYNAMELOWER&storeId=STOREID&langId=LANGID",	"/search/resources/api/v2/urls?identifier=CATEGORYNAMELOWER&storeId=STOREID&langId=LANGID", true, false), 5, 100, "A1EAAFEA966AA1B2ED2AB33234333138", 3);
				httpParallel.addRequest(0, request_3(this, false, "A1EAF55582BD2814E6D6B53662323963", false, false,
						"Config_2", "/search/resources/api/v2/categories?contractId=CONTRACTID&identifier=CATEGORYNAME&storeId=STOREID&langId=LANGID",	"/search/resources/api/v2/categories?contractId=CONTRACTID&identifier=CATEGORYNAME&storeId=STOREID&langId=LANGID", true, false), 5, 100, "A1EAAFEA966AA220ED2AB33234333138", 3);
				httpParallel.addRequest(0, request_4(this, false, "A1EAF55582BD2814E6D6B53662323963", false, true,
						"Config_2", "/wcs/resources/store/STOREID/event?langId=LANGID",	"/wcs/resources/store/STOREID/event?langId=LANGID", true, false), 20, 100, "A1EAAFEA966AA30AED2AB33234333138", 3);
				httpParallel.addRequest(0, request_5(this, false, "A1EAF55582BD2814E6D6B53662323963", false, false,
						"Config_2", "/search/resources/api/v2/categories?contractId=CONTRACTID&parentCategoryId=CATEGORYID&storeId=STOREID&langId=LANGID",	"/search/resources/api/v2/categories?contractId=CONTRACTID&parentCategoryId=CATEGORYID&storeId=STOREID&langId=LANGID", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

	this.add(new CustomCode_2(this, dcVars[3]));
			super.executeLoop();
		    }
		
		};
		return forLoop;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB1AE3E3A01823D99FB83331643537", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/CATEGORYNAMELOWER", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_8 = new SubRule("req_uri", 82, 6, true, (IDCCoreVar)vars[3], false, "langId_78", null, 0, false);
	subContainer_2.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_uri", 67, 7, true, (IDCCoreVar)vars[1], false, "storeId_24", null, 0, false);
	subContainer_2.addSubInstruction(sub_9);
		ISubRule sub_10 = new SubRule("req_uri", 41, 17, true, (IDCCoreVar)vars[20], false, "identifier_2", null, 0, false);
	subContainer_2.addSubInstruction(sub_10);
		ISubRule sub_11 = new SubRule("req_hdr_Referer_1", 27, 17, false, (IDCCoreVar)vars[20], false, "Referer_198", null, 0, false);
	subContainer_2.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_193", null, 0, false);
	subContainer_2.addSubInstruction(sub_12);
		ISubRule sub_13 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_203", null, 0, false);
	subContainer_2.addSubInstruction(sub_13);
		ISubRule sub_14 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_99", null, 0, false);
	subContainer_2.addSubInstruction(sub_14);
	


		
				
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
			"A1EB1AE3E3A19D31D99FB83331643537",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB1AE3E3A19DA5D99FB83331643537", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/CATEGORYNAMELOWER", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_15 = new SubRule("req_uri", 105, 6, true, (IDCCoreVar)vars[3], false, "langId_79", null, 0, false);
	subContainer_3.addSubInstruction(sub_15);
		ISubRule sub_16 = new SubRule("req_uri", 90, 7, true, (IDCCoreVar)vars[1], false, "storeId_25", null, 0, false);
	subContainer_3.addSubInstruction(sub_16);
		ISubRule sub_17 = new SubRule("req_uri", 69, 12, true, (IDCCoreVar)vars[21], false, "identifier_3", null, 0, false);
	subContainer_3.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_uri", 47, 10, true, (IDCCoreVar)vars[6], false, "contractId_26", null, 0, false);
	subContainer_3.addSubInstruction(sub_18);
		ISubRule sub_19 = new SubRule("req_hdr_Referer_1", 27, 17, false, (IDCCoreVar)vars[20], false, "Referer_199", null, 0, false);
	subContainer_3.addSubInstruction(sub_19);
		ISubRule sub_20 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_194", null, 0, false);
	subContainer_3.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_204", null, 0, false);
	subContainer_3.addSubInstruction(sub_21);
		ISubRule sub_22 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_100", null, 0, false);
	subContainer_3.addSubInstruction(sub_22);
	


		
				
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
			"A1EB1AE3E3A19E85D99FB83331643537",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB1AE3E3A19EF9D99FB83331643537", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/CATEGORYNAMELOWER", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "52", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_24 = new SubRule("req_uri", 42, 6, true, (IDCCoreVar)vars[3], false, "langId_82", null, 0, false);
	subContainer_5.addSubInstruction(sub_24);
		ISubRule sub_25 = new SubRule("req_hdr_Referer_1", 27, 17, false, (IDCCoreVar)vars[20], false, "Referer_209", null, 0, false);
	subContainer_5.addSubInstruction(sub_25);
		ISubRule sub_26 = new SubRule("req_uri", 21, 7, true, (IDCCoreVar)vars[1], false, "store", null, 0, false);
	subContainer_5.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_208", null, 0, false);
	subContainer_5.addSubInstruction(sub_27);
		ISubRule sub_28 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_207", null, 0, false);
	subContainer_5.addSubInstruction(sub_28);
		ISubRule sub_29 = new SubRule("req_hdr_Origin_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Origin_12", null, 0, false);
	subContainer_5.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_103", null, 0, false);
	subContainer_5.addSubInstruction(sub_30);
	


		
				
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
			"A1EB1AE3E3A19FEDD99FB83331643537",
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
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("{\"categoryId\":\"CATEGORYID\",\"DM_ReqCmd\":\"CategoryDisplay\"}");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1EB1AE3E3A19F91D99FB83331643537", postData, requestData_1, "UTF-8", 10, 25);
	postData.addDataChunk(pdc_0);

	IDataSub subContainer_4 = new DataSub();
	pdc_0.addDataSub(subContainer_4);

		ISubRule sub_23 = new SubRule("req_content", 15, 10, true, (IDCCoreVar)vars[22], false, "categoryId", null, 0, false);
	subContainer_4.addSubInstruction(sub_23);
	



	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB1AE3E3A1A079D99FB83331643537", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/CATEGORYNAMELOWER", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[2], ".*", 1, 0, 0, 0, false, "category_children", null, 0, false);
	IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_31 = new SubRule("req_uri", 109, 6, true, (IDCCoreVar)vars[3], false, "langId_80", null, 0, false);
	subContainer_6.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_uri", 94, 7, true, (IDCCoreVar)vars[1], false, "storeId_26", null, 0, false);
	subContainer_6.addSubInstruction(sub_32);
		ISubRule sub_33 = new SubRule("req_uri", 75, 10, true, (IDCCoreVar)vars[22], false, "parentCategoryId", null, 0, false);
	subContainer_6.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_uri", 47, 10, true, (IDCCoreVar)vars[6], false, "contractId_27", null, 0, false);
	subContainer_6.addSubInstruction(sub_34);
		ISubRule sub_35 = new SubRule("req_hdr_Referer_1", 27, 17, false, (IDCCoreVar)vars[20], false, "Referer_200", null, 0, false);
	subContainer_6.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_195", null, 0, false);
	subContainer_6.addSubInstruction(sub_36);
		ISubRule sub_37 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_205", null, 0, false);
	subContainer_6.addSubInstruction(sub_37);
		ISubRule sub_38 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_101", null, 0, false);
	subContainer_6.addSubInstruction(sub_38);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EB1AE3E3A19EF9D99FB83331643537"), 3);		
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
			"A1EB1AE3E3A1A16BD99FB83331643537",
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

	public class CustomCode_2 extends CustomCodeAction {

		IDataCorrelationVar outVar;
		/**
		 * @param parent
		 * @param name
		 */
		public CustomCode_2(IContainer parent, IDataCorrelationVar outVar) {
			super(parent, "customcode.GetOneNextCategory", "A1EB1AE3E3A1A1DFD99FB83331643537");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
	
	
			IDCCoreVar[] inputVars = {
				dcVars[2],
vars[28]
			};
			
			ICustomCode2 ccclass = 	new customcode.GetOneNextCategory();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}




	private Container ltContainer_2(final IContainer parent) {
		Container container = new Container(parent, "Else Block", "A1EB1AED9999B1D0D99FB83331643537") {

            public void execute() {                
                     	this.add(new TestFlowControlAction(this, "A1EB1AEDA072EDF0D99FB83331643537",
     		new RPTEventStructure(null, new RPTContinueLoopEvent("", "OUTERMOST"), 2, "")));

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

	private If ltIf_2(IContainer parent) {
		If ifObj = new If(parent, "If", "A1EB1AE9644ECC83D99FB83331643537");
		ifObj.setCondition(stringComparison_2(ifObj));
		ifObj.setThen(ltContainer_3(ifObj));
		ifObj.setElse(ltContainer_5(ifObj));
		return ifObj;
	}


	private  IStringComparison stringComparison_2(IContainer parent) {
		IStringComparison cond = new com.ibm.rational.test.lt.compare.StringEquals(parent, "stringComparison_2", "A1EB1AE9644ECC87D99FB83331643537");
		cond.setOperands(dcVars[3], "Continue");
		cond.setNegative(false);
		cond.setCaseSensitive(true);		
		return cond;
	}

	private Container ltContainer_3(final IContainer parent) {
		Container container = new Container(parent, "Then Block", "A1EB1AE9644ECCC9D99FB83331643537") {

            public void execute() {                
                	this.add(page_2(this));
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
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(9146, 1, parent, parent, "A1EB1AE9644ECCCDD99FB83331643537");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ProductsListPage", "A1EB1AE9644ECCCDD99FB83331643537") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_6(this, true, "A1EAF55582BD2814E6D6B53662323963", true, true,
						"Config_2", "/search/resources/api/v2/products?categoryId=CATEGORYID&contractId=CONTRACTID&currency=USD&limit=12&offset=0&storeId=STOREID&langId=LANGID",	"/search/resources/api/v2/products?categoryId=CATEGORYID&contractId=CONTRACTID&currency=USD&limit=12&offset=0&storeId=STOREID&langId=LANGID", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

	this.add(new CustomCode_3(this, dcVars[5]));
	this.add(ltIf_3(this));
			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB1AE9644ECCD9D99FB83331643537", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:76.0) Gecko/20100101 Firefox/76.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/CATEGORYNAMELOWER", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[4], ".*", 1, 0, 0, 0, false, "Content:Products", null, 0, false);
	IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_39 = new SubRule("req_uri", 132, 6, true, (IDCCoreVar)vars[3], false, "langId_81", null, 0, false);
	subContainer_7.addSubInstruction(sub_39);
		ISubRule sub_40 = new SubRule("req_uri", 117, 7, true, (IDCCoreVar)vars[1], false, "storeId_27", null, 0, false);
	subContainer_7.addSubInstruction(sub_40);
		ISubRule sub_41 = new SubRule("req_uri", 67, 10, true, (IDCCoreVar)vars[6], false, "contractId_28", null, 0, false);
	subContainer_7.addSubInstruction(sub_41);
		ISubRule sub_42 = new SubRule("req_uri", 45, 10, true, (IDCCoreVar)vars[22], false, "categoryId", null, 0, false);
	subContainer_7.addSubInstruction(sub_42);
		ISubRule sub_43 = new SubRule("req_hdr_Referer_1", 27, 17, false, (IDCCoreVar)vars[20], false, "Referer_201", null, 0, false);
	subContainer_7.addSubInstruction(sub_43);
		ISubRule sub_44 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_196", null, 0, false);
	subContainer_7.addSubInstruction(sub_44);
		ISubRule sub_45 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_206", null, 0, false);
	subContainer_7.addSubInstruction(sub_45);
		ISubRule sub_46 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_102", null, 0, false);
	subContainer_7.addSubInstruction(sub_46);
	


		
				
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
			"A1EB1AE9644ECDEBD99FB83331643537",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, new RPTContinueLoopEvent("Response code verification failed", "INNERMOST"), 1));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public class CustomCode_3 extends CustomCodeAction {

		IDataCorrelationVar outVar;
		/**
		 * @param parent
		 * @param name
		 */
		public CustomCode_3(IContainer parent, IDataCorrelationVar outVar) {
			super(parent, "customcode.PickProduct", "A1EB1AE9644ECE8FD99FB83331643537");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
	
	
			IDCCoreVar[] inputVars = {
				dcVars[4],
vars[28]
			};
			
			ICustomCode2 ccclass = 	new customcode.PickProduct();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}




	private If ltIf_3(IContainer parent) {
		If ifObj = new If(parent, "If", "A1EB1AE9644ED049D99FB83331643537");
		ifObj.setCondition(stringComparison_3(ifObj));
		ifObj.setThen(ltContainer_4(ifObj));
		ifObj.setElse(null);
		return ifObj;
	}


	private  IStringComparison stringComparison_3(IContainer parent) {
		IStringComparison cond = new com.ibm.rational.test.lt.compare.StringEquals(parent, "stringComparison_3", "A1EB1AE9644ED04DD99FB83331643537");
		cond.setOperands(vars[11], "\"\"");
		cond.setNegative(false);
		cond.setCaseSensitive(true);		
		return cond;
	}

	private Container ltContainer_4(final IContainer parent) {
		Container container = new Container(parent, "Then Block", "A1EB1AE9644ED063D99FB83331643537") {

            public void execute() {                
                     	this.add(new TestFlowControlAction(this, "A1EB1AE9644ED067D99FB83331643537",
     		new RPTEventStructure(null, new RPTBreakLoopEvent("", "INNERMOST"), 2, "")));

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

	private Container ltContainer_5(final IContainer parent) {
		Container container = new Container(parent, "Else Block", "A1EB1AE9644ECC9DD99FB83331643537") {

            public void execute() {                
                	this.add(ltIf_4(this));
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

	private If ltIf_4(IContainer parent) {
		If ifObj = new If(parent, "If", "A1EB1AE9644ECCA1D99FB83331643537");
		ifObj.setCondition(stringComparison_4(ifObj));
		ifObj.setThen(ltContainer_6(ifObj));
		ifObj.setElse(null);
		return ifObj;
	}


	private  IStringComparison stringComparison_4(IContainer parent) {
		IStringComparison cond = new com.ibm.rational.test.lt.compare.StringEquals(parent, "stringComparison_4", "A1EB1AE9644ECCA5D99FB83331643537");
		cond.setOperands(dcVars[3], "Error");
		cond.setNegative(false);
		cond.setCaseSensitive(true);		
		return cond;
	}

	private Container ltContainer_6(final IContainer parent) {
		Container container = new Container(parent, "Then Block", "A1EB1AE9644ECCBBD99FB83331643537") {

            public void execute() {                
                     	this.add(new TestFlowControlAction(this, "A1EB1AE9644ECCBFD99FB83331643537",
     		new RPTEventStructure(null, new RPTContinueLoopEvent("", "OUTERMOST"), 2, "")));

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
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(5274, 1, parent, parent, "A1EB1AE4F0C39FB3D99FB83331643537");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ProductDetails", "A1EB1AE4F0C39FB3D99FB83331643537") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_7(this, true, "A1EAF55582CDC958E6D6B53662323963", false, false,
						"Config_2", "/search/resources/api/v2/urls?identifier=PRODUCTIDENTIFIER&storeId=STOREID&langId=LANGID",	"/search/resources/api/v2/urls?identifier=PRODUCTIDENTIFIER&storeId=STOREID&langId=LANGID", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_8(this, false, "A1EAF55582CDC958E6D6B53662323963", false, true,
						"Config_2", "/wcs/resources/store/STOREID/event?langId=LANGID",	"/wcs/resources/store/STOREID/event?langId=LANGID", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_9(this, false, "A1EAF55582CDC958E6D6B53662323963", false, false,
						"Config_2", "/search/resources/api/v2/products?catalogId=CATALOGID&partNumber=PRODUCTPARTNUMBER&storeId=STOREID&langId=LANGID",	"/search/resources/api/v2/products?catalogId=CATALOGID&partNumber=PRODUCTPARTNUMBER&storeId=STOREID&langId=LANGID", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

	this.add(new CustomCode_4(this, dcVars[7]));
	this.add(ltIf_5(this));
{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_10(this, true, "A1EAF55582CDC958E6D6B53662323963", false, false,
						"Config_2", "/wcs/resources/store/STOREID/inventoryavailability/SKUID?langId=LANGID",	"/wcs/resources/store/STOREID/inventoryavailability/SKUID?langId=LANGID", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

	this.add(dataVarAssign_1(this));
{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_11(this, true, "A1EAF55582CDC958E6D6B53662323963", false, false,
						"Config_2", "/wcs/resources/store/STOREID/associated_promotion?q=byProduct&qProductId=PRODUCTID&langId=LANGID",	"/wcs/resources/store/STOREID/associated_promotion?q=byProduct&qProductId=PRODUCTID&langId=LANGID", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_12(this, false, "A1EAF55582CDC958E6D6B53662323963", true, false,
						"Config_2", "/search/resources/api/v2/products?categoryId=CATEGORYID&contractId=CONTRACTID&currency=USD&langId=LANGID&storeId=STOREID",	"/search/resources/api/v2/products?categoryId=CATEGORYID&contractId=CONTRACTID&currency=USD&langId=LANGID&storeId=STOREID", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

	this.add(ltIf_6(this));
			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB1AE4F0C39FBDD99FB83331643537", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("DNT", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.129 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/PRODUCTIDENTIFIER", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9,fr;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_47 = new SubRule("req_uri", 82, 6, true, (IDCCoreVar)vars[3], false, "langId_69", null, 0, false);
	subContainer_8.addSubInstruction(sub_47);
		ISubRule sub_48 = new SubRule("req_uri", 67, 7, true, (IDCCoreVar)vars[1], false, "storeId_25", null, 0, false);
	subContainer_8.addSubInstruction(sub_48);
		ISubRule sub_49 = new SubRule("req_uri", 41, 17, false, (IDCCoreVar)vars[10], false, "identifier", null, 0, false);
	subContainer_8.addSubInstruction(sub_49);
		ISubRule sub_50 = new SubRule("req_hdr_Referer_1", 27, 17, false, (IDCCoreVar)vars[10], false, "Referer", null, 0, false);
	subContainer_8.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_14", null, 0, false);
	subContainer_8.addSubInstruction(sub_51);
		ISubRule sub_52 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_7", null, 0, false);
	subContainer_8.addSubInstruction(sub_52);
		ISubRule sub_53 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_8.addSubInstruction(sub_53);
	


		
				
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
			"A1EB1AE4F0C3A0E3D99FB83331643537",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB1AE4F0C3A151D99FB83331643537", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "50", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("DNT", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.129 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/PRODUCTIDENTIFIER", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9,fr;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_55 = new SubRule("req_uri", 42, 6, true, (IDCCoreVar)vars[3], false, "langId_70", null, 0, false);
	subContainer_10.addSubInstruction(sub_55);
		ISubRule sub_56 = new SubRule("req_hdr_Referer_1", 27, 17, false, (IDCCoreVar)vars[10], false, "Referer_2", null, 0, false);
	subContainer_10.addSubInstruction(sub_56);
		ISubRule sub_57 = new SubRule("req_uri", 21, 7, true, (IDCCoreVar)vars[1], false, "store", null, 0, false);
	subContainer_10.addSubInstruction(sub_57);
		ISubRule sub_58 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_15", null, 0, false);
	subContainer_10.addSubInstruction(sub_58);
		ISubRule sub_59 = new SubRule("req_hdr_Origin_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Origin", null, 0, false);
	subContainer_10.addSubInstruction(sub_59);
		ISubRule sub_60 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_8", null, 0, false);
	subContainer_10.addSubInstruction(sub_60);
		ISubRule sub_61 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_2", null, 0, false);
	subContainer_10.addSubInstruction(sub_61);
	


		
				
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
			"A1EB1AE4F0C3A257D99FB83331643537",
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
strBuf_2.append("{\"productId\":\"PRODUCTID\",\"DM_ReqCmd\":\"ProductDisplay\"}");
String requestData_2 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1EB1AE4F0C3A1E9D99FB83331643537", postData, requestData_2, "UTF-8", 9, 23);
	postData.addDataChunk(pdc_1);

	IDataSub subContainer_9 = new DataSub();
	pdc_1.addDataSub(subContainer_9);

		ISubRule sub_54 = new SubRule("req_content", 14, 9, true, (IDCCoreVar)vars[11], false, "productId", null, 0, false);
	subContainer_9.addSubInstruction(sub_54);
	



	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB1AE4F0C3A2C5D99FB83331643537", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("DNT", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.129 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/PRODUCTIDENTIFIER", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9,fr;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[6], ".*", 1, 0, 0, 0, false, "product_details", null, 0, false);
	IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_62 = new SubRule("req_uri", 106, 6, true, (IDCCoreVar)vars[3], false, "langId_71", null, 0, false);
	subContainer_11.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_uri", 91, 7, true, (IDCCoreVar)vars[1], false, "storeId_26", null, 0, false);
	subContainer_11.addSubInstruction(sub_63);
		ISubRule sub_64 = new SubRule("req_uri", 65, 17, false, (IDCCoreVar)vars[12], false, "partNumber_8", null, 0, false);
	subContainer_11.addSubInstruction(sub_64);
		ISubRule sub_65 = new SubRule("req_uri", 44, 9, true, (IDCCoreVar)vars[4], false, "catalogId_2", null, 0, false);
	subContainer_11.addSubInstruction(sub_65);
		ISubRule sub_66 = new SubRule("req_hdr_Referer_1", 27, 17, false, (IDCCoreVar)vars[10], false, "Referer_3", null, 0, false);
	subContainer_11.addSubInstruction(sub_66);
		ISubRule sub_67 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_16", null, 0, false);
	subContainer_11.addSubInstruction(sub_67);
		ISubRule sub_68 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_9", null, 0, false);
	subContainer_11.addSubInstruction(sub_68);
		ISubRule sub_69 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_3", null, 0, false);
	subContainer_11.addSubInstruction(sub_69);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EB1AE4F0C3A151D99FB83331643537"), 3);		
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
			"A1EB1AE4F0C3A3EFD99FB83331643537",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, new RPTContinueLoopEvent("Response code verification failed", "OUTERMOST"), 1));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public class CustomCode_4 extends CustomCodeAction {

		IDataCorrelationVar outVar;
		/**
		 * @param parent
		 * @param name
		 */
		public CustomCode_4(IContainer parent, IDataCorrelationVar outVar) {
			super(parent, "customcode.PickSKU", "A1EB1AE4F0C3A45DD99FB83331643537");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
	
	
			IDCCoreVar[] inputVars = {
				dcVars[6]
			};
			
			ICustomCode2 ccclass = 	new customcode.PickSKU();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}




	private If ltIf_5(IContainer parent) {
		If ifObj = new If(parent, "If", "A1EB1AE4F0C3A463D99FB83331643537");
		ifObj.setCondition(stringComparison_5(ifObj));
		ifObj.setThen(ltContainer_7(ifObj));
		ifObj.setElse(null);
		return ifObj;
	}


	private  IStringComparison stringComparison_5(IContainer parent) {
		IStringComparison cond = new com.ibm.rational.test.lt.compare.StringEquals(parent, "stringComparison_5", "A1EB1AE4F0C3A467D99FB83331643537");
		cond.setOperands(dcVars[7], "-1");
		cond.setNegative(false);
		cond.setCaseSensitive(true);		
		return cond;
	}

	private Container ltContainer_7(final IContainer parent) {
		Container container = new Container(parent, "Then Block", "A1EB1AE4F0C3A47DD99FB83331643537") {

            public void execute() {                
                     	this.add(new TestFlowControlAction(this, "A1EB1AE4F0C3A481D99FB83331643537",
     		new RPTEventStructure(null, new RPTContinueLoopEvent("", "OUTERMOST"), 2, "")));

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

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB1AE4F0C3A48BD99FB83331643537", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("DNT", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.129 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/PRODUCTIDENTIFIER", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9,fr;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[8], "\"availableQuantity\":\"(.*?)\"", 1, 1, 0, 0, false, "Content: availableQuantity", null, 0, false);
	IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_70 = new SubRule("req_uri", 64, 6, true, (IDCCoreVar)vars[3], false, "langId_72", null, 0, false);
	subContainer_12.addSubInstruction(sub_70);
		ISubRule sub_71 = new SubRule("req_uri", 51, 5, true, (IDCCoreVar)vars[13], false, "inventoryavailability", null, 0, false);
	subContainer_12.addSubInstruction(sub_71);
		ISubRule sub_72 = new SubRule("req_hdr_Referer_1", 27, 17, false, (IDCCoreVar)vars[10], false, "Referer_4", null, 0, false);
	subContainer_12.addSubInstruction(sub_72);
		ISubRule sub_73 = new SubRule("req_uri", 21, 7, true, (IDCCoreVar)vars[1], false, "store_2", null, 0, false);
	subContainer_12.addSubInstruction(sub_73);
		ISubRule sub_74 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_17", null, 0, false);
	subContainer_12.addSubInstruction(sub_74);
		ISubRule sub_75 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_10", null, 0, false);
	subContainer_12.addSubInstruction(sub_75);
		ISubRule sub_76 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_4", null, 0, false);
	subContainer_12.addSubInstruction(sub_76);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EB1AE4F0C3A151D99FB83331643537"), 3);		
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
			"A1EB1AE4F0C3A57DD99FB83331643537",
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
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

private AssignVariableAction dataVarAssign_1(final IContainer parent) {
	AssignVariableAction varAction = new AssignVariableAction(parent, "A1EB1AE4F0C3A5EBD99FB83331643537");

	varAction.add(vars[27] , dcVars[8]);

	return varAction;
}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB1AE4F0C3A5F8D99FB83331643537", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("DNT", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.129 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/PRODUCTIDENTIFIER", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9,fr;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_77 = new SubRule("req_uri", 90, 6, true, (IDCCoreVar)vars[3], false, "langId_73", null, 0, false);
	subContainer_13.addSubInstruction(sub_77);
		ISubRule sub_78 = new SubRule("req_uri", 73, 9, false, (IDCCoreVar)vars[11], false, "qProductId", null, 0, false);
	subContainer_13.addSubInstruction(sub_78);
		ISubRule sub_79 = new SubRule("req_hdr_Referer_1", 27, 17, false, (IDCCoreVar)vars[10], false, "Referer_5", null, 0, false);
	subContainer_13.addSubInstruction(sub_79);
		ISubRule sub_80 = new SubRule("req_uri", 21, 7, true, (IDCCoreVar)vars[1], false, "store_3", null, 0, false);
	subContainer_13.addSubInstruction(sub_80);
		ISubRule sub_81 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_18", null, 0, false);
	subContainer_13.addSubInstruction(sub_81);
		ISubRule sub_82 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_11", null, 0, false);
	subContainer_13.addSubInstruction(sub_82);
		ISubRule sub_83 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_5", null, 0, false);
	subContainer_13.addSubInstruction(sub_83);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EB1AE4F0C3A151D99FB83331643537"), 3);		
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
			"A1EB1AE4F0C3A6D8D99FB83331643537",
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

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB1AE4F0C3A746D99FB83331643537", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("DNT", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.129 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/PRODUCTIDENTIFIER", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9,fr;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_84 = new SubRule("req_uri", 113, 7, true, (IDCCoreVar)vars[1], false, "storeId_27", null, 0, false);
	subContainer_14.addSubInstruction(sub_84);
		ISubRule sub_85 = new SubRule("req_uri", 98, 6, true, (IDCCoreVar)vars[3], false, "langId_74", null, 0, false);
	subContainer_14.addSubInstruction(sub_85);
		ISubRule sub_86 = new SubRule("req_uri", 67, 10, true, (IDCCoreVar)vars[6], false, "contractId", null, 0, false);
	subContainer_14.addSubInstruction(sub_86);
		ISubRule sub_87 = new SubRule("req_uri", 45, 10, true, (IDCCoreVar)vars[22], false, "categoryId", null, 0, false);
	subContainer_14.addSubInstruction(sub_87);
		ISubRule sub_88 = new SubRule("req_hdr_Referer_1", 27, 17, false, (IDCCoreVar)vars[10], false, "Referer_6", null, 0, false);
	subContainer_14.addSubInstruction(sub_88);
		ISubRule sub_89 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[2], false, "Referer_19", null, 0, false);
	subContainer_14.addSubInstruction(sub_89);
		ISubRule sub_90 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[0], false, "Referer_12", null, 0, false);
	subContainer_14.addSubInstruction(sub_90);
		ISubRule sub_91 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[0], false, "Host_6", null, 0, false);
	subContainer_14.addSubInstruction(sub_91);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EB1AE4F0C3A151D99FB83331643537"), 3);		
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
			"A1EB1AE4F0C3A84ED99FB83331643537",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	private If ltIf_6(IContainer parent) {
		If ifObj = new If(parent, "If", "A1EB1AE4F0C3A8C2D99FB83331643537");
		ifObj.setCondition(stringComparison_6(ifObj));
		ifObj.setThen(ltContainer_8(ifObj));
		ifObj.setElse(null);
		return ifObj;
	}


	private  IStringComparison stringComparison_6(IContainer parent) {
		IStringComparison cond = new com.ibm.rational.test.lt.compare.StringEquals(parent, "stringComparison_6", "A1EB1AE4F0C3A8C6D99FB83331643537");
		cond.setOperands(dcVars[8], "0.0");
		cond.setNegative(false);
		cond.setCaseSensitive(true);		
		return cond;
	}

	private Container ltContainer_8(final IContainer parent) {
		Container container = new Container(parent, "Then Block", "A1EB1AE4F0C3A8DCD99FB83331643537") {

            public void execute() {                
                     	this.add(new TestFlowControlAction(this, "A1EB1AE4F0C3A8E0D99FB83331643537",
     		new RPTEventStructure(null, new RPTContinueLoopEvent("", "INNERMOST"), 2, "")));

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

}
