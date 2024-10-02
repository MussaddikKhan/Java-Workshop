public class ReverseRighAngledTraingle {
    public static void main(String[] args) {
        int n = 5;
        for(int rep = n; rep >= 1; rep--){
            for(int star = 1; star <= rep; star++){   // n - rep + 1;
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
