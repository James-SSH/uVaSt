package com.JamesSSH;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String in;
    Scanner input = new Scanner(System.in);

    System.out.println("Vector or Scalar");
    do  {
        in = input.nextLine();
        misc.ClearTerminal();
    } while (!in.equalsIgnoreCase( "vector") && !in.equalsIgnoreCase("scalar"));
    if (in.equalsIgnoreCase("scalar")){
        Nothing();
    }

    }
    public static void Nothing(){}
}

