/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.game.command;

/**
 *
 * @author Narayan
 */
public class GameFactory {
    
    public static GameCommand get(String cmd){
        if(cmd.equalsIgnoreCase("move")){
            return new MoveCommand();
        }
        else if(cmd.equalsIgnoreCase("run")){
            return new RunCommand();
        }
        else if(cmd.equalsIgnoreCase("walk")){
            return new WalkCommand();
        }
        else if(cmd.equalsIgnoreCase("jump")){
            return new JumpCommand();
        }
        else if(cmd.equalsIgnoreCase("shoot")){
            return new ShootCommand();
        }
        else if(cmd.equalsIgnoreCase("exit")){
            return new ExitCommand();
        }
        return null;
    }
    
    
}
