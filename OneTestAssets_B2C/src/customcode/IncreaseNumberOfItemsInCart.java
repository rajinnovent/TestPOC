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

import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

public class IncreaseNumberOfItemsInCart implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	public IncreaseNumberOfItemsInCart() {}

	public String exec(ITestExecutionServices tes, String[] args) {
		int n = Integer.parseInt( args[ 0 ] ) - 1;
		tes.setValue( "current_nbr_items_in_cart", ITestExecutionServices.STORAGE_USER, String.valueOf( n ) );
		//tes.setValue( "local_nbr_items", ITestExecutionServices.STORAGE_USER, String.valueOf( n ) );
		
		tes.getTestLogManager().reportMessage( "local_nbr_items = " + String.valueOf( n ) );
		
		if ( n <= 0 ) {
			tes.getLoopControl().breakLoop();
		}
		return String.valueOf( n );
	}
}
