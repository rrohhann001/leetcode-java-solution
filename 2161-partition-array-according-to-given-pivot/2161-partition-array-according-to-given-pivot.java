class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int size=nums.length;
        int[] arr=new int[size];
        int i=0;
        int k=0;
        int countPivot=0;
        while(i<size){
            int num=nums[i];
            if(num<pivot){
                arr[k]=num;
                k++;
            }
            else if(pivot==num){
                countPivot++;
            }
            i++;
        }

        while(countPivot>0){
            arr[k]=pivot;
            k++;
            countPivot--;
        }

        i=0;
        while(i<size){
            int num=nums[i];
            if(num>pivot){
                arr[k]=num;
                k++;
            }
            i++;
        }

        return arr;
        
    }
}