package Television;

import java.util.List;
import java.util.ArrayList;

public class TestTele {
	public static void main(String args[]) {
		Journal j = new Journal("Personne" , 20, 21);
		Divertissement d = new Divertissement("Naruto" , "Otaku" , 18);
		Reportage r = new Reportage("Mafia" , Themes.CULTURE , 21, 22);
		Fiction f = new Fiction("Jinki" , "H", true, 22, 23);
		
		//List<Programme> lp = new ArrayList<>{j,d,r,f};
		
		System.out.println(j);
		System.out.println(d);
		System.out.println(r);
		System.out.println(f);
	}
}
