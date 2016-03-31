package Logic;

import DataLoggingStructures.Call;
import DataLoggingStructures.InternetLog;
import DataLoggingStructures.SMS;



public abstract class Plan {
	
	 DataParams myDataParams; 
	 CallsParams myCallParams; 
	 SMSParams mySMSParams;
	 ExtraPlanBenefit[] extras; 
	
	 
	 
	 public Plan(DataParams myDataParams,
			CallsParams myCallParams, SMSParams mySMSParams, ExtraPlanBenefit[] extras ) {
		super();
		this.myDataParams = myDataParams;
		this.myCallParams = myCallParams;
		this.mySMSParams = mySMSParams;
		this.extras=extras;
	}
	
	int processCall(Call c){
		return 0; 
	}
	
	int processSms(SMS sms){
		return 0; 
	}
	int processData(InternetLog internetLog){
		return 0; 
	}
	
	
}
