import java.util.*;

public class FactorCount {
    public static int getFactorCount(int a){
        int count = 0;
        for(int i = 1; i*i <=a; i++) {
            if(a%i == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr [] = new Integer[n];
        for(int i =0 ; i < n; i++){
            arr[i]  = sc.nextInt();
        }
        Comparator<Integer> cmp = (Integer a, Integer b) ->{
            int factors_a = getFactorCount(a);
            int factors_b = getFactorCount(b);
            if(factors_a<factors_b) return -1;
            if(factors_a>factors_b) return 1;
            return 0;
        };
        Arrays.sort(arr,cmp);
        for(int i =0 ; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
