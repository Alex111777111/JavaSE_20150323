package edu.javacourse.xsl;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XslConverter
{
    public String xmlToString(String xml, String xsl) throws Exception {
        StreamSource xmlSource = new StreamSource(new ByteArrayInputStream(xml.getBytes("UTF-8")));
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        StreamResult xmlOutput = new StreamResult(ba);
        StreamSource stylesource = new StreamSource(new ByteArrayInputStream(xsl.getBytes("UTF-8")));
        Transformer transformer = TransformerFactory.newInstance().newTransformer(stylesource);
        transformer.transform(xmlSource, xmlOutput);

        return ba.toString();
    }
    
    public static void main(String[] arg) throws IOException {
        String xml = "<source><title>Познай себя</title><author>Фиоктистов Васисуалий</author></source>";
        String xsl = "<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"><xsl:output omit-xml-declaration=\"yes\"/>"
                + "<xsl:template match=\"/\"><body><h1><xsl:value-of select=\"//title\"/></h1><h2><xsl:value-of select=\"//author\"/></h2></body></xsl:template></xsl:stylesheet>";

        XslConverter c = new XslConverter();
        try {
            String result = c.xmlToString(xml, xsl);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
