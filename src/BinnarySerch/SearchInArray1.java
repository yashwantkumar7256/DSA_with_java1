package BinnarySerch;

public class SearchInArray1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9};
        int tar=9;
        int n=arr.length;
        int i=0;
        int j=n-1;


while (i<=j){
    int  mid=(i+j)/2;
   if (arr[mid]==tar){
       System.out.println("found "+mid+"th index");
       return;
   } else if (arr[mid]<tar) {
       i=mid+1;


   }else {
       j=mid-1;
   }

}

        System.out.println("target not found");


    }
}
