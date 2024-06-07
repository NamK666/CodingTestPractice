import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    static String barkingDogProblem(boolean barking, int hour) {
        if (barking) {
            if(hour<7||hour>20){
                return "짖으면 안돼!!";
            }
        }else {
            return "든든하군!";
        }
        return barking && (hour < 7 || hour > 20) ? "짖으면 안돼!!" : "든든하군!";
    }
}

