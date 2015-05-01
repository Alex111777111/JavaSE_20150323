package ru.javacourse.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example
{

    public static void main(String[] args) throws InterruptedException {

        List<String> reverse = new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        for(int i=0; i<100; i++) {
            list.add("djfhgljadfhg ldfjgh ldjhgsdlfjgh djghkldfjgh ldfkjghjfhglkhjfg lhjgkjg ldjgfh dklgh ");
        }
        Example ex = new Example();

        for(String s : list) {
            Thread f = new MyClass(s, reverse);
            f.start();
//            ex.processString(s);
        }
    }

}


class MyClass extends Thread {

    private static final int COUNT = 4;

    private String item;
    private List<String> reverse;

    public MyClass(String item, List<String> reverse) {
        this.item = item;
        this.reverse = reverse;
    }

    public void run() {
        processString(item);
        System.out.println(reverse.size());
    }

    public void processString(String name) {
        char[] chars = name.toCharArray();
        List<Character> list = new ArrayList<Character>();
        for(char c : chars) {
            list.add(c);
        }
        for(int i=0; i<COUNT; i++) {
            Collections.shuffle(list);
            Collections.reverse(list);
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : list) {
            sb.append(c);
        }

        reverse.add(sb.toString());
    }

}