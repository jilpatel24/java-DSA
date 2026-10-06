// * * * *
// * * *
// * *
// *
public class p1{
    static void print(int row,int column) {
      if(row == 0){
        return;
      }
      if(row > column){
        System.out.print(" * ");
        print(row,column+1);
      }else{
        System.out.println();
        print(row-1,0);
      }
    }
    
   public static void main(String[] args) {
      print(4,0); 
   }
}
