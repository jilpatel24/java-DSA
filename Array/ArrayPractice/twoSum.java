import java.util.Arrays;
class p1{
   public static void main(String[] args) {
        int arr1[]={3,3};
        int Target=6;
        p1 obj = new p1();
        int[] ans = obj.ceiling(arr1, Target);
      //   System.out.println(ans[0] +""+ans[1]);//in int[] ans we have two argument ans[0]=arr1,ans[1]=target
       System.out.println(Arrays.toString(ans)); 
   }
   int[] ceiling(int[] arr,int target){
   
      for (int i = 0; i < arr.length; i++) {
          for (int j = i+1; j < arr.length; j++) {
            
            
              if(arr[i]+arr[j] == target){
                return new int[]{i,j}; 
              }
          }
      }
      
  return new int[]{-1,-1};  //for not found  
 }
}      
    
