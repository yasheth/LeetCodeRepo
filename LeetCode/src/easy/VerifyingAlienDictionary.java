package easy;

import java.util.Stack;

public class VerifyingAlienDictionary {

	static int[] mapping = new int[26];

	public static boolean isAlienSorted(String[] words, String order) {
		for (int i = 0; i < order.length(); i++) {
			mapping[order.charAt(i) - 'a'] = i;
		}
		for (int i = 1; i < words.length; i++) {
			if (bigger(words[i - 1], words[i]))
				return false;
		}
		return true;
	}

	public static boolean bigger(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		for (int i = 0; i < l1 && i < l2; i++) {
			if (s1.charAt(i) != s2.charAt(i))
				return mapping[s1.charAt(i) - 'a'] > mapping[s2.charAt(i) - 'a'];
		}
		return l1 > l2;
	}

	public static void main(String[] args) {
		System.out.println(isAlienSorted(new String[] {"hello","world"},"hlabcdefgijkmnopqrstuvwxyz"));
	}

}
