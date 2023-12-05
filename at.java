import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class at {

	// Finds an element in an array such that
	// left and right side sums are equal
	static int findElement(int arr[], int n)
	{
		List<Integer> list
			= Arrays.stream(arr).boxed().collect(
				Collectors.toList());
		for (int i = 1; i <= n; i++) {
			int leftSum = list.subList(0, i)
							.stream()
							.mapToInt(x -> x)
							.sum();
                            System.out.println(leftSum);
			int rightSum = list.subList(i + 1, n)
							.stream()
							.mapToInt(x -> x)
							.sum();
                            System.out.println(rightSum);

			if (leftSum == rightSum)
				return list.get(i);
		}
		return -1;
	}

	public static void main(String[] args)
	{
		// Case 1
		int arr1[] = { 1, 4, 2, 5 };
		int n1 = 4;
		System.out.println(findElement(arr1, n1));

		// Case 2
		int arr2[] = { 2, 3, 4, 1, 4, 5 };
		int n2 = arr2.length;
		System.out.println(findElement(arr2, n2));
	}
}
// This code is contributed by Bhanu Teja Kodali
