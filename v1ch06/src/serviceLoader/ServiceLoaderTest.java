package serviceLoader;

import java.nio.charset.StandardCharsets;
import java.util.ServiceLoader;

/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月27日 11:16:22
 * @packageName serviceLoader
 * @className ServiceLoaderTest
 */
public class ServiceLoaderTest {
    // 初始化服务加载器，这个初始化工作只在程序中完成一次
    public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);

    public static void main(String[] args) {
        Cipher cipher = getCipher(1);
        var message = "Meet me at the toga party.";
        byte[] bytes = cipher.encrypt(message.getBytes(), new byte[]{3});
        var encrypted = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(encrypted);
    }

    public static Cipher getCipher(int minStrength) {
        for (Cipher cipher : cipherLoader)
            // Implicitly calls iterator
            if (cipher.strength() >= minStrength) return cipher;
        return null;
    }

}
