package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class CWUSinfMap {
	public static void main(String[] args) {
		String str = "Amazon India Private Limited";
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = 
				new LinkedHashMap<Character, Integer>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				Integer value = map.get(c);
				map.put(c, value+1);
			}else 
			map.put(c, 1);
			
		}
		System.out.println(map);
	}

}




