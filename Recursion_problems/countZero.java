public class p1{

    static int countZero(int n,int count){
      //count is initially 0
      //base condition
      if(n == 0){
        return count;
      }
      if(n % 10 == 0){
        count++;
      }
      
      return  countZero(n /= 10 , count);
    }

    
   public static void main(String[] args) {
    int n=1210067;
       System.out.println("total Zero : "+countZero(n,0)); 
   }
}
