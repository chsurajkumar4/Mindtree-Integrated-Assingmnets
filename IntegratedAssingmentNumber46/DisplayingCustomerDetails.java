package IntegratedAssingmentNumber46;

public class DisplayingCustomerDetails {

	void DisplayByAddress(String city, Passenger[] passenger,int cnt) {
		String names[] = new String[cnt];
		int cnt1 = 0;
		for (int i = 0; i < cnt; i++) {
			if (passenger[i].getAddress().equals(city)) {
				names[cnt1] = passenger[i].getName();
				// System.out.println(p[i].name);
				cnt1 = cnt1 + 1;
			}
		}
		for (int j = 0; j < cnt1; j++) {
			System.out.println(names[j]);
		}
	}
	
	void DisplayById(int id, Passenger[] passenger,int cnt) {

		int fnd = 0;
		for (int i = 0; i < cnt; i++) {
			if (passenger[i].getId() == id) {
				System.out.println(passenger[i].getName());
				fnd = 1;
			}
		}
		if (fnd == 0)
			System.out.println("Not found !!!");
	}

	// #########################################################################################################################

	void DisplayBySorting(Passenger[] passenger,int cnt) {
		String snames[] = new String[cnt];

		for (int i = 0; i < cnt; i++) {

			snames[i] = passenger[i].getName();

		}
		String temp;
		for (int i = 0; i < snames.length; i++) {
			for (int j = i + 1; j < snames.length; j++) {
				if (snames[j].compareTo(snames[i]) < 0) {
					temp = snames[i];
					snames[i] = snames[j];
					snames[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < snames.length; i++) {
			System.out.print(snames[i] + " ");
		}
	}
}
