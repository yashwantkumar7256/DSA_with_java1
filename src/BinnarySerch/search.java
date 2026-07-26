package BinnarySerch;

public class search {

    public static void main(String[] args) {
        int arr[]={9,7,6,4,3,2,-1,-4,};
        int target=5;
        int max=0;
        int min=arr.length-1;

        while (max<=min){

            int mid=(max+min)/2;
            System.out.println(mid);
            if (arr[mid]==target){
                System.out.println("found "+mid+"th index");
                return;
            }
            if (arr[mid]<target) {
                System.out.println("big");
             min=mid-1;
            }
            else{
                max=mid+1;
                System.out.println("small");
            }

        }
        System.out.println("not found");
    }
}
