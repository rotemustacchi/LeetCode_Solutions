class Solution {
    public int removeElement(int[] nums, int val) {
        int k=nums.length;
        int curr=0;
        int last=0;
        if(k==0)
            return k;
        for(int i =0; i<nums.length;i++){
            if(nums[i]==val){
                k--;
                nums[i]=-1;
            }
        }
        if(k==0)
            return k;
        for(int i =0; i<nums.length;i++){
            if(nums[i]!=-1){
                nums[last]=nums[curr];
                curr++;
                last++;
            }
            else{
                curr++;
            }
        }
        return k;
        }
    }
