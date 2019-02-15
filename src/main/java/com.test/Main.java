package com.test;

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
