import java.util.ArrayList;

public class TheRingOnFire {

    public static void main(String[] args) {

        ArrayList<Integer> student = new ArrayList<>();
        int studentAmount = 5;
        int c = 6;
        int k = 1;
        int v = 0;
        for (int i = 0; i < studentAmount; i++) {
            student.add(i+1);
        }


        while (student.size() >= k) {
            System.out.println(student);
            for (int m = 1; m <= c; m++) {
                v += 1;
                if (v > student.size()) {
                    v = 1;
                }
            }

            student.remove(v-1);
            v=v-1;




        }
    }
}



