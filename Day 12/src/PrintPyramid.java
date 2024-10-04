public class PrintPyramid {
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
//        for(int i = 1 ; i <= 9; i+=2) System.out.print(i + " ");
    }
}

