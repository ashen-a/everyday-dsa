import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9))); // Expected [1, 2]
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Binary search on rows to narrow down to 2 rows
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2; // Fixed formula
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have two rows: rStart and rStart + 1 (which is rEnd)
        
        // 1. Check if target is in the middle column of these two rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rEnd][cMid] == target) {
            return new int[]{rEnd, cMid};
        }

        // 2. Search in 1st quadrant
        if (cMid > 0 && target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // 3. Search in 2nd quadrant
        if (cMid < cols - 1 && target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // 4. Search in 3rd quadrant
        if (cMid > 0 && target <= matrix[rEnd][cMid - 1]) {
            return binarySearch(matrix, rEnd, 0, cMid - 1, target);
        }
        // 5. Search in 4th quadrant
        if (cMid < cols - 1 && target >= matrix[rEnd][cMid + 1]) {
            return binarySearch(matrix, rEnd, cMid + 1, cols - 1, target);
        }

        return new int[]{-1, -1};
    }
}