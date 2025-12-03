package test;

public class TestThreadAvecNom {
	public static void main(String[] args) {
		Thread t1 = new Thread(" Thread 1") {
			public void run() {
				for (int i = 0; i < 1000; i++)
					System.out.println(getName() + ": 1");
			}
		};
		Thread t2 = new Thread(" Thread 2") {
			public void run() {
				for (int i = 0; i < 1000; i++)
					System.out.println(getName() + ": 0");
			}
		};
		t1.start();
		t2.start();
	}
}