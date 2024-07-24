public class Conditional {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 55;

        int large = 0;
        // we have to find large number
//        if(a > b && a > c){
//            System.out.println(a);
//        }
//        else if(b > c && b > a) {
//            System.out.println(b);
//        }
//        else{
//            System.out.println(c);
//        }
       large = a > b ? a : b;
        System.out.println(large);
    }
}
