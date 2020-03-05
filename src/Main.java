public class Main {

    public static void main(String[] args) {

        int[] A = {3, 2, 2, 2, 2, 5, 5, 2};
        int[] B = {9, 9, 9, 9, 9, 9, 9, 9};
        int[] C = {1, 2, 2, 1, 9, 9, 9, 9};



        System.out.println(ALG1(A));
        System.out.println(ALG3(A));
        System.out.println(ALG1(B));
        System.out.println(ALG3(B));
        System.out.println(ALG1(C));
        System.out.println(ALG3(C));

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
        int combo = 1;
        int highest = 0;

        for (int i = 0; i < A.length-1 ; i++) {
            if (A[i] == A[i+1]){
                combo+=1;

            }else if(combo > highest){
                highest = combo;
                combo = 1;
            }
            if (i == A.length-2){
                if (combo > highest) {
                    highest = combo;
                }
            }
        }
        return highest;
    }
}


