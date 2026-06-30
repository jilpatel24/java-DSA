import java.util.Arrays;
public class p1{
public static void main(String[] args) {
    int[][] arr = {
                   {2,7,9,10},                  
                   {12,15,18,17},
                   {37,38,39,40},
                   {42,43,49,54}
                    };
    int target=9;
    int[] ans = Search(arr, target);
    System.out.println(Arrays.toString(ans));

}

//for eliminating rows (also column is used)
 public static int[] Search(int[][] arr, int target) {
      int row = 0;
      int col = arr.length-1;

      while(row < arr.length && col > 0){
        if (arr[row][col] == target) {
            return new int[]{row,col};
        }else if(target < arr[row][col]){
           col--;
        }else{
          row++;
        }

   }
   return new int[]{-1,-1};
  }

 }

      
