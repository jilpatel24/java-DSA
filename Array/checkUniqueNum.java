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
        //check for unique number
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        if(count == 1){
            System.out.println("Unique Number is : "+arr[i]);
        }
        }
      
}
}
public class p1{
     public static void main(String[] args) {
    array obj=new array();
    obj.getVal();
}
}

 // obj.print();
  
  
