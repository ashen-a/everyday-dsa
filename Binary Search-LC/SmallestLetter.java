/*Ignore the = part of the code, therefore only 2 checks required
Condition violated : start = end + 1 --> Length of the array(N)

*/

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans); // Output: c
    }

    // Changed return type from int to char
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1; // Corrected: update 'end', not 'mid'
            } else {
                start = mid + 1;
            }
        }

        // The modulo operator handles the "wrap around" case automatically
        // If start == letters.length, it returns letters[0]
        return letters[start % letters.length]; // since start = end + 1 i.e equal to length of the array
    }
}