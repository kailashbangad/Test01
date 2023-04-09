import java.util.Scanner;

public class FindMaxTwoNumberInArray {

	public static void twoLargeNum() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array one by one ");
		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();
		}

		int max1 = 0;
		int max2 = 0;

		for (int num : arr) {

			if (max1 < num) {
				max2 = max1;
				max1 = num;

			} else if (max2 < num) {
				max2 = num;

			}
		}

		System.out.println("1st large no:" + max1);
		System.out.println("1st large no:" + max2);
	}

	public static void main(String[] args) {

		twoLargeNum();

	}

}
