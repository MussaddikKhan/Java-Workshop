public class BinaryRightAngleTraingle {
    public static void main(String[] args) {
        int n = 5;
        for(int it = 1; it <= n; it++){
            int var = it&1; 
            for(int j = 1; j <= it; j++){
                System.out.print(var + " ");
                var = var == 1 ? 0 : 1;
//                if(var == 1)var = 0;
//                else var = 1;
            }
            System.out.println();
        }
    }
}
