package arr;

public class maxInArray5 {
    public static void main(String[] args) {
        int[] arr={3,1,2,4,5,6,12 ,11};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) max=arr[i];



        }
        System.out.println(max);
    }
}
