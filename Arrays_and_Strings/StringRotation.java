public class StringRotation {
	public static void main(String[] args) {
		System.out.println(isRotation("waterbottle", "terbottlewa"));
	}

	// check is a is a rotation of b
	// i.e. "waterbottle" is rotation of "erbottlewat"
	public static boolean isRotation(String a, String b) {
		String doubleB = b.concat(b);
		return isSubstring(a, doubleB);
	}

	// check if String a is a Substring of String b
	public static boolean isSubstring(String a, String b) {
		if(a.length() > b.length())
			return false;
		if(a == "")
			return true;
		for(int i = 0; i <= b.length() - a.length(); ++i) {
			if(b.charAt(i) == a.charAt(0)) {
				for(int j = 0, k = i; k < b.length() && j < a.length() && (b.charAt(k) == a.charAt(j)); ++j, ++k) {
					if(j == a.length() - 1 && a.charAt(j) == b.charAt(k))
						return true;
				}
			}
		}
		return false;
	}
}