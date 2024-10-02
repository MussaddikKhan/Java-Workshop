public class RightTraingleStart {
    public static void main(String[] args) {
        int n = 5;
        for(int rep = 0; rep < n; rep++){
            for(int star = 0; star <= rep; star++){
                System.out.printf(" * ");    //  -> printing the start

            }
            System.out.println();
        }
    }
}
