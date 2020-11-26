package IntegratedAssingmentNumber51;

public class DistinctDuplicatesClass {

	static int newArraySizeCount = 0;

	static void FindingDistinctDuplicates(int s, int[] set) {
		int[] newArray = new int[s];
		int[] duplicateElementArray = new int[s];
		for (int i = 0; i < s; i++) {
			int flag = 0;
			// int cnt1=1;
			for (int j = 0; j < newArraySizeCount; j++) {
				if (set[i] == newArray[j]) {
					flag = 1;
					// cnt1+=1;
				}
			}
			if (flag == 0) {
				newArray[newArraySizeCount] = set[i];
				newArraySizeCount = newArraySizeCount + 1;
			}

		}

		int dublicateElementCount = 0;
		for (int j = 0; j < newArraySizeCount; j++) {
			int elementCount = 0;
			for (int k = 0; k < s; k++) {
				if (newArray[j] == set[k]) {
					elementCount += 1;

				}
			}
			if (elementCount > 1) {
				duplicateElementArray[dublicateElementCount] = newArray[j];
				dublicateElementCount += 1;
				System.out.print(newArray[j] + "\t");
			}

		}
		if (dublicateElementCount == 0)
			System.out.println("-1");

	}
}
