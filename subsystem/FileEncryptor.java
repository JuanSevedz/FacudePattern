package subsystem;

public class FileEncryptor {
    public String encrypt(String data) {
        // Simulación de encriptación simple (reversa la cadena)
        return new StringBuilder(data).reverse().toString();
    }

}