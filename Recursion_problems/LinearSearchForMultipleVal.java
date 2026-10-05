import java.util.ArrayList;

public class p1{
    static ArrayList search(int[] arr,int target) {
      int i=0; 
      return helper(arr, i,target);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList helper(int[] arr,int i,int target){
      if(i > arr.length-1){
         return list;
      }
       if(arr[i] == target){
         list.add(i);
       }
      return helper(arr,i+1,target);
    //  return list;
    }
    
   public static void main(String[] args) {
      int[] arr={1,4,4,4,4,5,12};
     
       System.out.println("Array Index is : "+search(arr,4)); 
       System.out.println(list);
   }
}
