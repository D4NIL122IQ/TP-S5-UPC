package test;

public class TestAffichage {
	public static void main(String[] args) {
		ThreadAffichage t1 = new ThreadAffichage(" 1", 10);
		ThreadAffichage t2 = new ThreadAffichage(" 0", 10);
		t1.start();
		t2.start();
	}
}