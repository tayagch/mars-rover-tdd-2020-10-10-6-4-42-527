package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        MarsRover marsRover = new MarsRover(0,0,"E","L");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("N",marsRover.getHeading());
    }

    @Test
    public void should_x_0_y_0_heading_E_given_execute_command_x_0_y_0_heading_N_when_command_R() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"N","R");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getHeading());
    }

    @Test
    void should_x_0_y_negative_1_heading_S_given_execute_command_x_0_y_0_heading_S_when_command_M() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"S","M");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(-1,marsRover.getLocationY());
        assertEquals("S",marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_E_given_execute_command_x_0_y_0_heading_S_when_command_L() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"S","L");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_W_given_execute_command_x_0_y_0_heading_S_when_command_R() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"S","R");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getHeading());
    }

    @Test
    void should_x_1_y_0_heading_E_given_execute_command_x_0_y_0_heading_E_when_command_M() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"E","M");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_N_given_execute_command_x_0_y_0_heading_E_when_command_L() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"E","L");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("N",marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_S_given_execute_command_x_0_y_0_heading_E_when_command_R() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"E","R");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("S",marsRover.getHeading());
    }

    @Test
    void should_x_negative_1_y_0_heading_W_given_execute_command_x_0_y_0_heading_W_when_command_M() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"W","M");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(-1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_S_given_execute_command_x_0_y_0_heading_W_when_command_L() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"W","L");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("S",marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_N_given_execute_command_x_0_y_0_heading_W_when_command_R() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"W","R");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("N",marsRover.getHeading());
    }

    @Test
    void should_x_0_y_1_heading_W_given_execute_command_x_0_y_0_heading_N_when_command_ML() {
        // Given
        MarsRover marsRover = new MarsRover(0,0,"N","ML");
        // When
        marsRover.executeCommands();
        // Then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals("W",marsRover.getHeading());
    }
    
    @Test
    public void should_return_illegalArgumentException_given_execute_command_x_0_y_0_heading_N_when_command_A(){
        // Given
        MarsRover marsRover = new MarsRover(0,0,"N","A");

        // When
        Exception exception = assertThrows(IllegalArgumentException.class, () -> marsRover.executeCommands());

        // Then
        assertEquals("CommandNotDefinedException",exception.getMessage());
    }
}
