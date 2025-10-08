
public class Etudiant {
	public double noteFinal(double cc, double examen) {
		double temp = (cc+examen)/2;
		return (temp<examen)? examen : temp;
	}
}
