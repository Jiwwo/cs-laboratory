import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ans = getAns();
        while (ans){
            System.out.println("input x");
            System.out.println("input y");
            System.out.println(oblast(sc.nextInt(),sc.nextInt()));
            ans = getAns();
        }
    }
    public static boolean oblast(double x , double y){
        return ((x >= 0 && x * x + y * y <= 36) && ((pow(x - 2, 2) + pow(y - 3, 2) >= 4) || (pow(x - 2, 2) + pow(y - 4, 2) <= 1))
                && (((pow(x - 2, 2) + pow(y + 1, 2) <= 1) || (pow(x - 2, 2) + pow(y + 3, 2) <= 1))||((!(y < -0.2 * x + 1) || !(x < 5)) || (!(y > 0.4 * x - 5)))));
    }
    public static boolean getAns(){
        System.out.println("check dots? 1 - yes , else - no");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        return ans == 1;
        }
}
