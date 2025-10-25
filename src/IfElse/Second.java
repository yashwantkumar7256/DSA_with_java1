package IfElse;

import java.util.Scanner;
//Ques: If cost price and selling price of an
//item is input through the keyboard, write a
//program to determine whether the seller
//has made profit or incurred loss or no profit
//no loss. Also determine how much profit he
//made or loss he incurred.

public class Second {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a selling price");
        int selling=scanner.nextInt();
        System.out.println("Enter a cost price");
        int cost=scanner.nextInt();
        int num=cost-selling;
        if (cost==selling){
            System.out.println("no profit");
        } else if (cost>selling) {
            System.out.println("profit is="+num);

            }else {
            System.out.println("loss is ="+( selling-cost));

        }


    }
}
