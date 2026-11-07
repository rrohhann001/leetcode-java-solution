class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        //1
        // int n=nums.length;
        // int[] diff=new int[n];
        // for(int i=0;i<n;i++){
        //     Set<Integer> prefix=new HashSet<>();
        //     for(int j=0;j<=i;j++){
        //         prefix.add(nums[j]);
        //     }
        //     Set<Integer> suffix=new HashSet<>();
        //     for(int j=i+1;j<n;j++){
        //         suffix.add(nums[j]);
        //     }

        //     diff[i]=prefix.size()-suffix.size();
        // }
        // return diff;

        //2 thoda ish se fast
        // int n=nums.length;
        // int[] diff=new int[n];
        // Set<Integer> prefix=new HashSet<>();
        // for(int i=0;i<n;i++){
        //     prefix.add(nums[i]);
        //     Set<Integer> suffix=new HashSet<>();
        //     for(int j=i+1;j<n;j++){
        //         suffix.add(nums[j]);
        //     }

        //     diff[i]=prefix.size()-suffix.size();
        // }
        // return diff;


        //3 second vale se jyada fast
        int n=nums.length;
        Set<Integer> prefix=new HashSet<>();
        Set<Integer> suffix=new HashSet<>();

        int[] prefixStore=new int[n];

        for(int i=0;i<n;i++){
            prefix.add(nums[i]);
            prefixStore[i]=prefix.size();
        }

        for(int i=n-1;i>=0;i--){
            int num=nums[i];
            nums[i]=prefixStore[i]-suffix.size();
            suffix.add(num);
        }
        return nums;

        //vese ye logic mujhe jyada khass samajh nahi aaye and na hi ye mere logic hai

        
        
    }
}