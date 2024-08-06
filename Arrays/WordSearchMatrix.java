package Arrays;

public class WordSearchMatrix {

    public static void main(String[] args) {
        char[][] matrix = {
            {'F', 'A', 'C', 'I'},
            {'O', 'B', 'Q', 'P'},
            {'A', 'N', 'O', 'B'},
            {'M', 'A', 'S', 'S'}
        };
        
        System.out.println(wordExists(matrix, "FOAM")); // Output: true
        System.out.println(wordExists(matrix, "MAS")); // Output: true
        System.out.println(wordExists(matrix, "OBO"));  // Output: false
    }

    public static boolean wordExists(char[][] matrix, String target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check horizontally
        for (int i = 0; i < rows; i++) {
            String rowString = new String(matrix[i]);
            if (rowString.contains(target)) {
                return true;
            }
        }

        // Check vertically
        for (int j = 0; j < cols; j++) {
            StringBuilder colString = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                colString.append(matrix[i][j]);
            }
            if (colString.toString().contains(target)) {
                return true;
            }
        }

        return false;
    }
}
