class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack=new Stack<>();
        int n=heights.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n+1;i++){
            int element=(i==n)?0:heights[i];
            while(!stack.isEmpty() && heights[stack.peek()]>element){
                int h=heights[stack.pop()];
                int ps=(stack.isEmpty())?-1:stack.peek();
                int w=i-ps-1;
                max=Math.max(max,h*w);
            }
            stack.push(i);
        }
        return (max==Integer.MIN_VALUE)?0:max;

    //(2 approch) this beats 10.43% and runtime 112ms
        // int[] ps=findPriviousSmaller(heights);
        // int[] ns=findNextSmaller(heights);

        // int max=0;
        // for(int i=0;i<heights.length;i++){
        //     int heigth=heights[i];
        //     int width=ns[i]-ps[i]-1;
        //     int area=heigth*width;
        //     if(max<area){
        //         max=area;
        //     }
        // }
        // return max;


    //(1. approch)this is brute force approch n square time complexity and time limit eceeded
        // int n=heights.length;
        // int max=0;
        // for(int i=0;i<n;i++){
        //     int val=heights[i];
        //     int presmaller=i-1;
        //     int nextsmaller=i+1;
        //     while(presmaller>=0 && heights[presmaller]>=val){
        //         presmaller--;
        //     }
        //     while(nextsmaller<n && heights[nextsmaller]>=val){
        //         nextsmaller++;
        //     }
        //     int area=val*(nextsmaller-presmaller-1);
        //     if(max<area){
        //         max=area;
        //     }

        // }
        // return max;
        
    }
    //(2 approch, funtion)
    // public static int[] findNextSmaller(int[] arr){
    //     Stack<Integer> stack=new Stack<>();
    //     int n=arr.length;
    //     int[] a=new int[n];
    //     for(int i=n-1;i>=0;i--){
    //         int val=arr[i];
    //         while(!stack.isEmpty() && val<=arr[stack.peek()]){
    //             stack.pop();
    //         }
    //         if(stack.isEmpty()){
    //             a[i]=n;
    //         }
    //         else{
    //             a[i]=stack.peek();
    //         }
    //         stack.push(i);
    //     }
    //     return a;
    // }

    //(2 approch, funtion)
    // public static int[] findPriviousSmaller(int[] arr){
    //     Stack<Integer> stack=new Stack<>();
    //     int n=arr.length;
    //     int[] a=new int[n];
    //     for(int i=0;i<n;i++){
    //         while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]){
    //             stack.pop();
    //         }
    //         if(stack.isEmpty()){
    //             a[i]=-1;
    //         }
    //         else{
    //             a[i]=stack.peek();
    //         }
    //         stack.push(i);
    //     }
    //     return a;
    // }
    
}