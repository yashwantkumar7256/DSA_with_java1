package arr;

public class reverse10 {
    public static void main(String[] args) {
        int[] arr= {1,4,6,7,8,4,35,3};
        int j= arr.length-1;
        int i=0;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
       for (int a : arr){
           System.out.print(a+ " ");

        }
    }
}
