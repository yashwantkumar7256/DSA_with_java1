package IfElse;

import java.util.Scanner;

//HW: Take 3 positive integers input and
//print the least of them
public class five {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 3 integer number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println( "The least number="+num1);
        } else if (num2<num1 && num2<num3) {
            System.out.println("The least number="+num2);

        } else if (num3<num1 && num3<num2) {
            System.out.println("The least number="+num3);

    }
}
}
