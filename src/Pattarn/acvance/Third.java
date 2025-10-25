package Pattarn.acvance;

public class Third {
    public static void main(String[] args) {
// * * * *
// * * *
// * *
// *
//        for (int i = 1; i <=4 ; i++) {
//            for(int j=1; j<=4; j++){
//                if (j<=5-i) {
//                    System.out.print("* ");
//
//
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
    //    }

// 1 2 3 4
// 1 2 3
// 1 2
// 1

        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4 ; j++) {
                if (j<=5-i){
                    System.out.print(" "+ j);
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
