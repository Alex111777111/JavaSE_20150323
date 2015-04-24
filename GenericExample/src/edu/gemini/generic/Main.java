package edu.gemini.generic;

import java.util.Collection;
import java.util.Date;

public class Main
{

    public static <T> T addAndReturn(Class<T> type) {
        try {
            return (T) type.newInstance();
        } catch(Exception e) {
            return null;
        }
    }

    public static void main(String[] arg) {
        String s = addAndReturn(String.class);
        Date date = addAndReturn(Date.class);

        try {
            GenericFactory<String> factory1 = new GenericFactory<String>(String.class);
            String stringInstance = factory1.createInstance();

            GenericFactory<Integer> factory2 = new GenericFactory<Integer>(Integer.class);
            Integer integerInstance = factory2.createInstance();

            GenericFactory<Date> factory3 = new GenericFactory<Date>(Date.class);
            Date dateInstance = factory3.createInstance();

        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        }
    }
}
