public class halfDimaond {
    public static void main(String[] args) {
        int n = 10;
        for (int rep = 1; rep <= n; rep++) {
            if (rep <= 5) {
                for (int star = 1; star <= rep; star++) {
                    
                    System.out.printf(" * ");    //  -> printing the start

                }
            } else {
                for (int star = 1; star <= n - rep; star++) {   // n - rep + 1;
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
//        n = 4;
//        for(int rep = n; rep >= 1; rep--){
//            for(int star = 1; star <= rep; star++){   // n - rep + 1;
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
    }
}
