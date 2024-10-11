public class DecimalToOctal {
    public static void main(String[] args) {
        int num = 98;

        String octal_string = "";

        while(num != 0){
            octal_string += num % 8;
            num = num / 8;
        }

        for(int i = octal_string.length() - 1; i >= 0; i--){
            System.out.print(octal_string.charAt(i));
        }
    }
}
