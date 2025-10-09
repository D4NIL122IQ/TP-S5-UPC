package jeuCombat;


public class Combat {
	
	private Personnage []persos = new Personnage[3];
	
	public Combat() {
		persos[0] = new Personnage("Aragorn", 100, new Attaque("Epee", 8, 10) ,  new Attaque("Arc", 5, 8));
		persos[1] = new Personnage("Gimli", 80, new Attaque("Epee", 8, 8) ,  new Attaque("Hache", 9, 12));
		persos[2] = new Personnage("Legolas", 120, new Attaque("Epee", 8, 6) ,  new Attaque("Arc", 7, 15));
	}
	
	public void choixHumain(int index) {
		Personnage []temp = new Personnage[2];
		int j =0;
		for(int i=0 ; i < 3 ; i++) {
			if(i != index) {
				temp[j] = persos[i];
				j++;
			}
		}
		
		persos = temp;
	}
	
	public Personnage getRandomPerso() {
		int index = (Math.random() < 0.5) ? 0 : 1;
		return persos[index];
	}
	
	
	public int verifierGG(Personnage P1, Personnage P2) {
		/*renvoie 1 si P1 perd sinon 2 si P2 perd
		 *  0 si aucun la partie continue
		 */
		int lequel = 0; // 0 c'est personne
		
		if(P1.getPV() < 0) {
			lequel = 1;
		}else if(P2.getPV() < 0) {
			lequel = 2;
		}
		
		return lequel;
	}
	
	public Personnage []getPersos(){
		return persos;
	}
}
