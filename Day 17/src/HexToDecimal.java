public class HexToDecimal {
    public static void main(String[] args) {
        String hex = "4CC";
        int x = hex.length()-1;
        int num = 0;
        for(int i = 0; i < hex.length(); i++){
            char ch = hex.charAt(i);
            int bit = 0;
            if(ch >= '0' && ch <= '9'){
                bit = ch - '0';
            }
            else{
                bit = (int)((ch - 'A') + 10);
            }
            num  += (bit * Math.pow(16, x));
            x = x - 1; 
        }
        System.out.println(num);
    }
}
