package IfElse;

import java.util.Scanner;

//HW: Given a point (x, y), write a program
//to find out if it lies in the 1st Quadrant,
//2nd Quadrant, 3rd Quadrant, 4th
//Quadrant, on the x-axis, y-axis or at the
//origin.
//
public class Fifth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter 1st quadrant");
//        int num1=scanner.nextInt();
//        System.out.println("enter 2st quadrant");
//        int num2=scanner.nextInt();
//        if (num1>0&&num2>0 || num1==0 && num2==0){
//            System.out.println("it is in 1st quadrant");
//
//        } else if (num1<0&&num2>0){
//            System.out.println("it is in 2nd quadrant");
//
//        }  else if (num1<0&&num2<0){
//        System.out.println("it is in 3rd quadrant");
//
//        }  else if (num1>0&&num2<0){
//        System.out.println("it is in 4th quadrant");
//    }
//Ques: Take positive integer input and
//tell if it is a four digit number or not.

        System.out.println("enter a number ");
         int num1=scanner.nextInt();
         if (num1>999 && num1<10000){
             System.out.println("it is four digit number");
         }else {
             System.out.println("it is not four digit number");
         }




}
}
