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

public class getOneCategoryId implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	public getOneCategoryId() {}

	public String exec(ITestExecutionServices tes, String[] args) {
		String[] all_category_ids = args[ 0 ].split( "," );
		int nbr_values = Integer.parseInt( all_category_ids[ 0 ] );
		int category_index = Integer.parseInt( args[ 1 ] ) + 1;
		if ( category_index >= nbr_values ) {
			tes.getLoopControl().breakLoop();
			return null;
		}
		String s = String.valueOf( category_index );
		tes.setValue( "category_id_index", ITestExecutionServices.STORAGE_USER, s );
		tes.setValue( "category_id_picked", ITestExecutionServices.STORAGE_USER, all_category_ids[ category_index ] );
		
		tes.getTestLogManager().reportMessage( String.valueOf( category_index ) );
		tes.getTestLogManager().reportMessage( all_category_ids[ category_index ] );
		
		return all_category_ids[ category_index ];
	}
}
