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
public class Rover {
    int x, y, o;
    char dir;
    
    public Rover(int x, int y, char dir)
    {
        this.x=x;
        this.y=y;
        this.dir=dir;
        this.o=0;
    }
    
    
    public void getStatus()
    {
        String directionString = (dir == 'N') ? "North" : (dir == 'S') ? "South" : (dir == 'W') ? "West" : "East";

        System.out.println("Final Position: (" + x + ", " + y + ", " + dir + ")");
        System.out.println("Status Report: Rover is at (" + x + ", " + y + ") facing " + directionString + ". " + o + " Obstacles detected");
    }
}
