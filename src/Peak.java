import java.lang.reflect.Array;
import java.util.Arrays;

public class Peak {

    public static void main(String[] args) {

        int[] arr = {7, 2, 1, 1, 2, 9};

    }

    public static int peak1(int[] A, int n) {

        if (A[0] >= A[1]) {
            return 0;
        }
        for (int i = 1 ; i < A.length; i++) {
            if (A[i - 1] <= A[i] && A[i] >= A[i + 1]) {
                return A[i];
            } else if (A[n - 2] <= A[n - 1]) {
                return A[n - 1];
            }
        }
        return -1;
    }

    public static int peak2 (int [] A, int i, int j) {

        int m = (i + j) / 2;

        if(A[m] >= A[m - 1] && A[m] >= A[m + 1]) {
            return m;
        } else if(A[m - 1] > A[m]) {
            return peak2(A, i , m - 1);
        } else if (A[m] < A[m + 1]) {
            return peak2(A, m + 1 , j);
        }
        return -1;
    }
}
