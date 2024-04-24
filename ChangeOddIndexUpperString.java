package week1.day3;

public class ChangeOddIndexUpperString {

	public static void main(String[] args) {
		String test = "changeme";

		char[] ch = test.toCharArray();
		char charAt = 0;
		for (int i = 0; i <= ch.length - 1; i++) {
			if (i % 2 == 1) {
				charAt = Character.toUpperCase(ch[i]);
				ch[i] = charAt;
			}
			System.out.print(ch[i]);// cHaNgEmE
		}

	}

}
