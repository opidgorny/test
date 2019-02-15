package com.test;

public abstract class Test {

    public static String REPORT_NAME;

    public String getReportName() {
        return REPORT_NAME;
    }

    public static void main(String[] args) {
        Test test = new Realiser("name");
        
    }
}
