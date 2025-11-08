package Array;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter 5 number");
        for (int i = 0; i < arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter target");
        int target=sc.nextInt();
        int a=1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target)  a=2;

        }

        if (a==2){
            System.out.println("target hit");
        }else {
            System.out.println("target not in array");
        }
    }
}
