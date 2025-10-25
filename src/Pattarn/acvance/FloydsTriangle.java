package Pattarn.acvance;

import java.util.Scanner;
//1
//2 3
// 4 5 6
// 7 8 9 10
//a++

//      1
//1 3
// 1 3 5
// 1 3 5 7
//a=+2
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=1;
        System.out.println("enter row & colume");
        int n =sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j<=n ; j++) {
                if(i>=j) {
                    System.out.print(a+" ");
                    a+=2;

                }
            }
            System.out.println();
            a=1;
        }
    }
}
