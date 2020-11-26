package IntegratedAssingmentNumber47;

import java.util.Scanner;

public class InputBankUserDetails {

	void BankUserDetails(BankUser[] bankuser,int totalbankusercount) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		System.out.print("Enter acc no->> ");
		do{
			String inp = s1.next();
			System.out.print(inp + " !!!  This is not a valid option \n Enter a valid option ::");

		}while (!s1.hasNextLong());
		long accNo = s1.nextLong();
		System.out.print("Enter name->> ");
		String name = s2.nextLine();
		System.out.print("Enter add->> ");
		String add = s2.nextLine();

		int flag = 0;
		String dob = "";
		DateValidationClass DVC=new DateValidationClass();
		while (flag == 0) {
			System.out.print("Enter DOB->> ");
			dob = s2.nextLine();
			flag = DVC.validatedate(dob);
		}
		int flaga=0;
		String acctype="";
		while(flaga==0){
		System.out.print("Enter AccType->> ");
		acctype = s2.nextLine();
		if(acctype.equals("savings")||acctype.equals("current"))
			flaga=1;
		}
		System.out.print("Enter balance->> ");
		while (!s3.hasNextFloat()) {
			String inp = s3.next();
			System.out.print(inp + " !!!  This is not a balance amount \n Enter a valid amount ::");

		}
		float bal = s3.nextFloat();
		bankuser[totalbankusercount] = new BankUser();
		bankuser[totalbankusercount].setAccNo(accNo);
		bankuser[totalbankusercount].setName(name);
		bankuser[totalbankusercount].setAddress(add);
		bankuser[totalbankusercount].setDOB(dob);
		bankuser[totalbankusercount].setAccType(acctype);
		bankuser[totalbankusercount].setBalance(bal);
		bankuser[totalbankusercount].setValid(1);
		
		//totalbankusercount = totalbankusercount + 1;
		

	}
}
