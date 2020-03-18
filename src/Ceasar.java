import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Ceasar {
    public static void main(String[] args) {
        boolean searching = false;
        int changingNumber = 0;
        int tempI1 = 0;
        int tempI2 = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<String> strings = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

        for (int i = 0; i <strings.size() ; i++) {


            if(strings.get(i).equals("^") && !searching){
                try {
                    changingNumber = Integer.parseInt(strings.get(i-1));
                    tempI1 = i;
                    tempI2 = i-1;
                    searching = true;



                } catch (NumberFormatException nfe) {
                    searching = false;
                    strings.remove(i);
                    strings.remove(i-1);
                    i = 0;
                }
            }
            if(searching){
                try {
                    Integer.parseInt(strings.get(i));

                } catch (NumberFormatException nfe) {
                    if (!strings.get(i).equals("^")){
                        String s = strings.get(i);
                        char letter = s.charAt(0);
                        int value = letter;
                        int newChangingNumber = changingNumber % 26;
                        value = value + newChangingNumber;

                        if (value > 90){
                            value = value - 90 + 64;
                        }
                        strings.set(i,String.valueOf((char) value));
                    }
                }
                if (i == strings.size()-1){
                    searching = false;
                    i = tempI1-2;
                    strings.remove(tempI1);
                    strings.remove(tempI2);

                }
            }

        }
        for (int i = 0; i <strings.size(); i++) {
            System.out.print(strings.get(i));
            System.out.print(" ");
        }

    }
}


