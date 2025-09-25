class Solution {
    public int[] plusOne(int[] digits) {
        int a = 0;
        for(int i=digits.length-1; i>=0; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
                a = 1;
            } else {
                digits[i]+=1;
                a = 0;
                break;
            }
        }
        if(a > 0) {
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            System.arraycopy(digits, 0, arr, 1, digits.length);
            return arr;        
        }
        return digits;
    }
    
}