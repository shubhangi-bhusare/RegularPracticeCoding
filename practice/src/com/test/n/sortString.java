package com.test.n;

public class sortString {
	public static void main(String[] args) {

//	Given a string s, reverse only all the vowels in the string and return it.
//	The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//			 Example 1:
//
//			 Input: s = "helloworld"
//			 Output: "hollowerld"
		String str = "helloworld";
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			for (int j = arr.length - 1; j >= 0; j--) {
				char l1 = arr[i];

				char l2 = arr[j];

				if (l1 == 'a' || l1 == 'e' || l1 == 'i' || l1 == 'o' || l1 == 'u') {
					if (l2 == 'a' || l2 == 'e' || l2 == 'i' || l2 == 'o' || l2 == 'u') {
						arr[i] = l2;
						arr[j] = l1;
					}
				}
			}

		}
		for (int j = 0; j < arr.length; j++) {

			System.out.print(arr[j]);
		}

	}
}
