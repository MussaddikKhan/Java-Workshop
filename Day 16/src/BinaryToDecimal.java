public class BinaryToDecimal {
    public static void main(String[] args) {
        String s = "1111";
        // left to right
//        int x = s.length() - 1;

       /** for(int i = 0; i < s.length(); i++){
            int bit = s.charAt(i) - '0';
            number += (bit * Math.pow(2, x));
            x = x - 1;
        }
        */
        int number = 0;
       int x = 0;
       for(int i = s.length() - 1; i>= 0; i--){
           int bit = s.charAt(i) - '0';
           number += (bit * Math.pow(2, x));
           x++;
       }
        System.out.println(number);
    }
}
