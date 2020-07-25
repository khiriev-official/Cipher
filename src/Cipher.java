//package com.rasulKh.Encryption;

import java.io.FileReader;
import java.io.File;

public class Cipher {
    // Класс для зашифровки файла
    // Шифров для
    public File file;
    public String method;

    Cipher(File file, String method) {
        /*
        this.file = file;
        this.method = method;
        */
        System.out.println("Cipher constructor has been initialized");
    }

    public void encrypt(File file) {
        System.out.println("File has been encrupted");
    }

    public void setFile(File file) {
        // this.file = file;
        System.out.println("File has been set.");
        /*try {
            this.file = file;
        } catch (FileNotFoundException e1) {
            System.out.println("Файл не найден");
        }*/
    }

    public void setMethod(String method) {
        //this.method = method;
        System.out.println("You have chosen " + method + " method.");
    }
}