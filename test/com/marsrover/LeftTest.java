package com.marsrover;

import org.junit.Test;
import org.mockito.Mockito;


public class LeftTest {

    @Test
    public void shouldCallMoveLeft() {
        Rover rover = Mockito.mock(Rover.class);
        Left left = new Left(rover);

        left.execute();

        Mockito.verify(rover).moveLeft();
    }
}