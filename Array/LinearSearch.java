class array{
    
    int arr[]={1,23,3,14,5,16,7,8}; 
    void findNum(){
    
    int target=16;
    System.out.println("Target element is : "+target);
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == target){
        System.out.println("Index : "+i);
        }
    }
}
}
public class p1{
     public static void main(String[] args) {
    array obj=new array();
    obj.findNum();
}
}
  
