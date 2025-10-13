class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words); // sort the words in lexicographical order

        Set<String> characterBuild = new HashSet<>();
        String result = "";

        for(String word : words) {
            // add the first word of length 1, so we can compare it with other words
            // we will check if the prefixes of the word is present in the set
            if(word.length() == 1 || characterBuild.contains(word.substring(0, word.length() - 1))) {
                characterBuild.add(word);

                // we will check the similar length words and will choose the one with small lexicographical order
                if(word.length() > result.length() || 
                word.length() == result.length() && word.compareTo(result) < 0) {
                    result = word;
                }
            }
        }

        return result;
    }
}