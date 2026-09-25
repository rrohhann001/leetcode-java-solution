class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int positive=nums.length/2;

        int size=nums.length;
        int[] arr=new int[size];
        int positive=0;
        int nagative=1;
        int i=0;
        while(i<size){
            int num=nums[i];
            if(num<0){
                arr[nagative]=nums[i];
                nagative+=2;
            }
            else{
                arr[positive]=nums[i];
                positive+=2;
            }
            i++;

        }

        return arr;
        
        
    }
}