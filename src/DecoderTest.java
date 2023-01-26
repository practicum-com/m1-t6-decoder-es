public class DecoderTest {

    public static void main(String[] args) {
        String cipher = "Wkh ehvw zdb wr xqghuvwdqg vrphwklqj lv wr whdfk lw wr d frpsxwhu.";

        System.out.println(new CaesarCipher().decipher(cipher, 3));
    }
}
