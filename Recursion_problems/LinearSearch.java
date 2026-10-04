public class p1{
    static int search(int[] arr,int target) {
      int i=0; 
      return helper(arr, i,target);
    }
    static int helper(int[] arr,int i,int target){
      if(i > arr.length-1){
         return 0;
      }
       if(arr[i] == target){
         return i;
       }
      return helper(arr,i+1,target);
    }
    
   public static void main(String[] args) {
      int[] arr={1,2,4,5,12};
     
       System.out.println("Array Index is : "+search(arr,12)); 
   }
}
