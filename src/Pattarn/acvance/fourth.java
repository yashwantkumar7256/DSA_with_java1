package Pattarn.acvance;

public class fourth {
    public static void main(String[] args) {
        // a b c d
        // a b c
        // a b
        //a
        char ch='a';
        for (int i =1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                if (j<=5-i){
                    System.out.print(" "+ch);
                    ch++;
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            ch='a';
        }
    }
}
