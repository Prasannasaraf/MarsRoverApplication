package com.marsrover;

public class Move implements Operations {
    Rover rover;
    public Move(Rover rover) {
    this.rover = rover;
    }

    @Override
    public void execute() {
        rover.move();
    }
}
