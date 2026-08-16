class Solution {
    public int[] sortArray(int[] nums) {
        margeSort(nums,0,nums.length-1);

        return nums;
        
    }

    private void margeSort(int[] nums,int lb, int ub){
        
        if(lb<ub){
            int mid=lb+(ub-lb)/2;
            margeSort(nums,lb,mid);
            margeSort(nums,mid+1,ub);
            marge(nums,lb,ub,mid);

        }
    }

    private void marge(int[] nums, int lb, int ub,int mid){
        int n1=mid-lb+1;
        int n2=ub-mid;

        int[] arr1=new int[n1];
        int[] arr2=new int[n2];

        //copy elements of nums into arr1 and arr2 
        for(int i=0;i<n1;i++){
            arr1[i]=nums[lb+i];
        }
        for(int i=0;i<n2;i++){
            arr2[i]=nums[mid+1+i];
        }

        //apply two pointer
        int i=0;
        int j=0;
        int k=lb;

        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                nums[k]=arr1[i];
                i++;
            }
            else{
                nums[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            nums[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            nums[k]=arr2[j];
            j++;
            k++;
        }
    }
}