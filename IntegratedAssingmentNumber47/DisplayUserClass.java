package IntegratedAssingmentNumber47;

import java.util.Scanner;

public class DisplayUserClass {

	void DisplayUserDetails(BankUser[] bankuser,int totalbankusercount) {
		Scanner s8 = new Scanner(System.in);
		System.out.print("Enter the accno of the user->> ");
		while (!s8.hasNextLong()) {
			String inp = s8.next();
			System.out.print(inp + " !!!  This is not a valid option \n Enter a valid option ::");

		}
		long accno = s8.nextLong();
		int flag = 0;
		for (int i = 0; i < totalbankusercount; i++) {
			if (accno == bankuser[i].getAccNo() && bankuser[i].getValid() == 1) {
				System.out.println(bankuser[i].getAccNo() + "\t" + bankuser[i].getName() + "\t" + "bal:" + bankuser[i].getBalance() + "\t" + bankuser[i].getDOB());
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.print(" Account details not found !!! ");
		}

	}

}
