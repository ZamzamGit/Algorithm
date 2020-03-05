import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ceasar {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> strings = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));


        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals("^")){
                strings.remove(i);
                strings.remove(i-1);
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i));
            System.out.print(" ");
        }

        }



    }

