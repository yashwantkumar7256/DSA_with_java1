package IfElse;

import java.util.Scanner;
//HW: Take length and breadth of
//rectangle as input and write a program
//to find whether the area of rectangle is
//greater than its perimeter

public class Third {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a rectangle lenght");
        float lenght=scanner.nextFloat();
        System.out.println("enter a rectangle breath");
        float breath=scanner.nextFloat();
        float perimeter=lenght*breath;
        System.out.println("perimeter is ="+perimeter);


    }
}
