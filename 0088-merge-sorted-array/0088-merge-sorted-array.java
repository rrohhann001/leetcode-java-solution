class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }

      //this is my first approch and after submission i seen best approch then i aply 

      // int i=0;
      // int j=0;
      // int count=0;

      // while(i<nums1.length &&j<n){

      //     if(i>=m+count && nums1[i]==0){
      //         nums1[i]=nums2[j];
      //         i++;
      //         j++;
      //     }
      //     else if(nums1[i]<nums2[j]){
      //         i++;
      //     }

      //     else{
      //         for(int k=m+j-1;k>=i;k--){
      //             nums1[k+1]=nums1[k];
      //         }
      //         nums1[i]=nums2[j];
      //         i++;
      //         j++;
      //         count++;
      //     }
      // }
        
    }
}