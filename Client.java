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
        //Instantiate grid
        Grid grid = new Grid(10, 10);
        
        //Add obstacles
        grid.addObstacle(2,2);
        grid.addObstacle(3,5);

        //Instantiate the initial direction of the rover
        Rover rover = new Rover(0, 0, 'N');

        //Instantiate the commands the rover can take
        Forward f = new Forward();
        Right r = new Right();
        Left l = new Left();
        
        char[] commands = {'M', 'M', 'R', 'M', 'L', 'M'};

        //Reading each command
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
