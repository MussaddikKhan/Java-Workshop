public class BinaryToDecimal {
    public static void main(String[] args) {
        String s = "1010";
        int p = 0; 
        int num = 0; 
        for(int i = s.length() - 1; i >= 0; i--){
//            int bit = s.charAt(i) - '0';   //48 , 49
            num +=  ((s.charAt(i) - '0') * Math.pow(2, p));
            p++;
        }
//        System.out.println(num);

        int number = Integer.parseInt(s, 2);
        System.out.println(number);
    }
}
