public class FindElementInArray {

    boolean isPresent(int arr[], int k){

        for(int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == k)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        FindElementInArray obj = new FindElementInArray();
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 5;
        System.out.println(arr.length);
        if(obj.isPresent(arr, k)){
            System.out.println("The element k is present in array ");
        }
        else{
            System.out.println("The element k is not present in array");
        }
    }
}
