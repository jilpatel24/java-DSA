public class p1{
   static int print(int n){
    if(n == 1){
      return 1;
    }
    return print(n-1)*n;
    }
   public static void main(String[] args) {
       System.out.println(print(5)); 
   }
}
