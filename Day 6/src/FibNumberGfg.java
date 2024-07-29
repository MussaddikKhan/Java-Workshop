public class FibNumberGfg {
    public static void main(String[] args) {
        int n = 6;

        int prev2 = 0;
        int prev1 = 1;

        for(int i = 2;  i <= n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);

        int x = (int) 2e31-1;
        System.out.println(x + 3);

    }
}
