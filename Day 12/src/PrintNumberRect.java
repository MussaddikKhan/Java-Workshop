public class PrintNumberRect {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int rep = 1; rep <= n; rep++ ){
            for(int start = 1; start <= rep; start++){
                System.out.print(num + " ");
                num++; 
            }
            System.out.println();
        }
    }
}
