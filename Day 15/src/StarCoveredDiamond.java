public class StarCoveredDiamond {
    public static void main(String[] args) {
        int n = 5;
        // Top
        for(int it = n; it >= 1; it--){
            for(int star = 1; star <= it; star++){
                System.out.print("* ");
            }
            for(int space = 1; space <= 2 * n - 2 *  it; space++){
                System.out.print("  ");
            }
            for(int star = 1; star <= it; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Bottom
        for(int it = 1; it <= n; it++){
            for(int star = 1; star <= it; star++){
                System.out.print("* ");
            }
            for(int space = 1; space <= 2 * n - 2 *  it; space++){
                System.out.print("  ");
            }
            for(int star = 1; star <= it; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
