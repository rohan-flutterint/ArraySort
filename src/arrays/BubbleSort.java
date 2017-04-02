package arrays;

import java.util.Arrays;

public class BubbleSort {
    int[] array;

    BubbleSort(){}

    BubbleSort(int[] array){
        this.array = array;
    }


    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort();
    }


    public int[] bubbleSort(){
        array = CreateIntArray.fillArray(15);
//        listArrayElements(array);
        boolean swap = true;
        while(swap) {
            swap = false;
            for (int i = 1; i < array.length; i++) {
                if(array[i-1] > array[i]){
                    int m = array[i-1];
                    array[i-1] = array[i];
                    array[i] = m;
                    swap = true;
                }
            }
        }
//        listArrayElements(array);

        return array;
    }

    public static void listArrayElements(int[] arr){
        System.out.println(Arrays.toString(arr));
    }


}
