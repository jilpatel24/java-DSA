
class obj{
    void method(){
    int num=4;
    
     for (int i = 0; i < num; i++) {
        // for space
        for (int j = 0; j <num-i-1; j++) {
            System.out.print(" ");
        }
        System.out.print("*");
        if(i != 0){
             for (int j = 0;j < 2*i-1; j++) {
            System.out.print("*");
        }// in this loop will start from i=1 ;2*i-1=2*1-1=1 so,inner loop j iterate from 0 to 1 it create ** nd also we print #after the if ,so it become 1 extra ex. **#
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
