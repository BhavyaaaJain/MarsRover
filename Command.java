/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MarsRover;

/**
 *
 * @author LENOVO
 */
//The Superclass for commands to move the rover
abstract class Command {
    abstract void move(Rover rover, Grid grid);
}
