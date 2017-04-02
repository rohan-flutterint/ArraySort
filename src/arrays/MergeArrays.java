package arrays;


public class MergeArrays {

    int[] array1;
    int[] array2;


    public static void main(String[] args) {
        MergeArrays mergeArrays = new MergeArrays();
        mergeArrays.createArrays();
    }

    private void createArrays(){
//        BubbleSort bubbleSort = new BubbleSort(CreateIntArray.fillArray(15)).;
        array1 = new BubbleSort(CreateIntArray.fillArray(15)).bubbleSort();
        array2 = new BubbleSort(CreateIntArray.fillArray(15)).bubbleSort();
        BubbleSort.listArrayElements(array1);
        BubbleSort.listArrayElements(array2);

        int[] array = new int[array1.length + array2.length];

        int i = 0, j = 0;
        for (int k = 0; k < array.length; k++){
            if(i > array1.length - 1){
                array[k] = array2[j];
                j++;
            } else if(j > array2.length - 1){
                array[k] = array1[i];
                i++;
            } else if (array1[i] > array2[j]){
                array[k] = array2[j];
                j++;
            } else {
                array[k] = array1[i];
                i++;
            }

        }
        BubbleSort.listArrayElements(array);


    }

}
