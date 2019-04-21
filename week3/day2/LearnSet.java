package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {
	public static void main(String[] args) {
		Set<String> mobileModels = new LinkedHashSet<String>();
		mobileModels.add("Samsung");
		mobileModels.add("One Plus");
		boolean addStatus1 = mobileModels.add("Apple");
		System.out.println("AddStatus1"+addStatus1);
		mobileModels.add("Redmi");
		boolean addStatus2 = mobileModels.add("Apple");
		System.out.println(addStatus2);
		
		mobileModels.remove("One Plus");
		System.out.println(mobileModels.size());
		for (String eachMobile : mobileModels) {
			System.out.println(eachMobile);
		}
		System.out.println("*******************");
		List<String> myPhones = new ArrayList<String>(mobileModels);
//		myPhones.addAll(mobileModels);
		System.out.println(myPhones.get(0));
		
		
		
		
		
		
	}

}
