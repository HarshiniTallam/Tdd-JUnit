package com.epam.tdd_demo;

public class RemoveFirst2Chars {

	public String remove(String string) {
		int len = string.length();
		String result = string;
		if(len != 0) {
			if(len >= 2 && string.charAt(0) == 'A' && string.charAt(1) == 'A')
				result = string.substring(2, len);
			else if(string.charAt(0) == 'A')
				result = string.substring(1, len);
			else if(len >= 2 && string.charAt(1) == 'A')
				result = string.charAt(0) + string.substring(2, len);
		}
		return result;
	}
	

}
