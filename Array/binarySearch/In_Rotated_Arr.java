public class p2{
    public static void main(String[] args) {
        int[] arr={2,5,6,7,9,12,14};
        int target=7;
        Find_pivot(arr);
        int ans= search(arr, target);
        System.out.println("Ans :"+ans);
    }
    static int search(int[] arr,int target){
        int pivot=Find_pivot(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }else if (target >= arr[pivot]) {
            return binarySearch(arr, target, 0, pivot-1);
        }
         int ans = binarySearch(arr, target, pivot+1,arr.length-1);
         System.out.println(ans);
         return 0;
        }
    static int binarySearch(int[] arr,int target,int start,int end){
      int mid=0;

      while(start <= end){
         mid = start + (end-start)/2;

         if(target > arr[mid]){
          start = mid+1;
         }
         else if(target < arr[mid]){
            end = mid-1;
         }
         else {
           return mid; 
         }
        
      }
     
      return -1; 
   }
    static int Find_pivot(int[] arr){
    int start=0;
    int end=arr.length-1;
    while(start <= end){
        int mid = start + (end-start)/2;
        if(mid > mid+1){
           return mid;
        }else if(mid < end && mid < mid-1){
           return mid-1;
        }
        else if(arr[start] >= arr[mid])//or arr[mid] <= arr[start]
        {
            end = mid-1;
        }else{
            start = mid+1;
        }
    }    
    return -1;      
    }
}
