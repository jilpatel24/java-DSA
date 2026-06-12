import java.util.Scanner;
class array{
    Scanner sc=new Scanner(System.in);
   
    int n;
    //for get user input
    void getVal(){
        System.out.println("Enter size of array");
         n = sc.nextInt();
        int arr[]=new int[n];
       //for getting user defined value
        System.out.println("Enter value for array :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Size of Array :"+n);
        //for print array value
       
        int product=1;
        //sum of all array element
        for(int i=0;i<arr.length;i++){
            product *= arr[i];
        }
        System.out.println("Mul is : "+product);
}
}
public class p1{
     public static void main(String[] args) {
    array obj=new array();
    obj.getVal();
}
}

 // obj.print();
  
  
