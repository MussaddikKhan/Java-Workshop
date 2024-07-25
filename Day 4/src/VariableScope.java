public class VariableScope {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        int start = 1;
        while (start <= 3){
            System.out.println(a);
            a++;
            start++; 
        }
        System.out.println(a);
    }
}
