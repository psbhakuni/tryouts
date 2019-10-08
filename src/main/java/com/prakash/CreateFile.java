package com.prakash;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile
{
    public static void main(String[] args) throws IOException
    {
        // Accept a string
        String str = "File Handling in Java using "+
                " FileWriter and FileReader";
        //File file = new File("file.txt");
        Path path = Paths.get("file.txt");
        //try(FileWriter fr = new FileWriter("filenew.txt")) {
        //try(FileWriter fr = new FileWriter(file,true)) {
        try(BufferedWriter fr = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            for(int i =0; i<str.length(); i++) {
                fr.write(str.charAt(i));
            }
        }

        System.out.println("Writing successful");

    }
}
