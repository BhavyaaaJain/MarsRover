/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MarsRover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public class Left extends Command{
    //Hashmap to store the effect of moving left from a present particular
    Map<Character, Character> left = new HashMap<>();
    public Left()
    {
        left.put('N', 'W');
        left.put('W', 'S');
        left.put('S', 'E');
        left.put('E', 'N');
    }

    //Update the rover direction accordingly
    public void move(Rover rover, Grid grid)
    {
        rover.dir = left.get(rover.dir);
    }
}
