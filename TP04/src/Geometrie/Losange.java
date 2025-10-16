package Geometrie;

public class Losange extends Quadrilatere{
	
	public Losange(Point s1,Point s2, Point s3,Point s4) {
		super(s1, s2, s3, s4);
		
	}
	
	public double surface() {
		Point []t = getSommets();
		return (t[0].distance(t[2]) * t[1].distance(t[3]) ) / 2  ;
	}
	
	public Figure translation(Vecteur v) {
		Point []t = getSommets();
		return new Losange(t[0].translation(v),  t[1].translation(v),t[2].translation(v),t[3].translation(v));
	}
	
	public String toString() {
		return "perimetre " + perimetre() + " surface : " + surface();
	}
}
