public class Main {

    public static void main(String[] args) {

        int[] A = {3, 2, 2, 2, 2, 5, 5, 2};
        int[] B = {9, 9, 9, 9, 9, 9, 9, 9};

        System.out.println(ALG1(A));

    }

    private static int ALG1(int[] A) {
        int l = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (ALG2(A, i, j) && (j - i + 1) > l) {
                    l = j - i + 1;
                }
            }
        }
        return l;
    }

    private static boolean ALG2(int[] A, int i, int j) {
        if (i == j) {
            return true;
        }
        for (int k = i; k < j; k++) {
            if (A[k] != A[k + 1]) {
                return false;
            }
        }
        return true;
    }

    private static int ALG3(int[] A) {
        int l = 0;
        int i = 0;
        while (i < A.length) {
            i++;
            for (int j = i; j < A.length; j++) {
                if (ALG2(A, i, j) && (j - i + 1) > l) {
                    l = j - i + 1;
                }
            }
        }
        return l;
    }
}

