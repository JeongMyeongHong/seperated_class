package com.bitcamp.name;

public class LoginApp {
    private String id = "";
    private String pw = "";
    private String name = "";
    public static String website = "Naver";

    public String login(String paramid, String parampw, String paramname){
        id = paramid;
        pw = parampw;
        name = paramname;

        return name+"님 환영합니다. ID는 : "+id+" PW는 : "+pw+"입니다.";
    }
}