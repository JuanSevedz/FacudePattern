package facade;

import subsystem.FileEncryptor;
import subsystem.FileReader;
import subsystem.FileWriterr;

public class Facade {
    private FileReader fileReader;
    private FileWriterr fileWriter;
    private FileEncryptor fileEncryptor;

    public Facade() {
        this.fileReader = new FileReader();
        this.fileWriter = new FileWriterr();
        this.fileEncryptor = new FileEncryptor();
    }

    public String readFileAndEncrypt(String filePath) {
        String content = fileReader.readFile(filePath);
        return fileEncryptor.encrypt(content);
    }

    public void encryptAndWriteFile(String filePath, String encryptedContent) {
        String decryptedContent = fileEncryptor.encrypt(encryptedContent);
        fileWriter.writeFile(filePath, decryptedContent);
    }
}