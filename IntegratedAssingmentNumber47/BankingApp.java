package IntegratedAssingmentNumber47;

import java.util.Scanner;

public class BankingApp {
	static int totalbankusercount = 0;
	
	public static void main(String[] args) {
		int flag = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the total no od banke constumers:: ");
		int ArrayOfObject=s.nextInt();
		BankUser bankuser[] = new BankUser[ArrayOfObject];
		BankingApp bankingapp = new BankingApp();
		InputBankUserDetails IBUD=new InputBankUserDetails();
		UpdateUserDetailsClass UUDC=new UpdateUserDetailsClass();
		DeleteUserClass DUC=new DeleteUserClass();
		DisplayUserClass DisplayDetails=new DisplayUserClass();
		int optionChoice = 0;
		do{
			

			System.out.print(
					"1->> Enter bank user details \n 2->> Update User details\n3->> Delete user details \n4->> Display\n5->> Exit\n   Choose the option::  ");
			while (!s.hasNextInt()) {
				String inp = s.next();
				System.out.print(inp + " !!!  This is not a valid option \n Enter a valid option ::");

			}
			optionChoice = s.nextInt();
			// flag=1;

			switch (optionChoice) {
			case 1:
				IBUD.BankUserDetails(bankuser,totalbankusercount);
				totalbankusercount = totalbankusercount + 1;
				break;
			case 2:
				UUDC.UpdateUserDetails(bankuser,totalbankusercount);
				break;
			case 3:
				DUC.DeleteUserDetails(bankuser,totalbankusercount);

			case 4:
				DisplayDetails.DisplayUserDetails(bankuser,totalbankusercount);
				break;
			case 5:
				System.exit(0);

			default:
				continue;
			}
		}while(flag!=1);
	}
	
	

}
