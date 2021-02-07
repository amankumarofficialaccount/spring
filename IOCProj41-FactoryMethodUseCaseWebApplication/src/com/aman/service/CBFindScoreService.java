package com.aman.service;

import com.aman.external.ExternalIPLScoreComp;

public class CBFindScoreService {
	
   private ExternalIPLScoreComp extComp;
   
   public CBFindScoreService(ExternalIPLScoreComp extComp) {
	   this.extComp = extComp;
   }
	
	
	
	public String findScore(int mid) {
		
		String score  = null;
		score = extComp.getScore(mid);
		
		return score;
	}

}
