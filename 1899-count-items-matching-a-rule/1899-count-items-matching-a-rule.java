class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int k = 0;
        if(ruleKey.equals("color")) {
            k = 1;
        } else if(ruleKey.equals("name")) {
            k = 2;
        }

        int c = 0;
        for(List<String> i : items) {
            if( i.get(k).equals(ruleValue) ) {
                c++;
            }
        }

        return c;
    }
}