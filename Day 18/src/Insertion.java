public class Insertion {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,-1,-1,-1,-1};
        int actualSize = arr.length;
        System.out.println(actualSize);
        int currSize = 4;
        int index = 1;
        int value = 2;
        for(int i = 0; i < currSize ; i++) System.out.print(arr[i] + " ");
        System.out.println();
        if(currSize < actualSize){
            // Check For Valid index
            if(index < 0 || index >= actualSize){
                System.out.println("The Given index is invalid ");
            }
            else{
                // Right Shift the Element by 1 ;
                for(int i = currSize; i >= index; i--){
                    arr[i+1] = arr[i];
                }
                arr[index] = value;
                currSize = currSize + 1;
                for(int i = 0; i < currSize ; i++) System.out.print(arr[i] + " ");
                System.out.println();
            }
        }
        else{
            System.out.println("Array is Full..... !");
        }
    }
}
