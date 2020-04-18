package com.clc.learning.io.bio.test;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SampleTest {
    public static void main(String[] args) {
        String filePath = "";
        try {
            InputStream i = new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
                FileInputStream a = new FileInputStream("");
            };
            Reader reader = new FileReader(filePath);
            BufferedReader bfReader = new BufferedReader(reader);
            StringBuffer bf = new StringBuffer();
            String str ;
            while((str = bfReader.readLine())!=null){
                bf.append(str);
            }
            bfReader.close();
            System.out.println(bf.toString());

            //////////NIO
            //write file
            Files.write(Paths.get(filePath),"".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

            //read file
            byte[] data  = Files.readAllBytes(Paths.get(filePath));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
