class Calculator{
    // 1. Without return type without parameters
   void sum(){
       int a = 5;
       int b= 5;
       int sum = a + b;
       System.out.println("the sum of " + a + " + " + b + " = " + sum);
   }
   // 2. Without Return Type With parameters
    void  sub(int a, int b){
       int sub = a - b;
       System.out.println("the subtraction of " + a + " - " + b + " = " + sub);
    }

    //3. with Return type without parameters;
    int mul(){
       int a = 10, b = 5;
       int multi = a * b;
       return  multi;
    }

    //4. with return type with paramete

    float div(int a, double b){
         return (float) (a/ b);
    }
}

public class IntroMethods {
    public static void main(String[] args) {
       //step 1 :-> create the object
        Calculator c1 = new Calculator();
        c1.sum();
        c1.sub(10 , 5);
        System.out.println("the multiplication of two numbers = " + c1.mul());
        System.out.println(c1.div(10, 3.0f));
    }
}
