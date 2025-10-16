package Produits;

public class TestProduit {
	public static void main(String args[]) {
		Medicament d = new Medicament("Doliprane" , "JSNLabo" , 12 , 1.80);
		Fruit f = new Fruit("Banane", "Kenya" , 1.10);
		Livre l = new Livre("L'etranger", "Albert Camus", 7.1);
		DVD c = new DVD("One piece Elbaf" , "Oda" , 10.3);
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(c);
		
	}
}
