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
public class Client {
    public static void main(String args[])
    {
        
        Grid grid = new Grid(10, 10);
        grid.addObstacle(2,2);
        grid.addObstacle(3,5);
        
        Rover rover = new Rover(0, 0, 'N');
        Forward f = new Forward();
        Right r = new Right();
        Left l = new Left();
        char[] commands = {'M', 'M', 'R', 'M', 'L', 'M'};
        for (char c: commands)
        {
            switch(c){
                case 'M':
                    f.move(rover, grid);
                    break;
                case 'R':
                    r.move(rover, grid);
                    break;
                default:
                    l.move(rover ,grid);
                    break;
            }
                    
        }
        
        rover.getStatus();
    }
    
    
}
