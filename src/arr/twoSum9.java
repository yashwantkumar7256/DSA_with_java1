package arr;

public class twoSum9 {
    public static void main(String[] args) {
        int[] arr={1,32,43,43,4,3,23,4,5,3};
        int indexi=0;
        int indexk=0;

        int target=11;
        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            for (int k =i+1; k < arr.length; k++) {
                if (arr[i] + arr[k]==target) {
                    indexi=i;
                    indexk=k;
                    found=true;

                }

            }


        }
        if (found) System.out.println("found index j,k"+" "+indexi + " " +indexk);
        else System.out.println("not found");
    }
}
