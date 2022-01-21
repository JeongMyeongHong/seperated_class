package com.bitcamp.name;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();

        System.out.println(LoginApp.website);
        System.out.println("ID 입력");
        System.out.println("PW 입력");
        System.out.println("이름 입력");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();

        String result = loginApp.login(id, pw, name);

        System.out.println(result);
    }
}
