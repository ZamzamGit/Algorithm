import java.util.ArrayList;
import java.util.Scanner;

public class TheRingOnFire {

    public static void main(String[] args) {

        ArrayList<Integer> student = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int studentAmount = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        int v = 0;
        for (int i = 0; i < studentAmount; i++) {
            student.add(i + 1);
        }

        while (student.size() > k) {
            // System.out.println(student);
            for (int m = 1; m <= c; m++) {
                v += 1;
                if (v > student.size()) {
                    v = 1;
                }
            }
            student.remove(v - 1);
            v = v - 1;
        }
        for (Integer i : student) {
            System.out.println(i);
        }
    }
}






