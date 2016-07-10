import java.util.Scanner;

public class BinarySearch {

    public int findIndex(int v, int[] array) {
        int lo = 0;
        int hi = array.length;

        int mid = lo + (hi - lo) / 2;

        while (lo < hi) {

            if (array[mid] == v) {
                return mid;
            } else if (array[mid] < v) {
                lo = mid++;
                mid = lo + (hi - lo + 1) / 2;
            } else if (array[mid] > v) {
                hi = mid--;
                mid = lo + (hi - lo) / 2;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.findIndex(v, array));
    }

}
