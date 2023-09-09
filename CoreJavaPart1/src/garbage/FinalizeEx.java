package garbage;

public class FinalizeEx {
	String s;
	public FinalizeEx(String s) {
		this.s=s;
	}

	public static void main(String[] args) {
		FinalizeEx e1=new FinalizeEx("example1");
		FinalizeEx e2=new FinalizeEx("example2");
		e1=e2;
		e1=null;
		e2=null;
		System.gc();
		
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(" Object previously referenced by "+this.s+" is freed...");
	}

}
