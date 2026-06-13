class array{
    //for get user input
    void getVal(){
       int arr1[]={1,2,3,5,6};
       int arr2[]={3,7,8,5,1};
        //Intersection : return common elements in both element
        
        for (int i = 0; i < arr1.length; i++) {
    
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                
            System.out.println("Interception : "+arr1[i]);
        }
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
  
  
