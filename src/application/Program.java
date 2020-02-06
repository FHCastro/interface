package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.PaymentService;
import model.services.PaypalTax;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = Integer.parseInt(sc.nextLine()) ;
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		Double totalValue = Double.parseDouble(sc.nextLine());
		System.out.print("Enter number of installments: ");
		Integer numberOfInstallments = Integer.parseInt(sc.nextLine());
		
		Contract contract = new Contract(number, date, totalValue);
		
		PaymentService paymentService = new PaymentService(contract, numberOfInstallments, new PaypalTax());
		paymentService.valueInstallments();
		
		System.out.println("Installments:");
		
		for (Installment i : paymentService.getContract().getInstallment()) {
			System.out.println( sdf.format(i.getDueDate()) + " - " + i.getAmount());
		}
		
		
		
	}

}
