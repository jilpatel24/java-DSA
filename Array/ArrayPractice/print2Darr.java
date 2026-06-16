import java.util.Arrays;
import java.util.Scanner;
class p1{
    Scanner sc=new Scanner(System.in);
     int arr[][] = new int [3][2];
        void printArr(){
           //iterate for each rows
           System.out.println("Enter Number for Array :");
           for (int i = 0; i < 3; i++) {
            //iterate for each column
               for (int j = 0; j < arr[i].length; j++) {
                   arr[i][j] = sc.nextInt();
               }
           }
          
           //for printing 2D array
            System.out.println("2D Array : ");
           for(int a[]:arr){
            System.out.println(Arrays.toString(a));
           }
          
           
        }
    public static void main(String[] args) {
        p1 obj = new p1();
        obj.printArr();
    }
}
  
