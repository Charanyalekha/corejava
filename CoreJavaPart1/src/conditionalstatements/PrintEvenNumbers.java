package conditionalstatements;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
