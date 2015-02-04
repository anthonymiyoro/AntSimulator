/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antsimulator;

import antsimulator.framework.Scene;
import antsimulator.scenes.TitleScene;
import org.jsfml.graphics.Color;
import org.jsfml.graphics.RenderWindow;
import org.jsfml.system.Clock;
import org.jsfml.system.Time;
import org.jsfml.window.VideoMode;
import org.jsfml.window.WindowStyle;

/**
 * Contains the main game loop.
 * @author Ville-Matti Tanninen
 */
public class Main {
    
    	/* *********************************************************************************************************************
	 *                                                   DATA MEMBERS
	 * **********************************************************************************************************************/
	
	
	//***********************Static variables:*************************************
	
	
	/**
         * The window the game is drawn on.
         */
	private static RenderWindow window;
        
        /**
         * The current scene.
         */
        private static Scene scene;
        
        /**
         * The clock used to keep track of time.
         */
        private static Clock deltaClock;
        
        /**
         * Time since last update.
         */
        private static Time deltaT;
			
			
			
			
	//************************Class variables:*************************************
	
	
	
	//No class variables

	
	
	
	//************************Getters**********************************
		
		
	
	//No getters
	
	
	
	
	//************************Setters**********************************
	
	
	
	//No setters.
			
			
			
	//************************Other methods**********************************
			
			
	
		
	
    
    
    /**
    * Main game loop
    * @param args Command line arguments that are currently not used!
    */
    public static void main(String[] args)
    {
           initializeGame();

           //Main game loop
           while(window.isOpen()) 
           {
               //Add the time passed to the total time pool.
               deltaT = deltaClock.restart();

               //Do what the current scene wants to do.
               scene.processInput();
               scene.update(deltaT);
               scene.render();
               window.display();
               scene = scene.getCurrScene();
           }
    }

    /**
     * Initializes the game.
     */
    private static void initializeGame() {
        //Creates the window
        window = createWindow();
        
        //Creates the scene
        scene = new TitleScene(window);
        
        //Creates the clock
        deltaClock = new Clock();
        deltaT = Time.ZERO;
    }

    /**
     * Creates the window for the game.
     */
    private static RenderWindow createWindow() {
        RenderWindow window = new RenderWindow();
        window.create(VideoMode.getFullscreenModes()[0], "AntSimulator", WindowStyle.FULLSCREEN);
        return window;
    }
}

