package basic;

public class SecondSmallestEleInArray {
	public int getSecondSmallest(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];
	}
	public static void printSpaceInBet(String str) {
		for(int i=0;i<str.length();i++) {
			str.charAt(i)=str.charAt(i)+" ";
		}
	}

	public static void main(String[] args) {
		SecondSmallestEleInArray s = new SecondSmallestEleInArray();

		int arr[] = { 23, 45, 32, 22, 20, 96 };

		System.out.println(s.getSecondSmallest(arr));
		String name="charanya";

	}

}
