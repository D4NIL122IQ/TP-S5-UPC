package Television;

public abstract class Programme {
	private int hdebut;
	private int hfin;
	
	public Programme(int d, int f) {
		hdebut = d;
		hfin = f;
	}

	public int getHdebut() {
		return hdebut;
	}

	public int getHfin() {
		return hfin;
	}
	
}
