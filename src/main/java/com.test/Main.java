package com.test;

import java.util.ArrayList;
import java.util.List;

import static com.sun.xml.internal.stream.writers.WriterUtility.SPACE;

public class Main {

    private static String test;

    public void reName() {
        test = null;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.reName();

        switch (test) {
            default:
                System.out.println("testing");
        }
    }
}
