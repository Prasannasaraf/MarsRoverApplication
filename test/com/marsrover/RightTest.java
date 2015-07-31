package com.marsrover;

import org.junit.Test;
import org.mockito.Mockito;


public class RightTest {

    @Test
    public void shouldCallMoveRight() {
        Rover rover = Mockito.mock(Rover.class);
        Right right = new Right(rover);

        right.execute();

        Mockito.verify(rover).moveRight();
    }
}