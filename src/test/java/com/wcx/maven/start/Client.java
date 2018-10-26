package com.wcx.maven.start;

import java.io.InputStream;

public class Client {
    public static void main(String[] args) {
        System.out.println("hello world");
        //get resource
    }
    void getResource() {
        InputStream is = getClass().getResourceAsStream( "/test.properties" );

    }
}
