public class DecimalToHex2 {
    public static void main(String[] args) {
        int num = 1228;
        String  hex = "";
        while (num != 0){
            int bit = num % 16;
            if(bit <= 9){
                hex += bit;
            }
            else{
                hex += (char)('A' + bit - 10);
            }
            num /= 16;
        }
        for (int i = hex.length()-1; i >= 0; i--){
            System.out.print(hex.charAt(i));
        }
    }
}
