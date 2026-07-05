import java.util.Arrays;
public class p1{
public static void main(String[] args) {
    int[] arr = {8,3,2,5,4,7,1,6};
    cyclic_sort(arr);
   System.out.println(Arrays.toString(arr));
}
 public static void cyclic_sort(int[] arr){
    
    int i = 0;
    while(i < arr.length ){
       int index = arr[i] - 1;
       if(index >= 0 && index < arr.length){//index value must be into the array.length

       if(arr[i] != arr[index]){
        swap(arr, i, index);
       }else{
        i++;
       }
      }else{
        i++;
      }  
 }
 }
 static void swap(int arr[],int first,int second){
   int temp = arr[first];
   arr[first] = arr[second];
   arr[second] = temp ;
 }
}

 

      
