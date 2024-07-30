
class Book{
    int pages;
    int price;
    float rating;
    double fine;
}

public class IntroToArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int brr[] = new int[10];


        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for(int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
