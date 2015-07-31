package com.marsrover;

import java.util.HashMap;


//Rover Moves forward,left,right.
public class Rover {
    HashMap<String, String> leftMap;
    HashMap<String, String> rightMap;
    String currentPosition;
    String xPosition;
    String yPositon;

    public Rover(HashMap<String, String> leftMap, HashMap<String, String> rightMap, String currentPosition, String xPostion, String yPositon) {
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

}