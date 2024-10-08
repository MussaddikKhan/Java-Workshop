public class AlphaRectangle2 {
    public static void main(String[] args) {
        int n = 5;

        for(int it = n; it >= 1; it--){
            for(int num = it; num <= n; num++){  // (num <= x ... value of x -> it )
                System.out.print((char)('A' + num - 1) + " ");
            }
            System.out.println();
        }
        
    }
}
