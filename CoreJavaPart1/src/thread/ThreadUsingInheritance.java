package thread;
class ThreadOne extends Thread{
	public void run() {
		System.out.println("ThreadOne started running.....");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}
class ThreadTwo extends Thread{
	public void run() {
		System.out.println("ThreadTwo started running.....");
		for(int i=5;i<10;i++) {
			System.out.println(i);
		}
	}
}

public class ThreadUsingInheritance {

	public static void main(String[] args) {
	    ThreadOne t1=new ThreadOne();
	    ThreadTwo t2=new ThreadTwo();
	    t1.start();
	    t2.start();
   
	}

}
