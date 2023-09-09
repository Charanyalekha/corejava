package thread;
class Thread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread1 started running....");
		for(int i=0;i<5;i++) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread2 started running....");
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}

public class ThreadUsingInterface {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread t=new Thread(t1);
		t.start();
		Thread2 t2=new Thread2();
		Thread tt=new Thread(t2);
		tt.start();

	}

}
