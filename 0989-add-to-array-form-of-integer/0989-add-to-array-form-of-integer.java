class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry=0;
        for(int i=num.length-1;i>=0;i--){
            int temp=(num[i]+carry)+k%10;
            carry=temp/10;
            temp=temp%10;
            num[i]=temp;
            k=k/10;
        }

        Stack<Integer> st=new Stack<>();
        while(carry!=0||k>0){
            int digit=k%10+carry;
            carry=digit/10;
            carry=carry%10;
            st.push(digit%10);
            k=k/10;
        }

        List<Integer> list=new ArrayList<>();
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        
        for(int i:num){
            list.add(i);
        }
        
        return list;
        
        
    }
}