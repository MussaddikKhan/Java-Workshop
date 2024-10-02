public class WhitSpaceRightAnglTrngle {
    public static void main(String[] args) {
        int n = 5;
        for(int rep = n; rep >= 1; rep--){
            for(int star = 1; star < rep; star++)
            {
                System.out.print("   ");
            }
            for(int star = 1; star <= n - rep + 1; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
