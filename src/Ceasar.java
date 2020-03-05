import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ceasar {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //List<String> strings = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

        String[] arr = scanner.nextLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("^")){
                arr[i] = "0";
                arr[i-1] = "0";

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("0")) {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
        }

        }



    }

