

class Geeks {
    static void isDivisibleByPrime (int n)
    {
        if(n % 2 == 0 && n % 3 != 0 && n % 11 != 0){
            System.out.println("Two");
        }
        else if(n % 3 == 0 && n % 11 != 0){
            System.out.println("Three");
        }
        else if(n % 11 == 0){
            System.out.println("Eleven");
        }
        else{
            System.out.println("-1");
        }

    }

}
public class DivisibleNumberOptimized {
    public static void main(String[] args) {
        int n = 234;
        Geeks.isDivisibleByPrime(n);
    }
}
