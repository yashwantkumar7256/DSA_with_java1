package Array;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter 5 number");
        for (int i = 0; i < arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter Target");
        int target= sc.nextInt();
      int i;
      int a=0;

        for ( i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    a++;

                }
            }
        }
            if (a == 1) {
                System.out.println("target hit");


            }else {
                System.out.println("target not hit");

            }

        }

    }

