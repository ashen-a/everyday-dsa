public class Set_bit {
    public static void main(String[] args) {
        int num = 0b1010110;
        int n = 4;

        int mask = 1 << (n - 1);
        int ans = num | mask;

    }
}
