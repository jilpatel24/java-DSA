public class p1{
  public static void main(String[] args){
    //  1
   //  212
  //  32123
 //  4321234
//  543212345
     int n=5;
   for(int i = 0;i <n;i++){
      //for total space
      for(int j = 5;j>i;j--){
       System.out.print(" ");
      }//1st element part
       for (int j = i+1; j > 0; j--) {
           System.out.print(j);
       }//for second element part
       for (int j = 1; j <= i ;j++){
       System.out.print(j+1);
    }
    

   System.out.println();
}
}
}
