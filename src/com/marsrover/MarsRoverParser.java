package com.marsrover;


public class MarsRoverParser {
    public static Operations parse(char direction,Rover rover,View view) {
        switch (direction) {
            case 'L' :
                return new Left(rover);
            case 'R' :
                return new Right(rover);
            case 'M' :
                return new Move(rover);
        }
    return null;
    }
}
