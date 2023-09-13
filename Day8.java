import java.util.*;

public class Day8 {

        public static List<List<Integer>> generatePascalsTriangle(int numRows) {
            List<List<Integer>> answer = new ArrayList<>();
    
            if (numRows <= 0) {
                return answer ;
            }
    
            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new ArrayList<>();
    
                if (i == 0) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = answer.get(i - 1);
                    row.add(1); 
    
                    for (int j = 1; j < i; j++) {
                      
                        int element = prevRow.get(j - 1) + prevRow.get(j);
                        row.add(element);
                    }
    
                    row.add(1);
                }
    
                answer.add(row);
            }
    
            return answer;
        }
    

    
        public static void main(String[] args) {
            int numRows = 5;
            List<List<Integer>> result = generatePascalsTriangle(numRows);
    
            for (List<Integer> row : result) {
                System.out.println(row);
            }
        }
    
}

