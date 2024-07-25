public class LoopWithBreakStatement {
    public static void main(String[] args) {
        int i = 1;
        for(;;){
            System.out.print(i + " , ");
            if(i >= 5){
                break;
            }
            i++;
        }
    }
}
