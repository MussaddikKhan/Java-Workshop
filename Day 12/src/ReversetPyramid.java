public class ReversetPyramid {
    public static void main(String[] args) {
        int n = 5;
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
