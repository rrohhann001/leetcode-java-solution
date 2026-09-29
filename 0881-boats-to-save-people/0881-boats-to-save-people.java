class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats=0;
        int l=0;
        int r=people.length-1;
        // margeSort(people,l,r);
        Arrays.sort(people);

        while(l<=r){
            if((people[l]+people[r])<=limit){
                l++;
            }
            boats++;
            r--;
        }
        return boats;
        
    }


    // private void marge(int[] arr, int l,int mid, int r){
    //     int n1=mid-l+1;
    //     int n2=r-mid;

    //     int[] arr1=new int[n1];
    //     int[] arr2=new int[n2];
    //     for(int i=0;i<n1;i++){
    //         arr1[i]=arr[l+i];
    //     }
    //     for(int i=0;i<n2;i++){
    //         arr2[i]=arr[mid+1+i];
    //     }

    //     int i=0,j=0,k=l;
    //     while(i<n1 && j<n2){
    //         if(arr1[i]<=arr2[j]){
    //             arr[k]=arr1[i];
    //             i++;
    //         }
    //         else{
    //             arr[k]=arr2[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     while(i<n1){
    //         arr[k]=arr1[i];
    //         i++;
    //         k++;
    //     }
    //     while(j<n2){
    //         arr[k]=arr2[j];
    //         j++;
    //         k++;
    //     }
    // }

    
    // private void margeSort(int[] arr, int l, int r){
    //     if(l>=r){
    //         return;
    //     }
    //     int mid=l+(r-l)/2;
    //     margeSort(arr,l,mid);
    //     margeSort(arr,mid+1,r);
    //     marge(arr,l,mid,r);
    // }
    
}