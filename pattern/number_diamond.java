public class p1{
  public static void main(String[] args){
    
     int n=5;
   for(int i = 1;i <=n;i++){
     //upper part
      // space
      for(int j = 1;j<= 5-i;j++){
       System.out.print(" ");
      }//decreasing
       for (int j = i; j >= 1; j--) {
           System.out.print(j);
       }//for increasing
       for (int j = 2; j <= i ;j++){
       System.out.print(j);
    }
   System.out.println();
}
//lower part
 for(int i = 4;i > 0;i--){
      //space
      for(int j = 1;j <= 4-i+1;j++){
       System.out.print(" ");
      }//decreasing
       for (int j = i; j > 0; j--) {
           System.out.print(j);
       }//for increasing
       for (int j = 2; j <= i ;j++){
       System.out.print((j));
    }
   System.out.println();
}
  }
}
 
