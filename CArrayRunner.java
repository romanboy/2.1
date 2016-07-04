/*************************************************************************************
About: This program is written as part of the fulfilment for the ‘Data Structure and Algorithms’
Course - HND in CSD at Icon College, London.
Date : June 2016
By : Radu Ciuca. Student ID: 13448
*************************************************************************************/

public class CArrayRunner {
    public static void main(String[] args) throws Exception {
        CArray cArray = new CArray();
        int[] array = new int[100000];
        cArray.populateArray(array);
        int[] arrayquick = array;
        int[] arraybubble = array;
        int[] arrayinsertion = array;
        System.out.println("done populating array");

        System.out.println("quick sorting now:");
        long startTimeQuick = System.nanoTime();
        cArray.quickSort(arrayquick, 0, arrayquick.length-1);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        long endTimeQuick = System.nanoTime();
        long durationQuick = (endTimeQuick - startTimeQuick);
        System.out.println("done quick sorting, in " + durationQuick/1000000 +"ms");



        System.out.println("bubble sorting now:");
        long startTimeBubble = System.nanoTime();
        cArray.bubbleSort(arraybubble, 0, arraybubble.length-1);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        long endTimeBubble = System.nanoTime();
        long durationBubble = (endTimeBubble - startTimeBubble);
        System.out.println("done bubble sorting, in " + durationBubble/1000000 +"ms");




        System.out.println("insertion sorting now:");
        long startTimeInsertion = System.nanoTime();
        cArray.insertionSort(arrayinsertion, 0, arrayinsertion.length-1);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        long endTimeInsertion = System.nanoTime();
        long durationInsertion = (endTimeInsertion - startTimeInsertion);
        System.out.println("done insertion sorting, in " + durationInsertion/1000000 +"ms");
        System.out.println("Comparison:");
        System.out.println("Quick: "+ durationQuick/1000000 +"ms");
        System.out.println("Bubble: "+ durationBubble/1000000 +"ms");
        System.out.println("Insertion: "+ durationInsertion/1000000 +"ms");

    }
}
