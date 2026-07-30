package S_Builders;

public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch; // series += ch  // NEW STRING OBJECTS ARE BEING CREATED AT EVERY ITERATION
            // a, ab, abc, abcd, abcde etc. --> THESE ALL STRING OBJECTS WILL HAVE NO REF VARIABLES
            // O(N^2) NOT GOOD
            // SINCE 1 + 2 + 3 + 4 + .. + N = N(N+1)/2 --> (N^2 + N) / 2 --> IGNORE CONSTANTS --> N^2
        }
        System.out.println(series);
    }
}
