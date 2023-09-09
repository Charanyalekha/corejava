package nestedloops;

public class PyramidPattern {

	public static void main(String[] args) {
		
		        int numRows=5;	
				System.out.println("Left-Aligned bottom pyramid:");
				printLeftBottomPyramid(numRows);
				
				System.out.println("\nMiddle-Aligned bottom pyramid:");
				printMiddleBottomPyramid(numRows);
				
				System.out.println("Right-Aligned bottom pyramid:");
				printRightBottomPyramid(numRows);

			}
			public static void printLeftBottomPyramid(int numRows) {
				for(int i=numRows;i>=1; i--) {
					for(int j=1; j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
			public static void printMiddleBottomPyramid(int numRows) {
				for(int i=numRows;i>=1; i--) {
					for(int j=1; j<=numRows-i;j++) {
						System.out.print(" ");
					}
					for(int k=1; k<=i*2-1;k++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
			public static void printRightBottomPyramid(int numRows) {
				for(int i=numRows;i>=1; i--) {
					for(int j=1; j<=numRows-i;j++) {
						System.out.print(" ");
					}
					for(int k=1; k<=i;k++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}


	