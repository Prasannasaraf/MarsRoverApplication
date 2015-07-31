package com.marsrover;

import java.util.HashMap;


//Rover Moves forward,left,right.
public class Rover {
    HashMap<String, String> leftMap;
    HashMap<String, String> rightMap;
    String currentPosition;
    int xPosition;
    int yPositon;

    public Rover(HashMap<String, String> leftMap, HashMap<String, String> rightMap, String currentPosition, int xPostion, int yPositon) {
        this.leftMap = leftMap;
        this.rightMap = rightMap;
        this.currentPosition = currentPosition;
        this.xPosition = xPostion;
        this.yPositon = yPositon;
    }

    public void moveLeft() {
        currentPosition = leftMap.get(currentPosition);
    }


    public void moveRight() {
        currentPosition = rightMap.get(currentPosition);
    }

    @Override
    public String toString() {
        return xPosition + " " + yPositon + " " + currentPosition;
    }

    public void move() {
        switch (currentPosition) {
            case "E":
                xPosition++;
                break;
            case "N":
                yPositon++;
                break;
            case "W":
                xPosition--;
                break;
            case "S":
                yPositon--;
        }
    }
}