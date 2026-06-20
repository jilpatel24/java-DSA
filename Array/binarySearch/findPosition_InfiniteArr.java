  //findRange() for finding the range of array
class findPosition{
     int findRange(int[] arr,int target){
         int start=0;
         int end=1;

         while (target > arr[end]) { 
             int new_Start = end+1;//use for get new start value
             end = end + (end - start + 1)*2;
             start = new_Start;
         }
         return binarySearch(arr, target, start, end);
    }
      int binarySearch(int[] arr,int target,int start,int end){
      int mid;

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
class p1 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10,11,13,14,15,30,34,35,37,};
        int target = 30;
        findPosition obj = new findPosition();
        int ans=obj.findRange(arr, target);
        System.out.println(ans);
    }
}
