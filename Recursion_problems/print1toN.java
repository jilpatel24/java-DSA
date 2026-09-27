//1st way
public class p1{
   static void print(int n,int stop){
    if(n > stop){
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
//2nd way
//we just printing number after recursive function is done their work
public class p1{
   static void print(int n){
    if(n == 0){;
      return;
    }
    print(n-1);
   System.out.println(n);
    }
   public static void main(String[] args) {
       print(5); 
   }
}
