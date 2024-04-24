package week1.day3;

public class RemoveDuplicateStrings {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";

		String[] a = text.split(" ");
		int count = 0;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i].equalsIgnoreCase(a[j])) {
					a[j] = " ";
					count = count + 1;
				}
			}
		}
		System.out.println("duplicate count = " + count);
		String output = "";
		if (count > 0) {
			for (int i = 0; i < a.length; i++) {
				output = output + a[i] + " ";
			}
			System.out.println("output = " + output);
		}

	}

}
