package assignment;



public class SecondSmallestEleInArray {
	public int getSecondSmallest(int arr[]) {
        int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr[1];
	}

	public static void main(String[] args) {
		SecondSmallestEleInArray s = new SecondSmallestEleInArray();

		int arr[] = { 23, 45, 32, 22, 20, 96 };

		System.out.println(s.getSecondSmallest(arr));

	}

}
