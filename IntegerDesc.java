import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IntegerDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];  // Use Integer instead of int

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Comparator<Integer> cmp = (Integer a, Integer b) -> {
            if (a > b) return -1;
            if (a < b) return 1;
            return 0;
        };

        Arrays.sort(arr, cmp);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();  // Close the Scanner
    }
}
