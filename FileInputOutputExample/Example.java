package ru.javacourse.file;

import java.io.*;

public class Example
{
    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("LessonBE.zip");
        OutputStream fos = new FileOutputStream("test.zip", true);
        byte[] buffer = new byte[fis.available()];
        int size = 0;
        while((size = fis.read(buffer))!=-1) {
            fos.write(buffer, 0, size);
        }
        fis.close();
        fos.close();

        Reader r = new FileReader()
    }
}
