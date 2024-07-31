import java.util.*;
import java.lang.*;
import java.io.*;

public class InsertAfterValue {
    static int isPresent(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == k) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[8];

        // Assign -1 to indicate empty position
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        Scanner sc = new Scanner(System.in);

        //Taking input from user -->
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        // 1 3 5 8 4 3 9 10
        //Printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        int key = 5;
        int value = 6;
        // Find The index key {5};

        int idx = isPresent(arr, key);

        // Next empty Index ?
        int eIdx = isPresent(arr, -1);

        if (eIdx != -1) {
            for (int i = eIdx - 1; i >= (idx + 1); i--) {
                arr[i + 1] = arr[i];
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            arr[idx + 1] = value;
        } else {
            System.out.println("We can't insert element.....Array is Full.!!!");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
