package Geometrie;

public abstract class Quadrilatere extends Figure{
	private Point []sommets;
	
	public Quadrilatere(Point s1,Point s2, Point s3,Point s4) {
		sommets = new Point[]{s1 , s2, s3, s4};
	}
	
	public Point []getSommets(){
		return sommets;
	}
	
	@Override
	public double perimetre() {
		return sommets[0].distance(sommets[1]) + sommets[1].distance(sommets[2]) + sommets[2].distance(sommets[3]) + sommets[3].distance(sommets[0]);
	}
	
}
