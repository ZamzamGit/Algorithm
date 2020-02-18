import java.util.ArrayList;

public class TheRingOnFire {

    public static void main(String[] args) {

        ArrayList<Integer> student = new ArrayList<>();
        int studentAmount = 5;
        int c = 6;
        int k = 0;
        for (int i = 0; i < studentAmount; i++) {
            student.add(i);
        }

        while (student.size() > 1) {
            if (k + c > student.size()) {
                k = k + c - student.size();
            }
            student.remove(k);
            System.out.println(student);
        }
    }
}



