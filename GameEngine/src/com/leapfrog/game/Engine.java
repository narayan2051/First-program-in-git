/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.game;

import com.leapfrog.game.command.GameCommand;
import com.leapfrog.game.command.GameFactory;
import com.leapfrog.game.entity.Player;
import java.util.Scanner;

/**
 *
 * @author Narayan
 */
public class Engine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input=new Scanner (System.in);
        
        System.out.println("==================================");
        System.out.println("Text Based Game");
        System.out.println("==================================");
        System.out.print("Enter Players name::");
        Player p=new Player();
        p.setName(input.next());
        
        while (true){
       
        System.out.println("Enter command::");
        String cmd=input.next();
        
        GameCommand gameCmd=GameFactory.get(cmd);
        if(gameCmd!=null){
           gameCmd.execute(p);
            
        }
        else{
            System.out.println("Invalid Command.");
            System.exit(0);
        }
            
        }
        
        
        
        
    }
    
}
