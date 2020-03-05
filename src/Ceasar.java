import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ceasar {


    public static void main(String[] args) {

        int combo = 0;
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        for (int i = 0; i < arr.length; i++) {

            int d = 0;
            Boolean isNumber;
            try {
                d = Integer.parseInt(arr[i]);
                isNumber = true;
            } catch (NumberFormatException nfe) {
                isNumber = false;
            }


            if (!arr[i].equals("0") && isNumber) {
                for (int j = i; j < arr.length; j++) {

                    Boolean isAnotherNumber;
                    try {
                        Integer.parseInt(arr[j]);
                        isAnotherNumber = true;

                    } catch (NumberFormatException nfe) {
                        isAnotherNumber = false;
                    }

                    if (!isAnotherNumber && !arr[j].equals("^")) {
                        String s = arr[j];
                        Character letter = s.charAt(0);
                        int value = letter;
                        value = value + d;
                        arr[j] = String.valueOf((char) value);
                    } else {
                        if (!arr[j].equals("^")) {
                            arr[i] = "0";
                        }
                    }
                }
            }


            if (arr[i].equals("^")) {
                combo += 1;
                try {
                    if (!arr[i + 1].equals("^")) {
                        for (int j = 0; j < combo; j++) {

                            arr[(i - combo - j)] = "0";
                            arr[(i - j)] = "0";
                        }
                        combo = 0;
                    }
                } catch (ArrayIndexOutOfBoundsException nfe) {

                    for (int j = 0; j < combo; j++) {
                        arr[(i - combo - j)] = "0";
                        arr[(i - j)] = "0";
                    }
                    combo = 0;
                }
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


