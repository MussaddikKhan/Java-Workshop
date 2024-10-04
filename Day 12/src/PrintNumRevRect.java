public class PrintNumRevRect {
    public static void main(String[] args) {
        int n = 5;
        for(int rep  = n; rep >= 1; rep--){
            for(int num = 1; num <= rep; num++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
