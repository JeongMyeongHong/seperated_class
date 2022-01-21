package com.bitcamp.name;

public class HelloNameApp {

    String id = "";
    String pw = "";
    String name = "";

    public String hello(String paramid, String parampw, String paramname){

        id = paramid;
        pw = parampw;
        name = paramname;

        return "Hello id = "+id+" pw = "+pw+" name = "+name;
    }
}
