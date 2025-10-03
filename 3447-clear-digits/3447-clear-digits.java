class Solution {
    public String clearDigits(String s) {
        if(isDigit(s) == -1) {
            return s;
        }

        return removeDigit(s);
    }

    public static int isDigit(String s) {
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                return i;
            }
        }

        return -1;
    }

    public static String removeDigit(String s) {
        StringBuilder str = new StringBuilder(s);
        int digit = isDigit(s);

        if(digit == -1) {
            return s;
        }

        for(int i=digit - 1; i>=0; i--) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                str.deleteCharAt(digit);
                str.deleteCharAt(i);
                break;
            }
        }
        
        return removeDigit(str.toString());
        

        

    }
}