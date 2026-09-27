public class p1{
   static int search(int[] arr,int target,int start,int end){
      int mid = start + (end-start)/2;
      if(start > end){
         return -1;
      }
      if(arr[mid] == target){
         return mid;
      }
      if(arr[mid] > target){
         return search(arr, target, start, mid-1);
      }
      if(arr[mid] < target){
       return search(arr, target, mid+1, end);
      }
      return -1;
    }
   public static void main(String[] args) {
      int[] arr = {12,23,27,28,30,32};
      System.out.println(search(arr, 30, 0, arr.length-1));
   }
}
