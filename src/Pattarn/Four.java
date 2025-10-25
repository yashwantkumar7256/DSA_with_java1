package Pattarn;
// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4

public class Four {
    public static void main(String[] args) {
//        for (int i = 1; i<=4 ; i++) {
//            for (int j = 1; j <=4; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//


// A A A A
// B B B B
// C C C C
// D D D D
//        char ch='A';
//        for (int i =1; i <=4 ; i++) {
//
//            for (int j = 1; j <=4; j++) {
//                System.out.print(ch+" ");
//
//            }
//            System.out.println();
//            ch++;
//  }

//        a a a a
//        B B B B
//        c c c c
//        D D D D
        char ch= 'a';
        char c='A';
        for (int i = 1; i <=4 ; i++) {
            for (int j = 0; j <=4 ; j++) {
                if (i==1 || i==3) {
                    System.out.print(ch);
                }else {
                    System.out.print(c);
                }


            }
            System.out.println();
            ch++;
            c++;

        }

    }
}
