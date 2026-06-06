
class obj{
    void method(){
    int num=5;
    
     for (int i = 0; i < num; i++) {
       
        System.out.print("*");
        if(i != 0){
             for (int j = 0;j < i-1; j++) {
            System.out.print("*");
        }
            System.out.print("*");
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
