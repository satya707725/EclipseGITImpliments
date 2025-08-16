package com.satya.netbanking;

import java.util.Random;

public class NetBankingServuce {
    public String openAccount(String aadhaar,double initialAmt,String type) {
    	return "account is opened with account no"+new Random().nextLong(50000000000l);
    }
    
    public String withdrowAmount(long accNo,double amt) {
    	return amt+" is withdrown from account no:: "+accNo;
    }
    public String depositedInToAccno(long accNo,double amt) {
    	return amt+" is deposited to account no:: "+accNo;
    }
}
