package week1.day3;

public class ReverseOddWordsString {

	public static void main(String[] args) {
		String test = "I am a software tester";
		// Expected output: “I ma a erawtfos tester”

		String[] a = test.split(" ");
		char[] ch = null;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 1) {
				String oddWordReverse = "";
				ch = a[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					oddWordReverse = oddWordReverse + ch[j];
				}
				System.out.print(oddWordReverse + " ");
			} else {
				System.out.print(a[i] + " ");
			}
		}
	}

}
