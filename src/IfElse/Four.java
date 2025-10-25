package IfElse;

import java.util.Scanner;
//Ques: Take positive integer input and
//print:
// Riya
// Bank
// Apurva
// Isha
// _________ if number is divisible by 5
// _________ if number is divisible by 3
// _________ if number is divisible by 5 & 3 both
// _________ if number is not divisible by 5 or 3

public class Four {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num=scanner.nextInt();

        if(num%5==0){
            System.out.println("riya");

        }if(num%3==0){
            System.out.println("Banu");
        }if(num%5==0&&num%3==0){
            System.out.println("apurva");
        }if(num %5 !=0 && num%3 !=0){
            System.out.println("isha");
        }
    }
}
