package S_Builders;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch); //   NO NEW OBJECTS CREATED HERE 
            // TRY ALL THE FUNCTIONS 
        }
        System.out.println(builder.toString());
    }
}
