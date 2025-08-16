package com.satya.upi;

import java.util.Random;

public class UpiPayment {
	
   public void doUpiPayment(String upi,double amt) {
	   System.out.println("Payment to"+upi+"of"+amt);
   }
   
   public long checkBalance() {
	   return new Random().nextLong(1000000l);
   }
}
