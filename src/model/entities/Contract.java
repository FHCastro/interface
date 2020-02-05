package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer number;
	private Date date;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<Installment>();
	
	public Contract(){
	}

	public Contract(Integer number, Date date, Double totalValue, List<Installment> installments) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installments = installments;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallment() {
		return installments;
	}
	
	public List<Installment> createInstallment(int numberInstallments) {
		
		Date nextMonth;
		
		for (int i = 0; i < numberInstallments; i++) {
			
			//nextMonth = getDate().
			//this.installments.add(new Installment)
		}
		
		return installments;
	}
	
}
