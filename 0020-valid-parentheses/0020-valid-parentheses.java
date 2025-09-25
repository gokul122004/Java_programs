class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for( char c : s.toCharArray()) {
            if(c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) return false;

                char temp = stack.pop();
                if(c == ')' && temp != '(') return false; 
                if(c == '}' && temp != '{') return false; 
                if(c == ']' && temp != '[') return false; 
            }
        }

        return stack.isEmpty();
    }
}