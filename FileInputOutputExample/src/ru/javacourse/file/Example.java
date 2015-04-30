package ru.javacourse.file;

import java.io.*;

public class Example
{
    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("LessonBE.zip");
        OutputStream fos = new FileOutputStream("test.zip");
        byte[] buffer = new byte[4096];
        int size = 0;
        while((size = fis.read(buffer))!=-1) {
            fos.write(buffer, 0, size);
        }
        fis.close();
        fos.close();

        Reader r = new FileReader("Example.java");
        Writer w = new FileWriter("test.txt");
        char[] cbuffer = new char[200];
        while((size = r.read(cbuffer))!=-1) {
            w.write(cbuffer, 0, size);
        }
        r.close();
        w.close();


        BufferedReader br = new BufferedReader(new FileReader("C:\\work\\math.txt"));
        String line = null;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        };
        br.close();
    }
}
