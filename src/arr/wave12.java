package arr;

public class wave12 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,6,8,};

        for (int i = 0; i < arr.length; i+=2) {
            if (arr.length%2!=0 && i==arr.length-1) break;
            else {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }


        }
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
