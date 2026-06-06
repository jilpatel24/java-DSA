class obj{
    void method(){
    int num=4;
     for (int i = 0; i <num; i++) {
       
        for (int j = 0; j<num; j++) {
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
