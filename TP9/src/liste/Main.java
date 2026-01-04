package liste;

public class Main {
	public static void main(String args[]) {
		ListChainee<Integer> lc = new ListChainee<>();
		
		lc.addNoeud(3);
		lc.addNoeud(8);
		lc.addNoeud(2);
		
		System.out.println(lc);
		
		lc.insert(0, 10);
		lc.insert(9, 10);
		System.out.println(lc);
		lc.remove(7);
		lc.remove(3);
		System.out.println(lc);
		
	}
}
