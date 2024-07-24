public class CheckOddEven {
    public static void main(String[] args) {
        int a = 11;
        if((a & 1) == 0){
            System.out.println("This is the even number " + a);
        }
        else{
            System.out.println("This is the odd number " + a );
        }
    }
}
