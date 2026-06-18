class ceiling{
   int ceiling(int[] arr,int target){
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
     
      return arr[start]; 
   }
}
class p1{
       public static void main(String[] args) {
        int arr1[]={-2,5,7,8,12,18,35,48};
        int Target=24;
        ceiling obj = new ceiling();
        int ans = obj.ceiling(arr1, Target);
        System.out.println(ans);
    }
}
