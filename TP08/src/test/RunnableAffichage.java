package test;

public class RunnableAffichage implements Runnable {
	private String chaine;
	private int max;

	public RunnableAffichage(String str, int m) {
		chaine = str;
		max = m;
	}

	@Override
	public void run() {
		for (int i = 0; i < max; i++)
			System.out.print(chaine + " ");
	}

	public static void main(String[] args) {
		Runnable run1 = new RunnableAffichage(" 1", 1000);
		Runnable run2 = new RunnableAffichage(" 0", 1000);
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run2);
		t1.start();
		t2.start();
	}
}