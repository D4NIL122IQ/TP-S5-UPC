package exo3;

import java.lang.StringBuilder;

public class StringremplaceLettre {
	
	public static String replaceLettre(String str, String sousch1, String sousch2) {
		StringBuilder temp = new StringBuilder(str);
		
		if( str.contains(sousch1)) {
			int start =  str.indexOf(sousch1, 0);
			while( start !=-1) {
				temp.replace(start, sousch1.length() +start , sousch2);
				start =  str.indexOf(sousch1, start+1);
			}
		}
		
		return temp.toString();
	}
}
