public class p1{
  public static void main(String[] args) {
    int arr1[] ={1,22,13,74,5};
    int arr2[] ={6,21,4,12};

    //for merging
    int new_arr[] = new int[arr1.length + arr2.length];
    for (int i = 0; i < arr1.length; i++) {
        new_arr[i] = arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
        new_arr[arr1.length +i] = arr2[i];
    }
    boolean swap;
    for (int i = 0; i < new_arr.length; i++) {
       for (int j = 1; j < new_arr.length; j++) {
           if(new_arr[j] < new_arr[j-1]){
            int temp = new_arr[j];
            new_arr[j] = new_arr[j-1];
            new_arr[j-1] = temp;
           }
       } 
    }
    System.out.println("Sorted array : ");
    for (int i = 0; i < new_arr.length; i++) {
        System.out.println(new_arr[i]);
    }
  }
 }

