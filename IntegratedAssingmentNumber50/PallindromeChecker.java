package IntegratedAssingmentNumber50;

import java.util.Scanner;

public class PallindromeChecker {

	

	public static void main(String[] args) {
		int flag = 0;
		int ch = 0;
		IsNumberPallindrome INP=new IsNumberPallindrome();
		IsStringPallindrome ISP=new IsStringPallindrome();
		Scanner s1 = new Scanner(System.in);
		do {
			

			System.out.print("1->> Pallindrome for number \n 2->> Pallindrome for string \n3->> Exit  ");
			while (!s1.hasNextInt()) {
				String inp = s1.next();
				System.out.print(inp + " !!!  This is not a valid option \n Enter a valid option ::");

			}
			ch = s1.nextInt();
			// flag=1;

			switch (ch) {
			case 1:
				Scanner s2 = new Scanner(System.in);
				System.out.print("enter no:");
				while (!s2.hasNextInt()) {
					String inp = s2.next();
					System.out.print(inp + " !!!  Enter a valid number ::");

				}
				int n = s2.nextInt();
				INP.isNumberPallindrome(n);
				break;
			case 2:
				Scanner s3 = new Scanner(System.in);

				System.out.print("enter no:");
				String s = s3.nextLine();
				ISP.isStringPallindrome(s);
				break;
			case 3:
				System.exit(0);

			default:
				continue;
			}
		} while (flag != 1);
		s1.close();

	}

}
