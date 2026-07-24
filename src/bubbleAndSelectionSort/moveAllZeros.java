package bubbleAndSelectionSort;

public class moveAllZeros {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 0, 5, 45, 0, 56, 0};


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {


            if (arr[j + 1] != 0 && arr[j] == 0) {

                int temp = arr[j];
                arr[j] = arr[j+ 1];
                arr[j+ 1] = temp;

            }
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

}