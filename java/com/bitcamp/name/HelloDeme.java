package com.bitcamp.name;

import java.util.Scanner;

public class HelloDeme {

    public static void main(String[] args) {
        HelloNameApp helloNameApp = new HelloNameApp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("id?");
        System.out.println("pw?");
        System.out.println("name?");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();

        System.out.print("output : ");
        String result = helloNameApp.hello(id, pw, name);
        System.out.println(result);
    }
}
