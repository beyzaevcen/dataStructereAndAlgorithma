package sort;

import java.util.Arrays;

public class Practice {

    public static void bubleSort(int[] array){
        for(int i= array.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray={4,2,6,5,1,3};
        bubleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
