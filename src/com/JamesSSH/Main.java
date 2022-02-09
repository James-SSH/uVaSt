package com.JamesSSH;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String in = null;
    Scanner input = new Scanner(System.in);

    System.out.println("Vector or Scalar");
    if (!in.toLowerCase().equals( "vector") && !in.toLowerCase().equals("scalar")) {
        in = input.nextLine();
    }
    if (in.toLowerCase() == "vector"){

    } else if (in.toLowerCase() == "scalar"){
        if (in != "?"){
            
        }
    }

    }
}
