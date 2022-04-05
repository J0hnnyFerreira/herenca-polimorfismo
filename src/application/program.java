package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Ana", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Teco", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Luiz", 1000.0, 0.01);
		Account acc6 = new SavingsAccount(1005, "Maria", 1000.0, 0.01);
		Account acc7 = new BusinessAccount(1007, "Lully", 1000.0, 200.0);
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; não funciona
		//por que o acc3 é do tipo SavingsAccount ... então 
		//
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updatebalance();
			System.out.println("Update!");
		}
		
		//Sobreposição de metodo
		
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
	}

}
