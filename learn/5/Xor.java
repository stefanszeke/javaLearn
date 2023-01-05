public class Xor {
    public static void main(String[] args) {
        // xor ^ example:
        // 0 ^ 0 = 0
        // 0 ^ 1 = 1
        // 1 ^ 0 = 1
        // 1 ^ 1 = 0
        //

        String str = "ABCDEFGH";
        String encoded = "";
        String decoded = "";
        int key = 88;

        for(int i = 0; i < str.length(); i++) {
            encoded += (char) (str.charAt(i) ^ key); // XOR
        }
        // System.out.println("Encoded: " + encoded);
        
        for(int i = 0; i < encoded.length(); i++) {
            decoded += (char) (encoded.charAt(i) ^ key); // XOR
        }
        // System.out.println("Decoded: " + decoded);

        int key2 = 3;
        char a = 'A';
        int encodeding1 = (char)a ^ key2;
        System.out.println("A: " + (int)a);
        System.out.println("Encoded: " + encodeding1);


    }
}