class Solution {
    public int longestStrChain(String[] words) {
       Arrays.sort(words, Comparator.comparingInt(String::length));

        // Map to store the longest chain ending at each word
        Map<String, Integer> dp = new HashMap<>();
        int maxLength = 1;

        for (String word : words) {
            dp.put(word, 1); // Each word is a chain of at least length 1

            for (int i = 0; i < word.length(); i++) {
                // Remove one character from the word to form a predecessor
                String predecessor = word.substring(0, i) + word.substring(i + 1);

                // If the predecessor exists in the map, update the current word's chain length
                if (dp.containsKey(predecessor)) {
                    dp.put(word, Math.max(dp.get(word), dp.get(predecessor) + 1));
                }
            }

            // Update the global maximum length
            maxLength = Math.max(maxLength, dp.get(word));
        }

        return maxLength;
    }
}