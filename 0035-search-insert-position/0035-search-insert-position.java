class Solution {
    public int searchInsert(int[] nums, int target) {
        int last=nums.length-1;
        int first=0;
        int middle=(first+last)/2;
        if(last==-1)
            return 0;
        if(nums[0]>target)
            return 0;
        if(nums[last]<target)
            return last+1;
        while(first<last){
            if(nums[middle]==target)
                return middle;
            if(nums[middle]<target){
                first=middle+1;
                middle=(first+last)/2;
            }
            else{
                last=middle;
                middle=(first+last)/2;
            }
        }
        return first;
    }
}