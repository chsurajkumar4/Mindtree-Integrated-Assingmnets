package IntegratedAssingmentNumber47;

import java.util.Scanner;

public class DeleteUserClass {

	void DeleteUserDetails(BankUser[] bankuser,int totalbankusercount) {
		Scanner s6 = new Scanner(System.in);
		System.out.print("Enter the accno of the user->> ");
		while (!s6.hasNextLong()) {
			String inp = s6.next();
			System.out.print(inp + " !!!  This is not a valid option \n Enter a valid option ::");

		}
		long accno = s6.nextLong();
		int flag = 0;
		for (int i = 0; i < totalbankusercount; i++) {
			if (accno == bankuser[i].getAccNo() && bankuser[i].getValid() == 1) {
				bankuser[i].setAccNo(0);
				bankuser[i].setName(" ");
				bankuser[i].setAddress(" ");
				bankuser[i].setDOB(" ");
				bankuser[i].setAccType(" ");
				bankuser[i].setBalance(0);
				bankuser[i].setValid(0);
				flag = 1;
			}
		}
		if (flag != 0) {
			System.out.print(" Data deleted successfully !!! ");
		} else {
			System.out.print(" Account details not found !!! ");
		}
	}
}
