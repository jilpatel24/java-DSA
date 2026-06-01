
class obj{
    void method(){
    int num=4;
    int n=1;
     for (int i = 0; i < num; i++) {
        // for space
        for (int j = 0; j <num-i-1; j++) {
            System.out.print(" ");
        }
        System.out.print("*");
        if(i != 0){
             for (int j = 0;j < 2*i-1; j++) {
            System.out.print(" ");
        }
            System.out.print("*");
        }
         System.out.println();
     }
//bottom side
    for (int i = num-1; i >=1; i--) {
        //for space
        for (int j = 0; j < num-i; j++) {
            System.out.print(" ");
        }
        System.out.print("*");
        if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
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