public class Arrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        // Access Element 1 by 1 
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
//        arr[3] = arr[2];
        arr[3] = 9;
        // Printing The Array Element .
        for(int i = 0; i < arr.length; i++){
            // 0 1 2 3 4 ... n
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        
    }
}
