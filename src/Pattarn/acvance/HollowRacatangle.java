package Pattarn.acvance;

import java.util.Scanner;

public class HollowRacatangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int m=sc.nextInt();
        System.out.println("enter colume");
        int n=sc.nextInt();
        for (int i =1; i <=m; i++) {
            for (int j= 1;j <=n ; j++) {
                if (i==j || j==n+1-i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
