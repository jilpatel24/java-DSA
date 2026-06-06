
class obj{
    void method(){
    int num=6;
     for (int i = 0; i <num; i++) {
       
        for (int j = 0; j<num; j++) {
          
        if(i == 0 || i == num-1 || j == 0 || j == num-1){
            System.out.print(" *");
        }else
         System.out.print("  ");
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
