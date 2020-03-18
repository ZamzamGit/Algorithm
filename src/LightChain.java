import java.util.Arrays;
import java.util.Scanner;

public class LightChain {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String[] strArr = (scanner.nextLine().split(" "));
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            String num = strArr[i];
            intArr[i] = Integer.parseInt(num);
        }
        Arrays.sort(intArr);
        System.out.print(Arrays.toString(intArr));
    }
}
