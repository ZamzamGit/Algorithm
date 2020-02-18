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

            for (int m = 0; m < c; m++) {
                k = k + 1;
            }
            k = k % student.size();
            if (k == 0){
                k = student.size();
            }
            student.remove(k-1);
            System.out.println(student);
        }
    }
}



