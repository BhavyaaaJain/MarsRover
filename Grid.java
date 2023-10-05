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
public class Grid {
    //Initialise grid and obstacles array
    int n, m;
    ArrayList<ArrayList<Integer>> obstacle;
    public Grid(int n, int m)
    {
        this.n=n;
        this.m=m;
        obstacle = new ArrayList<ArrayList<Integer>>(); 
    }

    //Adding obstacle coordinates in the obstacle array for future use
    public void addObstacle(int x, int y)
    {
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(x);
        pair.add(y);
        obstacle.add(pair);
    }
    
}
