class array{
    
    int arr[]={1,23,3,14,5,16,7,8}; 
   
    void revArr(){
       int start = 0;
       int end = arr.length-1;
       int temp=0;
       System.out.println("Original array :");
       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
    //swapping array index
      while(start < end){
        temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;
        start++;
        end--;
      }
      //print reverse array
      System.out.println("After Reversing : ");
      for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
      }
      //for verify
      System.out.println("First Index : "+arr[0]);
}
}
public class p1{
     public static void main(String[] args) {
    array obj=new array();
    obj.revArr();
}
}
  
