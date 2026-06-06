
class obj{
    void method(){
    int num=4;
    
     for (int i = num; i >0; i--) {
        
        for (int j = 0; j<i; j++) {
            System.out.print(" *");
        }
         System.out.println();
     }
    }
}
public class p1{
    public static void main(String[] args) {
    obj ob=new obj();
    ob.method();
    }
}
