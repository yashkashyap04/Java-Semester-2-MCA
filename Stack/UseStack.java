public class UseStack {
    public static void main(String[] args) {
        String s = "(){}{[]}";

        System.out.println(checkParenthesis(s));
    }

    static boolean checkParenthesis(String s){
        Stack st = new Stack();

        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            else if(!st.checkStack()){
                if(c==')'){
                    if(st.peek()=='(')
                        st.pop();
                    else
                        return false;
                }
                else if(c==']'){
                    if(st.peek()=='[')
                         st.pop();
                    else
                        return false;
                }
                else if(c=='}'){
                    if(st.peek()=='{')
                        st.pop();
                    else
                        return false;
                }
            }
            else {
                return false;
            }
        }

        return st.checkStack();
    }

}