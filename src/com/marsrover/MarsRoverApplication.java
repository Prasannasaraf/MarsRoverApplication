package com.marsrover;

import java.util.HashMap;


public class MarsRoverApplication {
    public static void main(String[] args) {
        HashMap<String, String> leftMap = new HashMap<>();
        HashMap<String, String> rightMap = new HashMap<>();
        leftMap.put("S", "E");
        leftMap.put("E", "N");
        leftMap.put("N", "W");
        leftMap.put("W", "S");

        rightMap.put("E", "S");
        rightMap.put("N", "E");
        rightMap.put("W", "N");
        rightMap.put("S", "W");
        Rover rover = new Rover(leftMap, rightMap,"N", 1, 1);

        View view = new View();
        RoverController roverController = new RoverController(rover, view);
        roverController.start();
    }
}
