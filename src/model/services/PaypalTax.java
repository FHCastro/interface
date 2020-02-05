package model.services;

public class PaypalTax implements PaymentTax {

	public double tax(double amount, int numberInstallment) {
		// Adjustment for indice of the list
		numberInstallment++;
		
		// Simple monthly tax
		amount = amount + (amount/100)*numberInstallment;
		
		// Payment fee
		amount = amount + (amount*2)/100;
		
		return amount;
	}

	

}
