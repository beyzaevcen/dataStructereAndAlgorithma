package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array){
        for(int i=1;i<array.length;i++){
            int temp=array[i];
            int j=i-1;
            while (j>-1&& temp <array[j]){
                array[j+1]=array[j];
                array[j]=temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int[] benimlist ={2,6,3,1,5,4};
        insertionSort(benimlist);
        System.out.println(Arrays.toString(benimlist));
    }
}
