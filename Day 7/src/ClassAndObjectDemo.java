class Book {
    int pages;
    long price;
    float ratings;
    double fine;
    boolean good;
}
public class ClassAndObjectDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.pages = 100;
        b1.price = 1000;
        b1.fine =  10;  // double x.0;
        b1.ratings = 4.5f;
        b1.good = true; 
        System.out.println(b1.pages);
        System.out.println(b1.price);
        System.out.println(b1.fine);
        System.out.println(b1.ratings);
        System.out.println(b1.good);
    }
}
