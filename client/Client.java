package client;

import facade.Facade;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        String filePath = "test.txt";
        String originalContent = ("ribircse y ratpircnE oreiuq euq otxet le se etsE"); //Modificamos si queremos hacer los input o no

        /* 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce el contenido que deseas escribir en el archivo:");
        originalContent = scanner.nextLine();
        scanner.close();
        */

        // Escribimos el contenido original al archivo
        facade.encryptAndWriteFile(filePath, originalContent);
        System.out.println("Se ha escrito el contenido original en " + filePath);

        // Leeemos el archivo y lo encriptamos
        String encryptedContent = facade.readFileAndEncrypt(filePath);
        System.out.println("\nContenido encriptado de " + filePath + ": " + encryptedContent);
    }
}