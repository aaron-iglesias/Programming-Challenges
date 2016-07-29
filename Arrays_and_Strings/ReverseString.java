public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseString("puppy ate my Toe"));
	}

	public static String reverseString(String s) {
		char[] c = s.toCharArray();
		for(int i = 0, j = c.length - 1; i < c.length / 2; ++i, --j) {
			char tmp = c[i];
			c[i] = c[j];
			c[j] = tmp;
		}
		return new String(c);
	}
}