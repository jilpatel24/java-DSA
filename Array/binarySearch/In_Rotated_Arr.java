class Solution {
    public int search(int[] nums, int target) {
      
        int pivot=Find_pivot(nums);
        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }else if (target >= nums[pivot]) {
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1,nums.length-1);
        }
     int binarySearch(int[] arr,int target,int start,int end){
      int mid=0;

      while(start <= end){
         mid = start + (end-start)/2;

         if(target > arr[mid]){
          start = mid+1;
         }
         else if(target < arr[mid]){
            end = mid-1;
         }
         else {
           return mid; 
         }
