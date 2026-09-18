
import java.util.Arrays;

public class p1{
   public static void main(String[] args) {
      int[] arr = {12,34,23,10,5,3,2,};
      System.out.println(Arrays.toString(arr));
      for(int i=1;i<arr.length;i++){
         int current = arr[i];
         int prev = i-1;

         while (prev >= 0 && arr[prev] > current) { 
             arr[prev+1] = arr[prev];   
             prev--;                                                                                
         }
         arr[prev+1]=current;
      }
      System.out.println(Arrays.toString(arr));
   
   }
}
