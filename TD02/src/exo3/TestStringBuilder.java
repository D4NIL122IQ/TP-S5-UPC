package exo3;

import java.lang.StringBuilder;

public class TestStringBuilder {
	public static void main(String args[]) {
		StringBuilder s = new StringBuilder("hello");
		
		System.out.println(s);
		
		s.append(" world");
		System.out.println(s);
		
		System.out.println(StringremplaceLettre.replaceLettre("bonjour", "o", "l"));
		
	}
	
	
}
