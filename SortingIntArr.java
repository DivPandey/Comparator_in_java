
import java.util.*;;

/**
 * SortingIntArr
 */
public class SortingIntArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i  <  n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0 ; i  <  n ; i++){
            System.out.println(arr[i]+" ");
        }

    }
}

// by default, data is stored in ascending order. 