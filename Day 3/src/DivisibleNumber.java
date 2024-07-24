
public class DivisibleNumber {
    public static void main(String[] args) {
        int n = 17;
        int result = 0;
        if(n % 2 == 0){
            result = 2;
        }
        if(n % 3 == 0){
            result = 3;
        }
        if(n % 11 == 0){
            result = 11;
        }
        switch(result){
            case 2 :
                System.out.println("Two");
                break;
            case 3 :
                System.out.println("Three");
                break;
            case 11 :
                System.out.println("Eleven");
                break;
            case 0 :
                System.out.println("Zero");
                break;
            default:
                System.out.println("-1");
        }
    }
}
