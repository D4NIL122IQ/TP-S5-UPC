package Geometrie;

public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this(0,0);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(Point p) {
		double dx = Math.pow(p.getX() - this.x, 2);
		double dy = Math.pow(p.getY() - this.y, 2);
		
		return Math.sqrt(dx+dy);
	}
	
	public Point translation(Vecteur ab) {
		this.x += ab.getB().getX() - ab.getA().getX();
		this.y += ab.getB().getY() - ab.getA().getY();
		return this;
	}
}
