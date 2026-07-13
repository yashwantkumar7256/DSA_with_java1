package arr;

public class oddEvenIndex7 {
    public static void main(String[] args) {
        int[] arr={1,2,34,5,45,66};
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                arr[i]*=2;
            }else {
                arr[i]+=10;
            }

        }
        for(int ele : arr){
            System.out.print(ele+" " );
        }

    }
}
