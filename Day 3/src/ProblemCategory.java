
import java.util.Scanner;

public class ProblemCategory {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int testCase = sc.nextInt();
        int start = 1;
        while(start <= testCase){
            int x = sc.nextInt();
            if(1 <= x && x < 100){
                System.out.println("Easy");
            }
            else if(100 <= x && x < 200){
                System.out.println("Medium");
            }
            else {
                System.out.println("Hard");
            }
            start++;
        }
    }
}

