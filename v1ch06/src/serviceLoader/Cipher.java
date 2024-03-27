package serviceLoader;

/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月27日 11:16:03
 * @packageName serviceLoader
 * @className Cipher
 */
public interface Cipher {
    byte[] encrypt(byte[] source, byte[] key);
    byte[] decrypt(byte[] source, byte[] key);
    int strength();
}
