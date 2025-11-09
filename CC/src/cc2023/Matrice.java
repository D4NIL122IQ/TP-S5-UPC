package cc2023;

public class Matrice {
	private double [][]m;
	private int col;
	private int ligne;
	
	
	public Matrice(int n, int m) {
		this.m = new double[n][m];
	}
	
	public int getCol() {
		return col;
	}
	
	public int getLigne() {
		return ligne;
	}
	
	public void setValeur(int i , int j , double val) throws Exception{
		if(i>ligne || j>col || i <= 0 || j<=0) {
			throw new Exception("Indice erreur");
		}
		
		m[i-1][j-1] = val;
	}
	
	public double getValeur(int i , int j) throws Exception{
		if(i>ligne || j>col || i <= 0 || j<=0) {
			throw new Exception("Indice erreur");
		}
		
		return m[i-1][j-1];
	}
	
	public Matrice somme(Matrice autre) throws Exception{
		if(ligne != autre.getLigne() || col != autre.getCol()) {
			throw new Exception("Matrices ne sont pas de la meme dimension");
		}
		
		Matrice tempS = new Matrice(ligne , col);
		
		for(int i=0 ; i<ligne ; i++ ) {
			for(int j=0 ; j<col ; j++ ) {
				tempS.setValeur(i, j, m[i][j] + autre.getValeur(i, j));
			}
		}
		
		return tempS;
	}
	
	public Matrice transposee () throws Exception {
		Matrice tempT = new Matrice(col , ligne);
		
		for(int i=0 ; i<col ; i++ ) {
			for(int j=0 ; j<ligne ; j++ ) {
				tempT.setValeur(i, j, m[j][i]);
			}
		}
		
		return tempT;
	}
	
}
