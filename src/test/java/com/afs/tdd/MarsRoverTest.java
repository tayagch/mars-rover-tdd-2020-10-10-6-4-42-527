package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    // 0,0 N M
    @Test
    public void should_x_0_y_1_heading_N_given_execute_command_x_0_y_0_heading_N_when_command_M() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"N","M");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals("N",marsRover.getHeading());
    }

    @Test
    public void should_x_0_y_0_heading_W_given_execute_command_x_0_y_0_heading_N_when_command_L() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"N","L");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getHeading());
    }
}
