package exo2;

public class Vecteur {
	private Point a;
	private Point b;

	public Vecteur(Point a, Point b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public boolean equals(Object o) {

		if ((o instanceof Vecteur) && !(o == null)) {
			Vecteur v = (Vecteur) o;
			if ((b.getX() - a.getX() == v.getB().getX() - v.getA().getX())
					&& (b.getY() - a.getY() == v.getB().getY() - v.getA().getY())) {
				return true;
			} else {
				return false;
			}
		}else {
			return false;
		}
	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}
}
