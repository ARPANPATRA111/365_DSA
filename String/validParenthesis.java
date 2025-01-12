/*LeetCode link:- https://leetcode.com/problems/valid-parentheses/ */

class validParenthesis {
    public static boolean isValid(String s) {
        char[]stack=new char[s.length()];
        int top=0;
        for(char c: s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack[top]=c;
                top++;
            }
            else{
                if(top==0)return false;
                top--;
                char open=stack[top];
                if((c==')'&&open!='(')||
                (c=='}'&&open!='{')||
                (c==']'&&open!='[')){
                    return false;
                }
            }
        }
        return top==0;
    }
    public static void main(String[] args) {
        String s="(){}[]{}(){}[]{}(){}";
        System.out.println(isValid(s));
    }
}