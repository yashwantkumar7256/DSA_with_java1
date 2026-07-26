package BinnarySerch;

public class equalOrjustLower5 {
    public static void main(String[] args) {
        int arr[]={1,3,4,56,76,90,91,99};
        int low=0;
        int idx=-1;
        int target=88;
        int high=arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                idx = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(idx);
    }
}
