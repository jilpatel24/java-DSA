class binarySearch{
   int binarySearch(int[] arr,int target){
      int start=0;
      int end=arr.length-1;
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
}
class p1{
       public static void main(String[] args) {
        int arr1[]={-2,5,7,8,12,18,35,48};
        int Target=18;
        binarySearch obj = new binarySearch();
        int ans = obj.binarySearch(arr1, Target);
        System.out.println(ans);
    }
}
