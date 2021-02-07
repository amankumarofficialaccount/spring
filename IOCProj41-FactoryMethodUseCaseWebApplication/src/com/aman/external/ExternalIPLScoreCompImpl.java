package com.aman.external;

public class ExternalIPLScoreCompImpl implements ExternalIPLScoreComp {

	@Override
	public String getScore(int mid) {
		
		
		if(mid==1001)
		    return "RCB Vs MI--->176/8 (MI)";
		else if(mid==1002)
			return "SRH VS DD--->78/6 (DD)";
		else if(mid==1003)
			return "SKP Vs CSK--->200/3 (CSK)";
		else
			return "Invalid Match Id";
		
	}
		

}
