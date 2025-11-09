package cc2024exo4;

import java.util.HashMap;

public class Implementation {
	public void maximum(int[] tab) {
		int max;
		int ocu;
		
		max = tab[0];
		ocu = 1;
		for( int i = 1; i<tab.length ; i++) {
			if(max < tab[i]) {
				max = tab[i];
				ocu = 1;
			}else if (max == tab[i]) {
				ocu++; 
			}
		}
		
		System.out.println("Le max du tableau : "+ max + " il est apparu : "+ ocu + " fois");
	}
	
	public HashMap<Character , Integer> recupVoyelles(String chaine) {
		
		HashMap<Character , Integer> voy = new HashMap<>();
		
		voy.put('a', 0);
		voy.put('e', 0);
		voy.put('i', 0);
		voy.put('u', 0);
		voy.put('o', 0);
		voy.put('y', 0);
		
		for(int i =0; i<chaine.length() ; i++) {
			char temp = chaine.toLowerCase().charAt(i);
			if(voy.containsKey(temp)) {
				voy.put(temp , voy.get(temp) + 1);
			}
		}
		return voy;
	}
}
