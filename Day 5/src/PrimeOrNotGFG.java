public class PrimeOrNotGFG {

    public static String isPrime(int n) {
        if(n == 1)return "No";

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
         int n = 1789;
        System.out.println(isPrime(n));
    }
}
