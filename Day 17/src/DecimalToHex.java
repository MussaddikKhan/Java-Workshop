
@SuppressWarnings("ALL")
public class DecimalToHex {
    public static void main(String[] args) {
        int number = 1228;
        String hex = "";
        while (number != 0) {
            int bit = number % 16;
            if (bit <= 9) {
                hex += bit;
            } else {
                switch (bit) {
                    case 10:
                        hex += 'A';
                        break;
                    case 11:
                        hex += 'B';
                        break;
                    case 12:
                        hex += 'C';
                        break;
                    case 13:
                        hex += 'D';
                        break;
                    case 14:
                        hex += 'E';
                        break;
                    case 15 :
                        hex += 'F';
                        break;
                }
            }
            number = number / 16; 
        }
        for (int i = hex.length()-1; i >= 0; i--){
            System.out.print(hex.charAt(i));
        }
    }
}
