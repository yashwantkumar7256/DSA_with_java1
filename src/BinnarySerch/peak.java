package BinnarySerch;

public class peak {
    public static void main(String[] args) {
        int arr[]={1,89,4,3,2,1};
        int lo=1;
        int hi=arr.length-2;

        while (lo<=hi){
            int mid=(lo+hi)/2;
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.println(arr[mid]);
                return;
            } else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo=mid+1;
                else hi=mid-1;
            }

        }

    }

