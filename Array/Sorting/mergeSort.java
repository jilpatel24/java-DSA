import java.util.Arrays;
public class p1{
    static int[] MergeSort(int[] arr) {
       if(arr.length == 1){
       return arr;
    }
    int mid = arr.length/2;
    int[] left = MergeSort(Arrays.copyOfRange(arr, 0, mid));//copy specified range of elements in array
    int[] right = MergeSort(Arrays.copyOfRange(arr, mid,arr.length));

    return merge(left,right);
    }
   public static void main(String[] args) {
      int[] arr={7,1,2,9,12,3,4,5};
       arr = MergeSort(arr);
      System.out.println("reverse : "+Arrays.toString(arr));
      
   }

    private static int[] merge(int[] left, int[] right) {
       int[] merge = new int[left.length+right.length];
       int i=0,j=0,k=0;

       while(i<left.length && j<right.length){
         if(left[i] < right[j]){
            merge[k]=left[i];
            i++;
         }else{
            merge[k]=right[j];
            j++;
         }
         k++;
       }
        while(i<left.length){
         merge[k]=left[i];
         i++;
         k++;
        }
        while(j<right.length){
         merge[k]=right[j];
         j++;
         k++;
        }
  return merge;
    }
}
