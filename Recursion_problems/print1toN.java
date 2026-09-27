public class p1{
   static void print(int n,int stop){
    if(n == stop){
       System.out.println(n);
      return;
    }
    System.out.println(n);
    print(n+1,stop);
    }
   public static void main(String[] args) {
       print(1,5); 
   }
}
