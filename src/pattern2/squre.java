package pattern2;



public class squre {
    public static void main(String[] args) {

//        square

//        int n =4 ;
//        for (int row= 1; row <=n ; row++) {
//            for (int  col = 1;  col<=n ; col ++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

//        rectangle
//       int row=3;
//       int col=2;
//
//        for (int j = 0; j<=col; j++) {
//        for (int i = 0; i <=row ; i++) {
//
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }


        //right angle
        int row =5;
        for (int i = 0; i <=row ; i++) {
            for (int j = 0; j <= row; j++) {
                if (j<=i){
                    System.out.print("* ");
                }


            }
            System.out.println();
        }

        
    }
}
