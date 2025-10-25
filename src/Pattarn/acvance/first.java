package Pattarn.acvance;

public class first {
    public static void main(String[] args) {
// *
// * *
// * * *
// * * * *


//        for (int i = 1; i <=4; i++) {
//            for (int j = 1; j <=4; j++) {
//                if (j<=i){
//                    System.out.print("* ");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }

//        1
//        1 2
//        1 2 3
//        1 2 3 4

        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4 ; j++) {
                if (j<=i){
                    System.out.print(i+" ");
                }else {
                    System.out.print( " ");
                }


            }

            System.out.println();
        }
    }
}
