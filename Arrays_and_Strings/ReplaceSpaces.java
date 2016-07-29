public class ReplaceSpaces {
	public static void main(String[] args) {
		System.out.println(replaceSpaces(" hello world, test this string "));
	}

	// replace spaces with '%20'
	public static String replaceSpaces(String s) {
		int spaceCount = 0;
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) == ' ')
				++spaceCount;
		}
		char[] c = new char[s.length() + 2 * spaceCount];
		for(int i = 0, j = 0; i < c.length; ++i, ++j) {
			if(s.charAt(j) == ' ') {
				c[i++] = '%';
				c[i++] = '2';
				c[i] = '0'; 
			}
			else {
				c[i] = s.charAt(j);
			}
		}
		return new String(c);
	}
}