import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        int n = rowIndex+1;
        for(int i =0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            long combination = 1;
            for(int j =0;j<=i;j++){
            row.add((int)combination);
            combination = combination*(i-j)/(j+1);
            }
            result.add(row);
        }
        return result.get(rowIndex);
    }
}