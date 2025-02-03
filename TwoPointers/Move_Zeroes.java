/* 1 - Move Zeroes */

/* 
Approach - We are using two pointers and both of the pointers are initially set to 0th index 
           So whenever we'll get non zero numbers, we'll move them to left by using one of
           the pointer and After moving all non zero numbers to the left then we add zeroes 
           to the right according to the length of the array.

⭐️ Points-
-> To solve this question
-> Move all zeros to right places
-> Move all non zero numbers to left places

Time complexity: O(n)
Space complexity: O(1)

*/



class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }

    }
}
