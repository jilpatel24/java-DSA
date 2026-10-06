// *
// * * 
// * * *
// * * * *
public class p1{
    static void print(int row,int column) {
      if(row == 0){
        return;
      }
      if(row > column){
        print(row,column+1);
        System.out.print(" * ");
      }else{
        print(row-1,0);
        System.out.println();
      }

       
    }
    
   public static void main(String[] args) {
      int[] arr={7,9,12,3,4,5};
      print(4,0); 
   }
}
