package com.marsrover;


public class Right implements Operations {
    Rover rover;

    public Right(Rover rover) {
    this.rover = rover;
    }

    @Override
    public void execute() {
        rover.moveRight();
    }
}
