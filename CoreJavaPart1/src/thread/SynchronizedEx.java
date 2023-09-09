package thread;

class MultiTable {
	 synchronized void displayMulti(int n) throws InterruptedException  {
		for (int i=1;i<=10;i++) {
			System.out.println(n +"*"+ i+ "=" + n*i);
		Thread.sleep(1000);
		}
	}
	 synchronized void displayPower(int n) throws InterruptedException  {
		     int temp=1;
			for (int i=1;i<=10;i++) {			
				System.out.println(n +"^"+ i+ "=" + temp*i);
				temp=temp*n;
			Thread.sleep(1000);
			}
		}
}
class Multi1 extends Thread {
	MultiTable m1;

	public Multi1(MultiTable m1) {
		super();
		this.m1 = m1;
	}
	public void run() {
		try {
			m1.displayMulti(5);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}
class Multi2 extends Thread {
	MultiTable m1;

	public Multi2(MultiTable m1) {
		super();
		this.m1 = m1;
	}
	public void run() {
		try {
			m1.displayPower(2);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}

public class SynchronizedEx {

	public static void main(String[] args) {
		MultiTable m=new MultiTable();
		Multi1 mm=new Multi1(m);
		mm.start();

		Multi2 mm2=new Multi2(m);
		mm2.start();

	}

}
