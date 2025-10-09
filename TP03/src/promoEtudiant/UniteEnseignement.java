package promoEtudiant;

import java.util.ArrayList;
import java.lang.StringBuffer;

public class UniteEnseignement {
	/*
	 * classe UE represente une ue specifique tout les etudiant de cette classe ont
	 * leurs notes
	 */
	private String nomUE;
	private ArrayList<Etudiant> etds;

	public UniteEnseignement(String n, ArrayList<Etudiant> e) {
		nomUE = n;
		etds = e;
	}

	public UniteEnseignement(String n) {
		this(n, new ArrayList<Etudiant>());
	}

	public void ajouterNoteCCEEtudiant(String nom, float cc) {
		if (etds.isEmpty()) {
			System.out.println("Aucun etudiant dans la liste");
		} else {
			for (Etudiant e : etds) {
				if (e.getNom().equals(nom)) {
					e.setCC(cc);
					return;
				}
			}
		}
	}

	public void ajouterNoteEXEEtudiant(String nom, float ex) {
		if (etds.isEmpty()) {
			System.out.println("Aucun etudiant dans la liste");
		} else {
			for (Etudiant e : etds) {
				if (e.getNom().equals(nom)) {
					e.setEX(ex);
					return;
				}
				System.out.println(nom + " n'est pas dans la liste d'etudiant de cette \n");
			}
		}
	}

	public String getNomUE() {
		return nomUE;
	}

	public float getMoyenneUE() {
		float temp = 0;

		for (Etudiant e : etds) {
			temp += e.getMoyenne();
		}

		return temp / etds.size();
	}

	public String getMajor() {
		float max = -1;
		Etudiant temp = null;

		for (Etudiant e : etds) {
			temp = (max < e.getMoyenne()) ? e : temp;
		}

		return "UE : " + nomUE + " - Major : " + temp;
	}

	public String toString() {
		StringBuffer temp = new StringBuffer("UE : " + nomUE + " - Liste etudiant : \n");

		for (Etudiant e : etds) {
			temp.append(e.toString());
		}

		return temp.toString();

	}

}
