
import java.util.Arrays;

class p1{
   static int[] pairSum(int[] arr,int target){
     int i = 0;
     int j = arr.length-1;
     int pairSum = 0;

    while(i <= j){
      pairSum = arr[i]+arr[j];
      if (pairSum == target) {
          return new int[]{i,j};
      }else if(pairSum < target){
        i++;
      }else{
       j--;
    }
   }
    return new int[]{-1,-1};
   }
    public static void main(String[] args) {
     int[] arr = {2,7,11,15};
     int target = 26;

    int[] result = pairSum(arr, target);
    System.out.println(Arrays.toString(result));
   
        
    }
}
