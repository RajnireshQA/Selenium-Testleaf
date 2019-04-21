package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CWUsingSet {
	public static void main(String[] args) {
		String str = "Infosys Limited";
		char[] charArray = str.toCharArray();
		Set<Character>  ls = new LinkedHashSet<Character>();
		for (Character character : charArray) {
			if (ls.add(character) == true) {
				System.out.print(character);
			}
		}
		
	}
}







