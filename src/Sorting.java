public class Sorting {

    public static void main(String[] args) {

        int arr[] = {2, 8 , 6, 4, 3, 15, 5};

        insertion(arr);


    }
    public static void insertion(int[] arr) {
        for (int i = 2; i < arr.length - 1; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j > 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                arr[i + 1] = key;
                System.out.println(arr[j]);
            }
        }
    }

    public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < arr.length - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {

            }


        }

    }
}
