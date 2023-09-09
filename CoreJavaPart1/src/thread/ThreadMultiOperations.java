package thread;

class ThreadMulti extends Thread {
	public void run() {
		int n = 5;
		System.out.println(n + " multiples......");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}
}

class ThreadFibo extends Thread {
	public void run() {
		System.out.println("fibonocii series......");
		int f1 = 0, f2 = 1;
		System.out.print(f1 + " " + f2);
		for (int i = 0; i < 12; i++) {
			int f3 = f1 + f2;
			System.out.print(f3 + " ");
			f1 = f2;
			f2 = f3;
		}
		System.out.println();
	}
}

class ThreadFact extends Thread {

	public void run() {

		int n = 6, fact = 1;
		System.out.println(" factorial of " + n + " is :");
		for (int i = 2; i <= 6; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}

class ThreadEven implements Runnable {
	public void run() {
		System.out.println(" Even Numbers from 1 to 50.......");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "  ");
			}
		}
	}
}

public class ThreadMultiOperations {

	public static void main(String[] args) {
		ThreadMulti m = new ThreadMulti();
		m.setPriority(Thread.NORM_PRIORITY);
		m.start();
		m.setName("Multiplication");
		System.out.println(m.getName());
		ThreadFibo f = new ThreadFibo();
		f.start();
		ThreadFact fa = new ThreadFact();
		fa.start();
		ThreadEven e = new ThreadEven();
		Thread t = new Thread(e);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t.getPriority() + " " + t.getName());
		t.start();
		
	}

}
