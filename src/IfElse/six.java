package IfElse;

import java.util.Scanner;

//Ques: Take positive integer input and
//tell if it is odd or even
public class six {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a integer");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("it is even number");
        } else  {
            System.out.println("it is odd number");

        }
    }
}
