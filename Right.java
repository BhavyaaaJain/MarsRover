/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MarsRover;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public class Right extends Command{
    //Hashmap to store the effect of moving right from a present particular 
    Map<Character, Character> right = new HashMap<>();
    public Right()
    {
        right.put('N', 'E');
        right.put('W', 'N');
        right.put('S', 'W');
        right.put('E', 'S');
    }

    //Update the rover direction accordingly
    public void move(Rover rover, Grid grid)
    {
        rover.dir=right.get(rover.dir);
        System.out.println(rover.dir);
    }

}
