package week1.day2;

public class LearnString {
	/**
	 * String class to create and manipulate strings.
	 * 
	 * Methods
	 * 
	 * 0) toCharArray() //
	 * 1) length // find the number of characters		  
	 * 2) charAt(index) // The character at the index		  		  
	 * 3) indexOf(chr) , lastIndexOf(chr) // the index of the first or last match
	 * 4) concat //Concatenate two strings only  2+"Std"
	 * 5) toString() // Convert an existing data type to String
	 * 6) subString(beginIndex, endIndex) //Extracts a particular portion of String
	 * 7) trim // Removes the white space on begining and End
	 * 8) toLowerCase, toUpperCase // to convert case		  
	 * 9) split('char') -- split(regex, limit) //		 	  
	 * 10)startsWith(s), endsWith(s), contains(s) // match 
	 * 11)replace(oldChar, newChar), replaceAll(regex, replacement) // 
	 * 
	 * 12) String, StringBuffer(ThreadSafe), StringBuilder(Not ThreadSafe) 
	 */

	public static void main(String[] args) {
		/*String varName = new String("String Object");
		System.out.println(text);
		System.out.println(varName);*/
	//String Literal
		/*
		int len = text.length();
		System.out.println("Length of the String: "+len);
		
		char charAt = text.charAt(4);
		System.out.println("Character At 4: "+charAt);
		 
		boolean equals = text.equals("TestLeaf");
		System.out.println("Equals: "+ equals);
		
		boolean equalcase = text.equalsIgnoreCase("Testleaf");
		System.out.println("Equal Ignore case: "+ equalcase);
		
		boolean startsWith = text.startsWith("TE");
		System.out.println("startsWith: "+startsWith);
		
		boolean endswith = text.endsWith("ef");
		System.out.println("Endswith: "+endswith);
		
		
		boolean textcontains = text.contains("tL");
		System.out.println("Contains: "+textcontains);
		
		int index = text.indexOf('e');
		System.out.println("Index of e: "+index);
		
		int lastIndex = text.lastIndexOf('e');
		System.out.println("Last Index of e: "+lastIndex);
		
		String substring = text.substring(0, 4);
		System.out.println("Sub String: "+ substring);
		
		
		 
		//way 1 using charat
		for(int i = text.length()-1;i >= 0 ; i--) {
			System.out.print(text.charAt(i));
		}
		
		
		String text = "TestLeaf";
		//split char by char
		char[] allChar = text.toCharArray();
		
		for(int i = allChar.length-1; i>=0 ; i--) {			
			System.out.print(allChar[i]);
		}
		
		int a = 10;
		int b = 5;
		String value = Integer.toString(a);
		System.out.println(value+b);
		System.out.println(txt.trim());
		System.out.println(txt.toLowerCase());
		System.out.println(txt.toUpperCase());
	
		String txt = "Welcome to TestLeaf And please focus on the class";
		
		String[] allWords = txt.split(" ");
		
		for (int i = 0; i < allWords.length; i++) {
			System.out.println(allWords[i]);
		}
		*/
		String txt = "Welcome to TestLeaf And please focus on the class";
		
		String replace = txt.replace("please", "pls");
		
		System.out.println(replace);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
