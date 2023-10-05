/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MarsRover;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Forward extends Command {
    public void move(Rover rover, Grid grid)
    {
        //Variables to store the new possible location of rover
        int newx=rover.x, newy=rover.y;

        //Cases to move when rover is facing a particular direction
        switch (rover.dir) {
            case 'N':
                newy+=1;
                break;
            case 'W':
                newx-=1;
                break;
            case 'E':
                newx+=1;
                break;
            default:
                newy-=1;
                break;
        }
        
        ArrayList<Integer> coord = new ArrayList<Integer>();
        coord.add(newx);
        coord.add(newy);

        //Check if the new location already has some obstacle and update obstacle count
        if (grid.obstacle.contains(coord))
        {
            rover.o++;
            return;
        }

        //Check if the rover is inside the grid and update the actual coordianates 
        else if (newx>=0 && newx<grid.n && newy>=0 && newy<grid.m)
        {
            rover.x=newx;
            rover.y=newy;
        }
        
        return;
        
    }

}
