package com.marsrover;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class RoverTest {
    HashMap<String, String> leftMap;
    HashMap<String, String> rightMap;

    @Before
    public void setUp() throws Exception {
        leftMap = new HashMap<>();
        rightMap = new HashMap<>();
        leftMap.put("S", "E");
        leftMap.put("E", "N");
        leftMap.put("N", "W");
        leftMap.put("W", "S");

        rightMap.put("E", "S");
        rightMap.put("N", "E");
        rightMap.put("W", "N");
        rightMap.put("S", "W");
    }

    @Test
    public void roverShouldBeEqual() {
        Rover rover = new Rover(leftMap, rightMap, "S", "1", "1");

        assertEquals("1 1 E", rover.toString());
    }
}