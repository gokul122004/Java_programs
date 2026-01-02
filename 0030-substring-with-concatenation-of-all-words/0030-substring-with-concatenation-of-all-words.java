class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if(s == null || s.length() == 0|| words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int totalWords = words.length;
        int totalLen = wordLen * totalWords;
        int num = s.length();

        if(num < totalLen) {
            return result;
        }

        Map<String, Integer> wordToInt = new HashMap<>();
        int[] count = new int[totalWords + 1];
        int id = 1;

        for(String word : words) {
            if (!wordToInt.containsKey(word)) {
                wordToInt.put(word, id++); 
            }
            count[wordToInt.get(word)]++;
        }

        int[] sIds = new int[num - wordLen + 1];
        for( int i = 0; i<= num - wordLen; i++) {
            String word = s.substring(i, i + wordLen);
            sIds[i] = wordToInt.getOrDefault(word, 0);
        }

        for (int start = 0; start < wordLen; start++) {
            int[] actualCount = new int[id];
            int c = 0;

            for(int i = start; i< start + totalLen && i <= num- wordLen; i += wordLen) {
                if(sIds[i] > 0) {
                    actualCount[sIds[i]]++;
                    if(actualCount[sIds[i]] <= count[sIds[i]]) {
                        c++;
                    }
                }
            }

            if (c == totalWords) {
                result.add(start);
            }

            for(int i = start + wordLen; i <= num - totalLen; i += wordLen) {
                int left = i - wordLen;
                if (sIds[left] > 0) {
                    actualCount[sIds[left]]--;
                    if (actualCount[sIds[left]] < count[sIds[left]]) {
                        c--;
                    }
                }

                int right = i + totalLen - wordLen;
                if (sIds[right] > 0) {
                    actualCount[sIds[right]]++;
                    if (actualCount[sIds[right]] <= count[sIds[right]]) {
                        c++;
                    }
                }

                if (c == totalWords) {
                    result.add(i);
                }
            }
        }

        return result;
    }
}