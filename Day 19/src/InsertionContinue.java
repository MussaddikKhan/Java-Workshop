public class InsertionContinue {

    // Display the Array Element
    public static void display(int arr[], int currSize){
        for(int i = 0; i < currSize ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Find The Value Present or Not
    public  static  int checkValue(int arr[], int currSize, int key){
        for(int i = 0; i < currSize; i++){
            if(arr[i] == key)return i;
        }
        return -1;
    }

    // Inset the eleent at specifix index
    public  static  void insertAtIndex(int arr[], int index, int value, int actualSize, int currSize){
        /**
         * 1. Insert at the index  -> index
         * 2. Insert before the index   -> index - 1
         * 3. Insert After the index    -> index + 1
         */
        if(currSize < actualSize){
            // Check For Valid index
            if(index < 0 || index >= actualSize){      // < 0 || >= size eg (10)
                System.out.println("The Given index is invalid ");
            }
            else{
                // Right Shift the Element by 1 ;
                for(int i = currSize; i >= index; i--){
                    arr[i+1] = arr[i];
                }
             /**   if(index - 1 >= 0){
                    arr[index - 1] = value;  // prev
                }
                if(index + 1 < actualSize){
                    arr[index + 1] = value;   // next;
                }
              */
                arr[index] = value;       // curr
            }
        }
        else{
            System.out.println("Array is Full..... !");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,-1,-1,-1,-1}; // -1 reprsent empty block
        int actualSize = arr.length;
        System.out.println(actualSize);
        int currSize = 4;
//        int index = 1;
        int value = 0;
        display(arr, currSize);
//        insertAtIndex(arr, index + 1, value, actualSize, currSize);
        
        int key = 1;
        int index = checkValue(arr, currSize, key);
        if(index == -1){
            System.out.println("Key is Not Present ");
        }
        else{
            insertAtIndex(arr, index - 1, value, actualSize, currSize);
            currSize = currSize + 1;
        }
        display(arr, currSize);
    }
}
