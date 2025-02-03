// 4 - Equal Row and Column Pairs

/*
Problem Statement - 
-> Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).

Approach - 
1. HashMap to Count Rows: We use a HashMap called mp to store lists of integers representing rows as keys and their frequencies as values.
2. Counting Rows: We iterate through each row in the grid. For each row, we create a list (li) to store its elements and then put this list 
   into the HashMap. We increment the count of the corresponding row each time it's encountered.
3. Counting Columns: We iterate through each column in the grid. For each column, we create a list (li) to store its elements. We then check 
   if the HashMap contains this list. If it does, we increment the count by the frequency of that row stored in the HashMap.
4. Return Count: Finally, we return the total count, which represents the number of equal pairs of rows and columns in the grid.

*/

Code - 
class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> map = new HashMap<>();

        int n = grid.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < n; j++){
                list.add(grid[i][j]);
            }
            map.put(list, map.getOrDefault(list, 0) + 1);
        }


        for(int i = 0; i < n; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < n; j++){
                list.add(grid[j][i]);
            }
            if(map.containsKey(list)){
                count += map.get(list);
            }
        }

        return count;

    }
}
