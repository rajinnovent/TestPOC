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

import java.util.Random;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

public class PickAddressType implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	public PickAddressType() {}
	public String exec(ITestExecutionServices tes, String[] args) {
		String[] addr_types = { "ShippingAndBilling", "Shipping", "Billing" };
		Random r = new Random();
		int low = 0;
		int high = addr_types.length - 1;
		int i = r.nextInt( high - low ) + low;
		return addr_types[ i ];
	}
}
