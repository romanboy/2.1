/*************************************************************************************
About: This program is written as part of the fulfilment for the ‘Data Structure and Algorithms’
Course - HND in CSD at Icon College, London.
Date : June 2016
By : Radu Ciuca. Student ID: 13448
*************************************************************************************/

import java.util.Random;

public class CArray {
    public int[] populateArray(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            int randomNumber = (int)(Math.random() * 1000000 + 0);
            array[i] = randomNumber;
        }
        return array;
    }

    public void bubbleSort(int[] arr, int low, int high) throws Exception {
        int n = arr.length;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){

                if(arr[j-1] > arr[j]){
                    //swap the elements!
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void insertionSort(int[] arr, int low, int high) throws Exception {
        for (int i = 1; i < arr.length; i++) {
            int a = arr[i];
            int j;
            for (j = i - 1; j >=0 && arr[j] > a; j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = a;
        }
    }
    public void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;
        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }
}