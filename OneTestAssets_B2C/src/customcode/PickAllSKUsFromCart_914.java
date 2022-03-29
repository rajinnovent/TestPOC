//*-------------------------------------------------------------------
//* Licensed Materials - Property of HCL Technologies
//*
//* HCL Commerce
//* HCL OneTest Performance
//*-------------------------------------------------------------------
//* The sample contained herein is provided to you "AS IS".
//*
//* It is provided by HCL Commerce to demonstrate the use of HCL OneTest
//* Performance with the "Emerald" store.
//* 
//* The sample includes a selected number of scenarios. It must be 
//* extended to match the function and use of your store.
//*
//*---------------------------------------------------------------------

package customcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

public class PickAllSKUsFromCart_914 implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {
	public PickAllSKUsFromCart_914() {}
	public String exec(ITestExecutionServices tes, String[] args) {
		String content = args[ 0 ];
		String ids = "";
		
		Pattern pattern = Pattern.compile( "\"productId\":\"(.*?)\"" );
		Matcher matcher = pattern.matcher( content );
		while ( matcher.find() ) {
			ids += matcher.group( 1 ) + "&id=";
		}
		if ( ids.length() > 0 ) {
			ids = ids.substring( 0, ids.length() - 4 );
		}
		else {
			ids = "-1";
		}
		
		tes.getTestLogManager().reportMessage( "SKUs = " + ids );
		
		return ids;
	}
}
