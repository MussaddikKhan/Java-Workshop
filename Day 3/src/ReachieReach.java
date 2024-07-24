import java.util.Scanner;

public class ReachieReach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int start = 1;
        while(start <= testCase){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            int need = B - A;
            int year = need / X;
            System.out.println(year);
            start++;             
        }
    }
}
