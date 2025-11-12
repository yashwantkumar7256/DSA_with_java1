package Array;

import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        System.out.println("enter 5 number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n= arr.length+1;
        int sum = n*(n+1)/2;
        int Ssum=0;
        for (int i = 0; i <arr.length ; i++) {
        Ssum+=arr[i];

        }

        System.out.println(sum-Ssum);
    }
}
