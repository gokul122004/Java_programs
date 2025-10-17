class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        String words[] = paragraph.toLowerCase().split("[^a-z]+");
        String best = "";
        int bestCount = 0;

        for(String word : words) {
            if(ban.contains(word)) {
                continue;
            }
            int count = 0;
            for(String word1 : words) {
                if(word.equals(word1)) {
                    count++;
                }
            }

            if(count > bestCount) {
                bestCount = count;
                best = word;
            }
        }

        return best;
    }
}