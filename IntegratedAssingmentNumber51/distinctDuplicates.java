package IntegratedAssingmentNumber51;

import java.util.Scanner;

public class distinctDuplicates {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size = s1.nextInt();
		int[] set = new int[size];
		//DistinctDuplicatesClass DDC=new DistinctDuplicatesClass();
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < size; i++) {
			set[i] = s1.nextInt();
		}
		DistinctDuplicatesClass.FindingDistinctDuplicates(size, set);
		s1.close();
	}
}
