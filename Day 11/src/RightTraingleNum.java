public class RightTraingleNum {
    public static void main(String[] args) {
        int n = 5;
        for(int rep = 1; rep <= n; rep++){
            for(int num = rep; num >= 1; num--){
                System.out.print(num);    //  -> printing the start

            }
            System.out.println();
        }

    }
}
