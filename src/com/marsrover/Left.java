package com.marsrover;

public class Left implements Operations {

    private final Rover rover;

    public Left(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.moveLeft();
    }
}
