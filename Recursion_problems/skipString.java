public class p1{
    static String skipApple(String str) {
       if(str.isEmpty()){
       
        return str;
       }
     if(str.startsWith("apple")){
       return skipApple(str.substring(5));
     }
     return str.charAt(0) + skipApple(str.substring(1));
     }
   public static void main(String[] args) {
    System.out.println(skipApple("bjkapplekj"));
      
   }

    
}
