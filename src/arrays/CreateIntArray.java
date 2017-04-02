package arrays;


import java.util.Random;

public class CreateIntArray {

    public static int[] fillArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i++ )
            array[i] = generateInt();

        return array;
    }


    private static int generateInt(){
        Random random = new Random();
        return random.nextInt(1073741824);
    }

}
