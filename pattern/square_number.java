public class p1{
  public static void main(String[] args){
    
     int og_n = 4;
     int  n=2*og_n-1;
      
   for(int i = 0;i < n;i++){
      
      for(int j = 0;j < n;j++){
     //for index value
     int index_val = og_n - Math.min(Math.min(i, j),Math.min(n-1-i,n-1-j));
      System.out.print(index_val+"  ");
      }
   System.out.println("");
}
  }
}
 
