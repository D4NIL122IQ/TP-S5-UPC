package exo2;

import java.util.Scanner;

public class TestUtilMath {
	public static void main(String []args) {
		int rep = 0;
		Scanner clavier = new Scanner(System.in);
		while(rep == 0) {
			System.out.println("Votre choix ?");
			rep = clavier.nextInt();
		}
		clavier.close();
		
		switch(rep) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		 default :
			 System.out.println("Erreur lors du choix !");
			 break;
		}
	}
}
