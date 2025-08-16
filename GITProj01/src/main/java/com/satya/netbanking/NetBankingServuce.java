package com.satya.netbanking;

import java.util.Random;

public class NetBankingServuce {
    public String openAccount(String aadhaar,double initialAmt,String type) {
    	return "account is opened with account no"+new Random().nextLong(50000000000l);
    }
}
