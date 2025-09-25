class Solution {
    public int romanToInt(String s) {
        int total = 0, value = 0, prev = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i=s.length()-1; i>=0; i--) {
            value = map.get(s.charAt(i));

            if(value < prev) {
                total -= value;
            } else {
                total += value;             
            }

            prev = value;
        }

        return total;
    }
}