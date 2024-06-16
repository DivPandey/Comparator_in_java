import java.util.*;

/**
 * Point
 */
public class Point {

    int x;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point [] arr = new Point[n];
        for(int i = 0 ; i  <  n ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Point(x, y);
        }
        Comparator<Point> cmp = (Point p1, Point p2) ->{
            if(p1.x<p2.x) return -1;
            if(p2.x<p1.x) return 1;
            return 0;
        };
        Arrays.sort(arr,cmp);
        for(int i = 0 ; i  <  n ; i++){
            System.out.println(arr[i].getx()+" "+arr[i].gety());
        }
    }
}
