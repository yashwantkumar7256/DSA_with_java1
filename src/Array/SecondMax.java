package Array;

import com.sun.jdi.Value;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter 5 number");
        for (int i = 0; i < arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) max=arr[i];
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }

        System.out.println("Second max= "+smax);
    }
}
