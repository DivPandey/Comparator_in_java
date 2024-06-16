import java.util.Arrays;
import java.util.Scanner;

class Point{
    int x;
    int y;
    Point (int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class SortingUdef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point [] arr = new Point[n];
        for(int i = 0 ; i  <  n ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Point(x, y);
        }
        Arrays.sort(arr);
        for(int i = 0 ; i  <  n ; i++){
            System.out.println(arr[i].x+" "+arr[i].y);
        }
    }
}
