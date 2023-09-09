package nestedloops;

public class Pattern1 {

	public static void main(String[] args) {
		// to print half pyramid using column values
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//to print half pyramid using row values
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		//to print half pyramid using column values in reverse
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		// to print half pyramid using '*'
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//to print half pyramid in reverse order
		for(int i=0;i<5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
