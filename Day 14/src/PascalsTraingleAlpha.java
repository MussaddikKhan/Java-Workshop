public class PascalsTraingleAlpha {
    public static void main(String[] args) {
        int n = 5;
        for(int it = 1; it <= n; it++){
            for(int space = 1; space <= n - it; space++){
                System.out.print("  ");
            }
            char ch = 'A';
            for(int num = 1; num <= it; num++){
                System.out.print(ch + " ");
                ch++;
            }
            ch -= 2;
            for(int num = it - 1; num >= 1; num--){
                System.out.print(ch + " ");
                --ch; 
            }
            System.out.println();
        }
    }
}
