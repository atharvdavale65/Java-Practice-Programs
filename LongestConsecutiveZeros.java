import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestConsecutiveZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int L = scanner.nextInt();
        int K = scanner.nextInt();

        // Output
        int result = longestConsecutiveZerosLength(L, K);
        System.out.println(result);

        scanner.close();
    }

    private static int longestConsecutiveZerosLength(int L, int K) {
        // Construct the binary string with K ones separated by zeros
        String binaryString = IntStream.range(0, K).mapToObj(i -> "10").collect(Collectors.joining()) +
                IntStream.range(0, L - 2 * K).mapToObj(i -> "0").collect(Collectors.joining());

        // Find the length of the longest consecutive zeros
        int maxZerosLength = 0;
        int currentZerosLength = 0;

        for (char bit : binaryString.toCharArray()) {
            if (bit == '0') {
                currentZerosLength++;
            } else {
                maxZerosLength = Math.max(maxZerosLength, currentZerosLength);
                currentZerosLength = 0;
            }
        }

        // Check for the last segment of zeros
        maxZerosLength = Math.max(maxZerosLength, currentZerosLength);

        return maxZerosLength;
    }
}
