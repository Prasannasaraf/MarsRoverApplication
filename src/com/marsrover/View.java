package com.marsrover;

import java.util.Scanner;


//Displays and Take input from console
public class View {
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void display(Rover rover) {
        System.out.println(rover);
    }
}