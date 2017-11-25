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
public class AnonymousClassThread {
	public static void main(String[] args) {
		Thread t1 = new Thread()
				{public void run (){System.out.println("my thread");} };
// using above process, we can decrease lenghth of code and no need to create
// extra class
				t1.start();
		System.out.println("Main Thread");
		System.out.println("Main Thread");
		System.out.println("Main Thread");
	}
}
