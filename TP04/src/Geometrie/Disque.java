package Geometrie;


public class Disque extends Figure{
	
	private Point centre;
	private double rayon;
	
	public Disque(Point c, double r) {
		centre = c;
		rayon = r;
	}
	
	@Override
	public double surface() {
		
		return Math.PI * Math.pow(rayon, 2);
	}
	
	@Override
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}
	
	@Override
	public Figure translation(Vecteur v) {
		return new Disque(centre.translation(v), rayon);
	}
	
	public String toString() {
		return "perimetre : " + perimetre() + " surface : " + surface();
	}
}
