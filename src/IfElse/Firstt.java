package IfElse;

import java.util.Scanner;
//Ques: Take real number input and check
//if it is an integer or not

public class Firstt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        float num1=scanner.nextFloat();
        if (num1%2==0 ||num1%2==1 ){
            System.out.println("it is intger");

        }else {
            System.out.println("it is not integer");
        }
    }
}
