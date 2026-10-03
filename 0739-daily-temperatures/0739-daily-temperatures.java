class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        //ish mai hum forwarded chech kar rahe hai
        Stack<Integer> stack=new Stack<>();
        int[] day=new int[temperatures.length];
        stack.push(0);
        for(int i=1;i<temperatures.length;i++){
            int curr=temperatures[i];
            while(!stack.isEmpty()){
                int preIndex=stack.peek();
                int pre=temperatures[preIndex];
                if(pre<curr){
                    day[preIndex]=i-preIndex;
                    stack.pop();
                }
                else{
                    break;
                }
            }
            stack.push(i);
        }
        return day;



        //ye quetion next greates jesa hai same 

        //And ish mai hum backword chal rahe hai check karte hue
        //this beats 28.04% and 76ms runtime
        // int n=temperatures.length;
        // int day[] = new int[n];
        // Stack<Integer> stack = new Stack<>();

        // for(int i=n-1;i>=0;i--){
        //     int tempr=temperatures[i];
        //     while(!stack.isEmpty() && tempr>=temperatures[stack.peek()] ){
        //         stack.pop();
        //     }
        //     if(!stack.isEmpty()){
        //         day[i]=stack.peek()-i;
        //     }
        //     stack.push(i);
        // }
        // return day;


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