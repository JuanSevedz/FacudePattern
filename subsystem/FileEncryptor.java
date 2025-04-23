package subsystem;

public class FileEncryptor {
    public String encrypt(String data) {
        // Simulación de encriptación simple (reversa la cadena)
        return new StringBuilder(data).reverse().toString();
    }

    public String decrypt(String encryptedData) {
        // Simulación de desencriptación simple (reversa la cadena)
        return new StringBuilder(encryptedData).reverse().toString();
    }
}