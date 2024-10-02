public class RightAnglTraingleRowWise {
    public static void main(String[] args) {
        int n = 5;
        for(int rep = 1; rep <= n; rep++){
            for(int num = 1; num <= rep; num++){
                System.out.print(rep);
            }
            System.out.println();
        }
    }
}
