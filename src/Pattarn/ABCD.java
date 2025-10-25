package Pattarn;
// A B C D
// A B C D
// A B C D
// A B C D
public class ABCD {
    public static void main(String[] args) {
//        char ch='A';
        for (int i = 1; i <=4 ; i++) {
            char ch='A';
            for (int j = 1; j <=4 ; j++) {
                System.out.print(ch+" ");
               ch++;

            }
            System.out.println();

        }
    }
}
