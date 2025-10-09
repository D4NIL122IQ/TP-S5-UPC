package promoEtudiant;

public class Etudiant {
	/*
	 * Cette classe Etudiant represente un etudiant on suppose qu'un etudiant est unique avec son nom 
	 */
	private String nom;
	private float noteCC;
	private float noteEX;
	
	public Etudiant(String n, float c, float e) {
		nom = n;
		noteCC = c;
		noteEX = e;
	}
	
	public Etudiant(String n) {
		this(n , 0 ,0);
	}
	
	public float getMoyenne() {
		float m = (noteEX > (noteCC + noteEX)/2)? noteEX :  ((noteCC + noteEX) / 2 ) ;  
		return m;
	}
	
	public void setCC(float c) {
		noteCC = c;
	}
	
	public void setEX(float e) {
		noteEX = e;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String toString() {
		return "nom : "+ nom + " - moyenne : " + getMoyenne() +"\n";
	}
}
