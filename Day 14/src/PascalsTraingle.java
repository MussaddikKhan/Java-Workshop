public class PascalsTraingle {
    public static void main(String[] args) {
        int n = 5;
        for(int it = 1; it <= n; it++){
            for(int space = 1; space <= n - it; space++){
                System.out.print("  ");
            }
            for(int num = 1; num <= it; num++){
                System.out.print(num + " ");
            }
            for(int num = it - 1; num >= 1; num--){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
