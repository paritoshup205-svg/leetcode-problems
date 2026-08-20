import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            long combination = 1;
            for(int j =0;j<=i;j++){
            row.add((int)combination);
            combination = combination*(i-j)/(j+1);
            }
            result.add(row);
        }
        return result;
    }
}