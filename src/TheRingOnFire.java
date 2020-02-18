public class TheRingOnFire {

    public static void main(String[] args) {

        int students[] = new int[5];
        int c = 1;
        int k = 6;


        for (int i = 1; i < students.length; i++) {
            students[i] = i;
        }

        int landOnStudent = c + k;

        if (landOnStudent > students.length) {
            c = landOnStudent - students.length;
        }
        students[c] = 0;
        for (int i = 0; i < students.length-1; i++) {
            if (students[i] == 0){
                students[i] = students[i+1];
                students[i+1]=0;
            }
        }
        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i]);

        }

    }
}

