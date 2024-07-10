/* Merge Strings Alternatively */

// 1. Problem Statement
// -> You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, 
//    starting with word1. If a string is longer than the other, append the additional letters onto the end 
//    of the merged string.
//    Return the merged string.

//   Input: word1 = "abc", word2 = "pqr"
//   Output: "apbqcr"

// 2. Approach of the Solution
// -> Initialization:
//    -Initialize an empty string ans.
//    -Set indices i, j, and k to 0.
  
// -> Main Loop:
//    -Iterate through both strings while both have remaining characters:
//    -Append the character from word1 if k is even, otherwise append the character from word2.
//    -Increment the respective index (i or j) and the alternation index k.
  
// -> Remaining Characters:
//    -Append any remaining characters from word1.
//    -Append any remaining characters from word2.
//    -Return Result:
//    -Return the merged string ans.
  
// 3. Time and Space Complexity
// -> Time Complexity: O(n + m), where n is the length of word1 and m is the length of word2. This is because 
//    we traverse each character in both strings exactly once.
// -> Space Complexity: O(n + m) for storing the result string ans, which contains all characters from both 
//    input strings.

/* Solution */
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int i = 0, j = 0, k = 0;

        while(i < word1.length() && j < word2.length()){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(j);
            if(k % 2 == 0){
                ans += ch1;
                i++;
            } else {
                ans += ch2;
                j++;
            }
            k++;
        }
        while(i < word1.length()){
            char ch = word1.charAt(i);
            ans += ch;
            i++;
        }
        while(j < word2.length()){
            char ch = word2.charAt(j);
            ans += ch;
            j++;
        }
        return ans;
    }
}
