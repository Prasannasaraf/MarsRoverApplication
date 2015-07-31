package com.marsrover;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;


//Used for Input Output
public class ViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;
    private HashMap<String, String> leftMap;
    private HashMap<String, String> rightMap;

    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
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
    public void displaysRover() {
        Rover rover = new Rover(leftMap, rightMap, "E", 1, 1);

        assertEquals("1 1 E",rover.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }
}