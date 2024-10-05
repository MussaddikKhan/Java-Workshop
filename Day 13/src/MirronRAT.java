public class MirronRAT {
    public static void main(String[] args) {
        int n = 4;
        for(int it = 1; it <= n; it++){
            for(int num = 1; num <=  it; num++){
                System.out.print(num + " ");
            }
            for(int space = 1; space <= 2 * n - 2 * it; space++){
                System.out.print("  ");
            }
            for(int num = it; num >= 1; num--){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
