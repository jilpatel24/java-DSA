
class obj{
    void method(){
    int num=4;
     for (int i = 0; i <num; i++) {
       
        for (int j = 0; j<i+1; j++) {
            System.out.print(j+1);
            
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
