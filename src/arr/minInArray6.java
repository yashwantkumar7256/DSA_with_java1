package arr;

public class minInArray6 {
    public static void main(String[] args) {
        int[] arr={23,3,3,4545,5,665,767,};
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] <min) {
                min=arr[i];
            }

        }
        System.out.println(min);
    }
}
