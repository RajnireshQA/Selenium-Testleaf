package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<String> mobileModels = new ArrayList<String>();
		mobileModels.add("Samsung");
		mobileModels.add("Apple");
		mobileModels.add("One Plus");
		mobileModels.add("Samsung");
		mobileModels.add(0, "Redmi");
//		mobileModels.remove(2);
//		mobileModels.remove("Apple");
		System.out.println(mobileModels.size());
		
		for (String eachMobile : mobileModels) {
			System.out.println(eachMobile);
		}
		System.out.println("*****");
		System.out.println(mobileModels.get(mobileModels.size()-1));
		System.out.println("*****");
		Collections.sort(mobileModels);
		Collections.reverse(mobileModels);
		for (String eachMobile : mobileModels) {
			System.out.println(eachMobile);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
