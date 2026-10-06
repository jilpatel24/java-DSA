public class p1{
    static boolean  SortOrNot(int[] arr) {
      int i=0; 
      return helper(arr, i);
    }
    static boolean helper(int[] arr,int i){
      if(i >= arr.length -1){
         return true;
      }
      if(arr[i] > arr[i+1]){
       return false;
      }
      return helper(arr,i+1);
    }
    
   public static void main(String[] args) {
      int[] arr={1,2,4,5,12};
     
       System.out.println("Array is sorted : "+SortOrNot(arr)); 
   }
}
