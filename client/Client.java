package client;

import facade.FileFacade;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        
        // Usando el Singleton para instanciar FileFacade
        FileFacade facade = FileFacade.getInstance();

        String filePath = "test.txt";
        String originalContent = ("¡Hola, patrón Facade en Javal!"); //Modificamos si queremos hacer los input o no

        /* 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce el contenido que deseas escribir en el archivo:");
        originalContent = scanner.nextLine();
        scanner.close();
        */

        // Escribimos el contenido original al archivo
        facade.encryptAndWriteFile(filePath, originalContent);
        System.out.println("Se ha escrito el contenido original en " + filePath);

        // Leemos el archivo y lo desencriptamos
        String decryptedContent = facade.readFileAndDecrypt(filePath);
        System.out.println("\nContenido desencriptado de " + filePath + ": " + decryptedContent);
        
        // También podemos leer y encriptar para ver el contenido encriptado
        String encryptedContent = facade.readFileAndEncrypt(filePath);
        System.out.println("\nContenido encriptado de " + filePath + ": " + encryptedContent);
    }
}