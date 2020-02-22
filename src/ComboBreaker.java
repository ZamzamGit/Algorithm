import java.util.Scanner;

public class ComboBreaker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] moves = scanner.nextLine().split(" ");
        String nextMoves;
        String returnMoves = "";

        for (int i = 0; i < moves.length; i++) {
            if((i+3) < moves.length){
                nextMoves = moves[i] + moves[i+1] + moves[i+2] + moves[i+3];
                if(nextMoves.contains("C") && nextMoves.contains("L") && nextMoves.contains("R") && nextMoves.contains("S")) {
                    returnMoves += "F ";
                    i += 3;
                    continue;
                }
            }
            switch (moves[i]) {
                case "C":
                    returnMoves += "M ";
                    break;
                case "L":
                    returnMoves += "E ";
                    break;
                case "R":
                    returnMoves += "C ";
                    break;
                case "S":
                    returnMoves += "S ";
                    break;
            }
        }
        System.out.println(returnMoves);

        /*
        if (moves.contains("C") && moves.contains("L") && moves.contains("R") && moves.contains("S")) {
            System.out.println("F");
        } else {
            String returnMoves = "";
            String[] m = moves.split("");
            for (String s : m) {
                switch (s) {
                    case "C":
                        returnMoves += "M ";
                        break;
                    case "L":
                        returnMoves += "E ";
                        break;
                    case "R":
                        returnMoves += "C ";
                        break;
                    case "S":
                        returnMoves += "S ";
                        break;
                }
            }
            System.out.println(returnMoves);
        }
        */

    }
}


