package ch20;

// 상속
class MyThread extends Thread {
	
	public void run() {
		
		int i;
		for(i = 0; i < 200; i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
		MyThread th1 = new MyThread();
		th1.start();
		
		MyThread th2 = new MyThread();
		th2.start();
		
		Runnable run = new Runnable() {

			@Override
			public void run() {
				System.out.println("run");
			}
		};
		
		run.run();
	}

}
