package BinnarySerch;

public class decreacingArray2 {
    public static void main(String[] args) {
        int [] arr= {9,8,5,4,2,1,-5,-6,-7,-9};
        int n= arr.length;
        int tar=11;
        int lo=0;
        int hi=n-1;
       while (lo<=hi){
            int mid = (lo+hi)/2;
       if (arr[mid]==tar)  {
           System.out.println("found "+ mid);
           return;
       } else if (arr[mid]<tar) {
           hi=mid-1;

       }else {
           lo=mid+1;
       }
       }
        System.out.println("not found");
       return;
    }
}

