package Array;

import java.util.Scanner;

public class NegativeNumArr {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int[]arr =new int[5];
        System.out.println("Enter  numbers");


        for (int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]<0)
                System.out.println(arr[i]);

        }

    }
}
