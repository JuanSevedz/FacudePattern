package facade;

import subsystem.FileEncryptor;
import subsystem.FileReader;
import subsystem.FileWriterr;

public class FileFacade {
    // Implementación del Singleton
    private static FileFacade instance;
    
    private FileReader fileReader;
    private FileWriterr fileWriter;
    private FileEncryptor fileEncryptor;
    
    // Constructor privado para el patrón Singleton
    private FileFacade() {
        this.fileReader = new FileReader();
        this.fileWriter = new FileWriterr();
        this.fileEncryptor = new FileEncryptor();
    }
    
    // Método para obtener la instancia única
    public static FileFacade getInstance() {
        if (instance == null) {
            instance = new FileFacade();
        }
        return instance;
    }
    
    public String readFileAndEncrypt(String filePath) {
        String content = fileReader.readFile(filePath);
        return fileEncryptor.encrypt(content);
    }
    
    public String readFileAndDecrypt(String filePath) {
        String content = fileReader.readFile(filePath);
        return fileEncryptor.decrypt(content);
    }
    
    public void encryptAndWriteFile(String filePath, String content) {
        String encryptedContent = fileEncryptor.encrypt(content);
        fileWriter.writeFile(filePath, encryptedContent);
    }
    
    public void decryptAndWriteFile(String filePath, String encryptedContent) {
        String decryptedContent = fileEncryptor.decrypt(encryptedContent);
        fileWriter.writeFile(filePath, decryptedContent);
    }
}