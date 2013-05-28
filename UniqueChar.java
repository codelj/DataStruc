package string;

import java.util.HashMap;

public class UniqueChar {
  
	public static void main(String[] args) {
		String str = "asasasasasas"; 
		System.out.println(isUniqueMethod1(str));//bit
		System.out.println(isUniqueMethod2(str));//HashMap
		System.out.println(isUniqueMethod3(str));//ASCII code
	}
	
	private static boolean isUniqueMethod3(String str){
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) 
				return false;
			char_set[val] = true;
		}
		return true;
	}
	
	private static boolean isUniqueMethod2(String str){
		HashMap<String,Boolean> map = new HashMap<String, Boolean>();
		for(int i=0; i ++< str.length()-1;){
			if(map.get(Character.toString(str.charAt(i))) == null){
				map.put(Character.toString(str.charAt(i)), true);
			}else if(map.get(Character.toString(str.charAt(i))))
				return false;
		}
		return true;
	}
	
	private static boolean isUniqueMethod1(String str){
		int checker =0;
		for(int i=0; i ++< str.length()-1;){
			int val = str.charAt(i)-'a';
			if((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		return true;
	}
	
}
