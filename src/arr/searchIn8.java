package arr;

public class searchIn8 {
    public static void main(String[] args) {
        int[] arr={2,4,55,6,6,7,5,23};
        int target=3;
        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target) {
               found= true;
                break;
            }
        }
        if(found) System.out.println("hited");
        else System.out.println("not found");

    }
}
