import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

public class StringAnagram {
	public static void main(String[] args) {
		System.out.println(isAnagram2("dog", "gdo"));
	}

	// HashMaps O(n)
	public static boolean isAnagram(String a, String b) {
		if(a.length() != b.length())
			return false;
		HashMap<Character, Integer> mapA = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mapB = new HashMap<Character, Integer>();
		for(int i = 0; i < a.length(); ++i) {
			if(mapA.containsKey(a.charAt(i)))
				mapA.put(a.charAt(i), mapA.get(a.charAt(i)) + 1);
			else
				mapA.put(a.charAt(i), 1);
			if(mapB.containsKey(b.charAt(i)))
				mapB.put(b.charAt(i), mapB.get(b.charAt(i)) + 1);
			else
				mapB.put(b.charAt(i), 1);
		}
		return mapA.equals(mapB);
	}

	// Arrays and ArrayLists
	public static boolean isAnagram2(String a, String b) {
		if(a.length() != b.length())
			return false;
		int[] charSet = new int[256];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < a.length(); ++i) {
			int index = a.charAt(i);
			++charSet[index];
			list.add(index);
			--charSet[b.charAt(i)];
		}
		for(int i = 0; i < list.size(); ++i) {
			if(charSet[list.get(i)] != 0)
				return false;
		}
		return true;
	}

	
	public static boolean isAnagram3(String a, String b) {

	}
}