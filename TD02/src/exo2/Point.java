package exo2;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this(0,0);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public double distance(Point p) {
		double dx = Math.pow(p.getX() - this.x, 2);
		double dy = Math.pow(p.getY() - this.y, 2);
		
		return Math.sqrt(dx+dy);
	}
	
	public void translation(Vecteur ab) {
		this.x += ab.getB().getX() - ab.getA().getX();
		this.y += ab.getB().getY() - ab.getA().getY();
	}
}
