class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<command.length(); i++) {
            char ch = command.charAt(i);
            if(ch == '(' && command.charAt(i+1) == ')') {
                str.append('o');
                i += 1;
            } else if(ch == '(' && command.charAt(i+1) == 'a') {
                str.append('a');
                str.append('l');
                i += 2;
            } else if(ch == 'G') {
                str.append('G');
            }
        }

        return str.toString();
    }
}