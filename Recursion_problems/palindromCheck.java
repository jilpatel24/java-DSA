public class p1{
   static int rev(int n){
     int digit = (int)(Math.log10(n)+1);
     return helper(n,digit-1);
    }
    static int helper(int n,int power){//pow is use for total digits like 1234 there is 4 digit
      if(n % 10 == n){
        // System.out.print(n);
        return n;
      }
      int rem = n % 10;
      int ans = rem *(int)(Math.pow(10,power));
      // System.out.print(ans);
      return ans + helper(n /= 10 , power-1);
    }

    static boolean palindromeCheck(int n){
       return  n == rev(n);
    }
   public static void main(String[] args) {
    int n=121;
       System.out.println("reverse : "+rev(n)); 
       System.out.println(palindromeCheck(n));
   }
}
