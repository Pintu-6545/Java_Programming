package com.practice;

interface Payment {

	void processPayment(double amount);
    void showPaymentStatus();
}

//Class implementing the PaymentGateway interface
class CreditCardPayment implements Payment {
 private boolean paymentSuccess = false;

 // Implementing processPayment method
 public void processPayment(double amount) {
     System.out.println("Processing credit card payment of ₹" + amount + "...");
     paymentSuccess = true;  
 }

 // Implementing showPaymentStatus method
 public void showPaymentStatus() {
     if (paymentSuccess)
         System.out.println("Payment Successful ");
     else
         System.out.println("Payment Failed ");
 }
}

//Another implementation for UPI Payment
class UpiPayment implements Payment {
 private boolean paymentSuccess = false;

 public void processPayment(double amount) {
     System.out.println("Processing UPI payment of ₹" + amount + "...");
     paymentSuccess = true;
 }

 public void showPaymentStatus() {
     if (paymentSuccess)
         System.out.println("UPI Payment Successful");
     else
         System.out.println("UPI Payment Failed ");
 }
}

public class PaymentData
{
	public static void main(String[] args) {
		
		 CreditCardPayment credit = new CreditCardPayment();
	        credit.processPayment(1200.50);
	        credit.showPaymentStatus();

	        System.out.println("-------------------------");

	        // Using UPI Payment
	        UpiPayment upi = new UpiPayment();
	        upi.processPayment(599.99);
	        upi.showPaymentStatus();
	}
}

