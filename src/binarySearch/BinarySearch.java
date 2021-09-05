package binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)   {
            System.out.println(N + " " + F(N));
        }
        int[] a = {50, 99, 13,10};
        Arrays.sort(a);
        rank(99, a);
    }
    public static int rank(int key,int[] a ){
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high-low) / 2 ;
            if (key < a[mid]){
                high = mid -1;
            }else if (key > a[mid]){
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static long F(int N) {
        if (N == 0) return 0; if (N == 1) return 1; return F(N-1) + F(N-2);
    }
}
