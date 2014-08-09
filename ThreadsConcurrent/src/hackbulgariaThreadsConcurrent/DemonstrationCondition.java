package hackbulgariaThreadsConcurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class DemonstrationCondition {

	final static Object monitor = new Object();
	static AtomicInteger count = new AtomicInteger(0);
	static int counter = 0;
	static int turn = 1;

	public DemonstrationCondition() {

	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					synchronized (monitor) {
						while (turn != 1) {
							try {
								monitor.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						
						increment1();
						System.out.println(1);
						
						turn = (turn + 1) % 2;
						monitor.notify();
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					synchronized (monitor) {
						while (turn != 0) {
							try {
								monitor.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						
						increment1();
						System.out.println(2);
						
						turn = (turn + 1) % 2;
						monitor.notify();
						
					}

				}
			}

		});

		long startTime = System.currentTimeMillis();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();

		System.out.println(counter + " " + (endTime - startTime));
	}

	public synchronized static void increment() {
		counter++;
	}

	public static void incrementt() {
		count.incrementAndGet();
	}
	
	public static void increment1(){
		counter ++;
	}
}
