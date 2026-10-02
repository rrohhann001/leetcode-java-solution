class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //ye quetion next greates jesa hai same 
        int n=temperatures.length;
        int day[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1;i>=0;i--){
            int tempr=temperatures[i];
            while(!stack.isEmpty() && tempr>=temperatures[stack.peek()] ){
                stack.pop();
            }
            if(stack.isEmpty()){
                day[i]=0;
            }
            else{
                day[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return day;


        //ye solution to theek hai lekin ye n sqare time lega jis se time limit exceed hogi
        // int[] day=new int[temperatures.length];
        // int i=0;
        // while(i<temperatures.length-1){
        //     int j=i+1;
        //     while(j<temperatures.length && temperatures[i]>=temperatures[j]){
        //         j++;
        //     }
        //     if(j!=temperatures.length){
        //         day[i]=j-i;
        //     }
        //     i++;

        // }

        // return day;


        
    }
}