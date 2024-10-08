public class AlphaRectangle {
    public static void main(String[] args) {
        int n = 5;
        for(int it = 1; it <= n; it++){
            int x = it + n;
            for(int num = it; num <= x; num++){
                System.out.print((char)('A' + num - 1) + " ");
            }
            System.out.println();
        }
    }
}
