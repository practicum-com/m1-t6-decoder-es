public class DecoderTest {

    public static void main(String[] args) {
        String cipher = "Ñd ohmru odphud gh hpwhpghu dñjr hv hpvhqáuvhñr d xpd frosxwdgrud.";

        System.out.println(new CaesarCipher().decipher(cipher, 3));
    }
}
