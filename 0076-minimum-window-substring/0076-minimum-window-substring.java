class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        int[] tFreq = new int[128];
        int[] windowFreq = new int[128];

        for (char c : t.toCharArray()) {
            tFreq[c]++;
        }

        int required = 0;
        for (int count : tFreq) {
            if (count > 0) required++;
        }

        int left = 0;
        int right = 0;
        int formed = 0;
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;

        while (right  <s.length()) {
            char c = s.charAt(right);
            windowFreq[c]++;

            if(tFreq[c] > 0 && windowFreq[c] == tFreq[c]) {
                formed++;
            }

            while (left <= right && formed == required) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);
                windowFreq[leftChar]--;

                if (tFreq[leftChar] > 0 && windowFreq[leftChar] < tFreq[leftChar]) {
                    formed--;
                }
                left++;
            }
            right++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }
}