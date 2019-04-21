package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CWUsingList {
	public static void main(String[] args) {
		String str = "Infosys Limited";
		char[] charArray = str.toCharArray();
		List<Character>  ls = new ArrayList<Character>();
		for (Character character : charArray) {
			if (ls.contains(character)) {
				System.out.println(character);
			}
			ls.add(character);
		}
		
	}
}







