package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int minIndex=i;
            for(int j=i+1;j<array.length;j++){
                if(array[minIndex]>array[j]){
                    minIndex=j;
                }
            }
            if(i!= minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] sayılarım ={2,1,8,4,9,5};
        selectionSort(sayılarım);
        System.out.println(Arrays.toString(sayılarım));
    }
}
