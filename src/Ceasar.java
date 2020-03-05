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

        //List<String> strings = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

        String[] arr = scanner.nextLine().split(" ");

        for (int i = 0; i < arr.length; i++) {



          int d=0;
          Boolean isNumber;
          try {
            d = Integer.parseInt(arr[i]);

            isNumber = true;
          }catch(NumberFormatException nfe){
            isNumber = false;
          }






                if (!arr[i].equals("0") && isNumber)
                {


                    for (int j = i; j < arr.length; j++) {



                      String s =arr[j];
                      Character letter = s.charAt(0);

                      if (isNumber){

                      }else {
                          int value = letter;
                          value = value + d;
                          arr[j]= String.valueOf((char) value);
                         
                      }

                    }
                }

                if (arr[i].equals("^") ){
                combo +=1;

            }else{

                    for (int j = 1; j < combo; j++) {

                        arr[(i-1-combo-j)]  = "0";
                        arr[(i-1-j)]  = "0";

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

