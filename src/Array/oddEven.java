package Array;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
//        Ques: Multiply odd indexed elements by
//2 and add 10 to even indexed elements
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();

        }
        for (int i = 0; i < arr.length ; i++) {
            if (i%2==1) System.out.print((arr[i]*2+" "));
            else System.out.print(arr[i]+10+" ");

        }
    }
}
