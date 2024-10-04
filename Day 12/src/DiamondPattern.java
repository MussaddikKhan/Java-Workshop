public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        int odd = 1;
        for(int rep = 1; rep <= n; rep++){  // -> odd <= n
            for(int space = 1; space <= n - rep; space++){ // problem b ->
                System.out.print("  ");
            }
            for(int star = 1; star <= odd; star++){  // star  <= 2 * rep - 1;    // Problem
                System.out.print("* ");
            }
            odd += 2;
            System.out.println();
        }
        n = 5; 
        for(int rep = n; rep >= 1; rep--){
            for(int space = 1; space <= n - rep; space++){
                System.out.print("  ");
            }
            for(int star = 1; star <= 2 * rep - 1; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
