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
    
    /**
    * Main game loop
    * @param args Command line arguments that are currently not used!
    */
    public static void main(String[] args)
    {
           //Create the window
           RenderWindow window = new RenderWindow();
           window.create(VideoMode.getFullscreenModes()[0], "AntSimulator", WindowStyle.FULLSCREEN);

           //Create the scene
           Scene scene = new TitleScene(window);

           //Create the clock
           Clock deltaClock = new Clock();
           Time deltaT = Time.ZERO;

           //Main game loop
           while(window.isOpen()) 
           {
               //Fills the window with black.
               window.clear(Color.BLACK);
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
}

