class Solution {
    public int findDuplicate(int[] nums) {
        //this is 28% and runtime 22ms. but this is not valid answer because this takes O(n) apace that does not follows the constraints(rules)
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         return nums[i];
        //     }
        //     map.put(nums[i],nums[i]);
            
        // }
        // return 0;


        //this is 94% and runtime 3ms. but this is not valid answer because this modify the array that does not follows the constraints(rules)
        // int i=nums[0];
        // while(nums[i]>0){
        //     int temp=nums[i];
        //     nums[i]=-nums[i];
        //     i=temp;
        // }
        // return i;


        // this is the best approch that follows constraints
        //floyed cycle detection(FCD) approch , means same as find starting cycle point in linked list 


        //detect the common node
        int slow=0;
        int fast=0;
        // int n=nums.length;
        // while(fast!=n+1 && nums[fast]!=n+1){  ye bhi theek hai lekin
        //     slow=nums[slow];
        //     fast=nums[nums[fast]];
        //     if(slow==fast){
        //         break;
        //     }
        // }

        // ye jyada best hai 
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        

        // lets find the start of the linked list
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
        
    }
}