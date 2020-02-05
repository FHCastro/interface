package model.services;

import model.entities.Contract;

public class PaymentService {
	
	private Contract contract;
	
	private PaymentTax paymentTax;
	
	public PaymentService() {
	}

	public PaymentService(Contract contract) {
		this.contract = contract;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	public Double[] valueInstallments(Contract contrac, PaymentTax paymentTax) {
		
		int numberOfInstallments = contrac.getInstallment().length;
		
		double partialValue = contract.getTotalValue()/numberOfInstallments;
		
		for (int i = 0; i < contrac.length; i++) {
			
		}
		
		
		return ;
		
	}
	
	
	
}
