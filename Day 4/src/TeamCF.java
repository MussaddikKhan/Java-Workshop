import java.util.Scanner;

public class TeamCF {


    public static void main(String[] args) {
        int start = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int solve = 0;
        while(start <= n){
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();
            int correctCnt = 0;
            if(p == 1)correctCnt++;
            if(v == 1)correctCnt++;
            if(t == 1)correctCnt++;

            if(correctCnt >= 2){
                solve++;
            }
            start++;
        }
        System.out.println(solve);
    }
}
