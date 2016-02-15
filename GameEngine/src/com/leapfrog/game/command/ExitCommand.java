/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.game.command;

import com.leapfrog.game.entity.Player;

/**
 *
 * @author Narayan
 */
public class ExitCommand extends GameCommand{

    @Override
    public void execute(Player player) {
        System.out.println("Closing the game");
        System.exit(0);
        
    }
    
    
}
