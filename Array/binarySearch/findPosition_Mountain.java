  //findRange() for finding the range of array
class findPosition{
     
      int findPosition(int[] arr){
      int mid;
      int start=0;
      int end=arr.length-1;

      while(start < end){
         mid = start + (end-start)/2;

         if(arr[mid] > arr[mid + 1]){
           end = mid;
         }
         else{
            start = mid + 1;
         }
      }
     System.out.println("max : "+arr[start] +" Index :"+start);
      return 0; 
   }
}
public class p1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2,0};
        // int target = 30;
        findPosition obj = new findPosition();
         obj.findPosition(arr);
        
    }
}
