import java.util.Scanner;

public class MathClassMethods {
    public static void main(String[] args) {
  
        int a = 5, b = 10, c = 15;
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, Math.min(b, c)));
        System.out.println(Math.max(a, Math.max(b, c)));
        float F = 5.4f;
        System.out.println(Math.round(F));
        System.out.println();
        
    }

}
