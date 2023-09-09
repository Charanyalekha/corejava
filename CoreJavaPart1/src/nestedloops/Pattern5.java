package nestedloops;

public class Pattern5 {
	public static void printFullPyramid(int n) {
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void printInvertedFullPyramid(int n) {
		for(int i=n;i>=1; i--) {
			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void printFullPyramidUsingNo(int n) {
		int m=1;
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
	}
			public static void main(String[] args) {
				printFullPyramid(5);
				printInvertedFullPyramid(5);
				printFullPyramidUsingNo(5);
				
			}
		}

