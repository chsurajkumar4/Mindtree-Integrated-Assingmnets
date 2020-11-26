package IntegratedAssingmentNumber50;

public class IsNumberPallindrome {
	
	
	void isNumberPallindrome(int n) {
		int flag = 0;
		String s = String.valueOf(n);
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Pallindrome !!");

		} else {
			System.out.println("Not a pallindrome !!");
		}
	}

}
