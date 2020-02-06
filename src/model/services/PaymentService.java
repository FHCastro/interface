package model.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.entities.Contract;
import model.entities.Installment;

public class PaymentService {
	
	private Contract contract;
	private Integer numberOfInstallments;
	
	private PaymentTax paymentTax;
	
	public PaymentService() {
	}

	public PaymentService(Contract contract, Integer numberOfInstallments, PaymentTax paymentTax) {
		this.contract = contract;
		this.numberOfInstallments = numberOfInstallments;
		this.paymentTax = paymentTax;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	public void valueInstallments() {
		
		List<Installment> installments = new ArrayList<Installment>();
		
		
		Calendar cal = Calendar.getInstance();
		
		double partialValue = contract.getTotalValue()/numberOfInstallments;
		
		for (int i = 0; i < numberOfInstallments; i++) {
			
			// dates
			Date nextMonth = contract.getDate();
			cal.setTime(nextMonth);
			cal.add(Calendar.MONTH, i+1);
			nextMonth = cal.getTime();		
					
			installments.add(new Installment(nextMonth, paymentTax.tax(partialValue, i)));
			
		}
		
		contract.setInstallments(installments);
		
	}
	
}
