public class p1 {
    static int rev(int num){
       int digit = (int)(Math.log10(num)+1);
    //    System.out.print(num % 10);
       return helper(num,digit);
    }
    static int helper(int n,int digit){
        if(n % 10 == n){
            return n;
        }
        digit = n-1;
        int rem = n % 10;
        int ans = rem * 10^digit;
       
        n /= 10;
        System.out.print(n%10);
        return helper(n, digit-1);
        
    }
    public static void main(String[] args) {
        rev(123467);
    }
}
