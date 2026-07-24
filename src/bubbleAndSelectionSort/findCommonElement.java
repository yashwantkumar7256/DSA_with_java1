package bubbleAndSelectionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findCommonElement {
    public static void main(String[] args) {
        int[] arr1={1,33,4,13,54,5,6,2};
        int [] arr2={ 34,16,4,1,64,2,5,65,9};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;

       while (i<arr1.length && j<arr2.length){
           if (arr1[i]==arr2[j]){
               System.out.print(arr1[i]+" ");
               i++;
               j++;
           } else if (arr1[i]>arr2[j]) {
               j++;

           } else if (arr1[i]<arr2[j]) {
               i++;

           }

       }


        }
}
