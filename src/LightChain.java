import java.util.Arrays;
import java.util.Scanner;

public class LightChain {

    public static void main(String[] args) {
        int c = 1;
        int h = 0;

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] strArr = (scanner.nextLine().split(" "));
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            String num = strArr[i];
            intArr[i] = Integer.parseInt(num);
        }
        Arrays.sort(intArr);



        for (int i = 0; i < intArr.length-1 ; i++) {

            if (intArr[i] == intArr[i+1]-1){
                c+=1;

            }else if(c > h){

                h = c;
                c= 1;

            } else {
                c = 1;

            }
            if (i == intArr.length-2){
                if (c> h) {
                    h = c;
                }
            }
        }
        System.out.println(h);
    }
}
