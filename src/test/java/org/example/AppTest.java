package org.example;


import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    String time = "09:21";
    Car car1 = new Car("PBO-2217","09/07/2022",time);
    Car car2 = new Car("PBX-0001","11/07/2022",time);
    Car car3 = new Car("PZA-0003","12/07/2022",time);
    @Test
    public void shouldAnswerWithTrue() throws ParseException {
        assertFalse(car1.allowed_to_drive(time));
        assertTrue(car2.allowed_to_drive(time));
        assertTrue(car3.allowed_to_drive(time));
    }
}
