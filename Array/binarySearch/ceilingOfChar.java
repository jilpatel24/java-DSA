class ceiling{
   char ceiling(char[] arr,char target){
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
         // else {
         //   return mid; 
         // }
        
      }
     
      return arr[start]; 
   }
}
class p1{
       public static void main(String[] args) {
        char arr1[]={'a','d','e','g','i'};
        char Target='c';
        ceiling obj = new ceiling();
        char ans = obj.ceiling(arr1, Target);
        System.out.println(ans);
    }
}
