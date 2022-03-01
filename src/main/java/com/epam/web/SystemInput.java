package com.epam.web;

import java.util.Scanner;

public class SystemInput {
    public String input(){
        Scanner in = new Scanner(System.in);
        String str;
        str = in.nextLine();
        return str;
    }
}
