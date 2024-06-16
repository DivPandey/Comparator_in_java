import java.util.Arrays;
import java.util.Scanner;

public class SortingCharArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [] arr = new char[n];
        for(int i = 0 ; i  <  n ; i++){
            arr[i] = sc.next().charAt(0);
        }
        Arrays.sort(arr);
        for(int i = 0 ; i  <  n ; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
//   By default, data is stored in Ascending order of ASCII Values
//  "A" comes before 'a'