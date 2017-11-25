package core;



class Thread6 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("My Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getStackTrace());
			}
		}
	}
}

public class ThreadRunnable {
	public static void main(String[] args) {
		Thread6 t5 = new Thread6();
		System.out.println(t5.getClass());
		Thread t = new Thread(t5);
		t.start();

		System.out.println("Main Thread");
		System.out.println("Main Thread");
		System.out.println("Main Thread");
	}
}

