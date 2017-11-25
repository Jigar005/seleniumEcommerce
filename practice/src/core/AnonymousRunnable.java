package core;
/*//class Thread5 extends Thread {
//	public void run() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("My Thread");
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				System.out.println(e.getStackTrace());
//			}
//		}
//	}
//}
*/
public class AnonymousRunnable {
	public static void main(String[] args) {
		Runnable r1 = new Runnable()
				{public void run (){System.out.println("my thread");}};
		Thread t1 = new Thread(r1);
// using above process, we can decrease length of code and no need to create
// extra class
				t1.start();
		System.out.println("Main Thread");
		System.out.println("Main Thread");
		System.out.println("Main Thread");
	}
}
