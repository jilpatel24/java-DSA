public class p1{
    static void skipA(String p,String str) {
       if(str.isEmpty()){
        System.out.println("Ans : "+p);
        return;
       }
      char ch = str.charAt(0);
      if(ch == 'a'){
        skipA(p, str.substring(1));
      }else{
        skipA(p + ch , str.substring(1));
      }
    }
   public static void main(String[] args) {
    skipA(" ", "baccad");
      
   }

    
}
