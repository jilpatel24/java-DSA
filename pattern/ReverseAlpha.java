
class obj{
    void method(){
     for (char i = 'A'; i <='D'; i++) {
       
        for (char j = i; j>='A'; j--) {
            System.out.print(j);
            
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
