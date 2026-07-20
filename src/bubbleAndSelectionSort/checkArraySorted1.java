package bubbleAndSelectionSort;

public class checkArraySorted1 {
    public static void main(String[] args) {
        int [] arr ={12,23,22,56,56,66,88,96};
        boolean sorted=true;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]>arr[i+1]) {
                sorted = false;
            }


        }
        if (sorted) System.out.println("array is sorted");
        if (!sorted) System.out.println("it is not sorted");

    }
}
