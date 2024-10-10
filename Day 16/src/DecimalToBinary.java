public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 11;
        String str = "";     // To store the binary number
        while(n != 0){
            int bit = n % 2;
            str += bit;
            n = n / 2;
        }

        int cnt = Integer.bitCount(n);
        for(int i = str.length() - 1 ; i >= 0; i--){
            System.out.print(str.charAt(i) + " ");
//              if(str.charAt(i) == '1')cnt++;
     }
//        System.out.println(cnt);
    }
}
