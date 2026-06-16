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
        
       //find maximum
        int max=0;
         int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max=arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("B4 Max :"+max); 
        System.out.println("B4 Min :"+min); 
         int temp=0;
            temp=max;
            max=min;
            min=temp;
        //before swapping
        System.out.println("Max :"+max); 
        System.out.println("Min :"+min); 
        //after swapping
}
}
public class p1{
     public static void main(String[] args) {
    array obj=new array();
    obj.getVal();
}
}

 // obj.print();
  
  
