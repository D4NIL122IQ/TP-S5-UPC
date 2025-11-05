package GUI_nd_ProgEvent.Time;


public class Temps {
	private long tempsActu;
	private Boolean start;
	public Temps() {
		tempsActu = 0;
		start = false;
	}
	
	public void start() {
		tempsActu = System.currentTimeMillis();
		start = true;
	}
	
	public Boolean isStart() {
		return start;
	}
	public long stop() {
		start =false;
		return (System.currentTimeMillis() - tempsActu );
		
	}
}
