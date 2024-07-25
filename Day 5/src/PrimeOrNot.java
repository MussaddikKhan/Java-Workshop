public class PrimeOrNot {
    public static void main(String[] args) {

        int num = 4;
        boolean  isPrime = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime == true){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the given number is not prime ");
        }

    }
}
