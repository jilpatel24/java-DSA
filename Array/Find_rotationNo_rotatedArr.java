public class p2{
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int rotation = countRotation(arr);
        System.out.println("Rotation : "+rotation);
        
    }
    private static int countRotation(int[] arr){
        int pivot = findPivot(arr);
        if(pivot == -1){
            System.out.println("Array is not rotated");
        }
        return pivot+1;
    }
    static int findPivot(int[] arr){
       int start=0;
       int end=arr.length-1;
       int mid=0;
       int pivot=0;
       while(start <= end){
         mid = start + (end-start)/2;
         if(mid < end  && arr[mid] > arr[mid+1]){
            pivot = mid; 
            return pivot;
         }
         else if (mid > start && arr[mid] < arr[mid-1]) {
            pivot = mid-1;
            return pivot; 
         }else if(arr[start] >= arr[mid])//or arr[mid] <= arr[start]
        {
            end = mid-1;
        }else{
            start = mid+1;
        }
    }  
    return -1;      
    }
       }
