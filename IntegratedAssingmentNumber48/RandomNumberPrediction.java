package IntegratedAssingmentNumber48;

import java.util.Scanner;

public class RandomNumberPrediction {

	public static void main(String[] args) {

		int flag1 = 1;
		Scanner s1 = new Scanner(System.in);
		do {
			long time = System.currentTimeMillis();
			String s = String.valueOf(time);
			int randomNumber = 0;
			int temp1 = s.charAt(s.length() - 1) - 48;
			// System.out.println(temp1);
			randomNumber = randomNumber * 10 + temp1;
			int temp2 = s.charAt(s.length() - 2) - 48;
			randomNumber = randomNumber * 10 + temp2;
			int temp3 = s.charAt(s.length() - 3) - 48;
			randomNumber = randomNumber * 10 + temp3 + 1;

			System.out.println(randomNumber);
			int flag = 0;
			int no;

			while (flag != 1) {

				System.out.print("Guess the number:");
				no = s1.nextInt();
				if (no < randomNumber) {
					System.out.println("Too low !!!");
				} else if (no > randomNumber) {
					System.out.println("Too High !!!");
				} else if (no == randomNumber) {
					System.out.println("Number found !!!");
					flag = 1;
				}

			}
			System.out.print("Wanna tryb again (1=yes/ 0=no) ::  ");
			flag1 = s1.nextInt();

		} while (flag1 != 0);
		s1.close();
	}
}
