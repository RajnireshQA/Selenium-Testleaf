package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class LearnMap {
	public static void main(String[] args) {
		Map<String, Integer> productList = new
				TreeMap<String, Integer>();
		productList.put("iphone", 45000);
		productList.put("fossil", 12000);
		productList.put("ck", 10000);
		productList.put("ck", 10);
		System.out.println(productList.containsKey("ck"));
		System.out.println(productList);
		for (Entry<String, Integer> eachPro : 
			productList.entrySet()) {
			System.out.println(eachPro.getKey() 
					+" -> "+eachPro.getValue());
		}
//		productList.entrySet()
		//System.out.println(productList);

		/*System.out.println(
				productList.get("fossil"));
		System.out.println(productList.keySet());
		System.out.println(productList.values());
*/







	}

	/*public static void main(String[] args) {
		String[] nameList = 
			{"koushik", "Balaji", "Maharaja"};

		for(String eachName : nameList)
			System.out.println(eachName);
	}*/

}




