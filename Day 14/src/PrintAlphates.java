public class PrintAlphates {
    public static void main(String[] args) {
         // Print the Capital Alphates;

        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print((int)ch + " ");  // A B C D E ... Z
        }
        System.out.println();

        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch + " ");  // a b c d e ... z
        }
        System.out.println();
        for(char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch + " ");  // A B C D E ... Z
        }
        System.out.println();

        // z y x w ... a
        for(char ch = 'z'; ch >= 'a'; ch--){
            System.out.print(ch + " ");  // a b c d e ... z
        }
        System.out.println();
        for(int ch = 65; ch <= 90; ch++){
            System.out.print((char) ch +  " ");   // A - Z   / 65 - 90 :
        }
        System.out.println();

        char ch = 'A';
        while(ch <= 'Z'){
            System.out.print(ch +  " ");
             ch++; 
        }

        
    }
}
