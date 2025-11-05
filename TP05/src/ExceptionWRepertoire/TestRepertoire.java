package ExceptionWRepertoire;

public class TestRepertoire {
	public static void main(String[] args) {
		//RepertoireAmeliore ra = new RepertoireAmeliore(new Personne("Danil", "Gdj", "0695622837"));
		
		//ra.addPersonne("anis", "ha", "06");
		//ra.addPersonne("papa", "gdj", "0541054556");
		
		ParserRepertoire pr = new ParserRepertoire("/Users/danilguidjou/Documents/L3PC/S5/PAA/Workplace-paa/TP05/src/ExceptionWRepertoire/contact.txt");
		RepertoireAmeliore ra = pr.getRA();
		System.out.println(ra);
	}
}
