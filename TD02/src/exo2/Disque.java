package exo2;

public class Disque {
	private Point centre;
	private double rayon;
	
	public Disque(Point c, double r) {
		centre = c;
		rayon = r;
	}
	
	public boolean appartientDisque(Point p) {
		double dcp = centre.distance(p);
		
		if(dcp <= rayon) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean intersection(Disque d2) {
		
		double dcc = centre.distance(d2.centre);
		
		if(dcc <= rayon+ d2.getRayon()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void translation(Vecteur ab) {
		centre.translation(ab);
	}
	public Point getCentre() {
		return centre;
	}

	public double getRayon() {
		return rayon;
	}
}
