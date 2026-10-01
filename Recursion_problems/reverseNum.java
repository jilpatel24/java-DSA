public class p1 {
    static int rev(int num){
        if(num == 0){
            return 0;
        }
        int ans= num %10;
        System.out.print(ans);
        return rev(num/10);
    }
    public static void main(String[] args) {
        rev(1234);
    }
}
