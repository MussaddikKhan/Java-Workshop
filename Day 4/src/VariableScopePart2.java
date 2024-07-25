public class VariableScopePart2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.print(a + " , ");
        System.out.println(b);
        int s = 1;
        while(s <= 5){
            a = 11;
            System.out.print(a + " , ");
            System.out.println(b);
            a++;
            b++;
            s++;
        }
        System.out.print(a + " , ");
        System.out.println(b);
    }
}
