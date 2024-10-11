public class OctalToDecimal {
    public static void main(String[] args) {
        String s = "142";
//         left to right
        int x = s.length() - 1;
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            int bit = s.charAt(i) - '0';
            number += (bit * Math.pow(8, x));
            x = x - 1;
        }
        System.out.println(number);

    }
}
