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
        int newx=rover.x, newy=rover.y;
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
        
        if (grid.obstacle.contains(coord))
        {
            rover.o++;
            return;
        }
        
        else if (newx>=0 && newx<grid.n && newy>=0 && newy<grid.m)
        {
            rover.x=newx;
            rover.y=newy;
        }
        
        return;
        
    }

}
