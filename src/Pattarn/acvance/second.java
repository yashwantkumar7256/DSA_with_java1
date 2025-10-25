package Pattarn.acvance;

public class second {
    public static void main(String[] args) {
//A
//A B
//A B C
//A B C D
//        char ch='A';
//        for (int i = 1; i <=4; i++) {
//
//            for (int j = 1; j <=4; j++) {
//                if (j<=i){
//                    System.out.print(ch);
//                    ch++;
//                }else{
//                    System.out.print("");
//                }
//            }
//            System.out.println();
//            ch='A';
//        }

//        1
//        A B
//        1 2 3
//        A B C D
//        1 2 3 4 5

        char ch='A';
        for (int i = 1; i <=5 ; i++) {

            for (int j =1; j <=5; j++) {
                if (j<=i ){
                    if (i%2==0) {
                        System.out.print(ch+" ");
                        ch++;
                    }else {
                        System.out.print(j+" ");

                    }

                }else {
                    System.out.print("");
                }

            }
            System.out.println();
            ch='A';
        }

    }
}
