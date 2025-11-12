package Array;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter 5 number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = arr.length-1;

        while (i<j) {
           int b=arr[i];
            arr[i]=arr[j];
            arr[j]=b;
            i++;
            j--;

        }
        for (int ele:arr){
            System.out.println(ele);
        }
    }
}
