class Solution {
    public boolean isValid(String x) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='{' || x.charAt(i)=='(' || x.charAt(i)=='['){
                st.push(x.charAt(i));
            }
            else{
                if(st.empty()){
                    return false;
                }
                if(x.charAt(i)==']' && st.peek()=='['){
                    st.pop();
                }
                else if(x.charAt(i)=='}' && st.peek()=='{'){
                    st.pop();
                }
                else if(x.charAt(i)==')' && st.peek()=='('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.empty()){
            return true;
        }
        return false;
    }
}