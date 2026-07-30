// Functional check for checking a Palindrome

public class Palindrome {
    static void main() {
        String str = "abcba";
        System.out.println(isPalindrome(str, 0));
    }
    static boolean isPalindrome(String str, int i) {
        while (i < (str.length() / 2)){     // we can also use an if condition here
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            return false;
        }
        return isPalindrome(str, i + 1);
        }
        return true;
    }
}
