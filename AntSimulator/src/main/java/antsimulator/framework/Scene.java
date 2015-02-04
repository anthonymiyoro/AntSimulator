/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antsimulator.framework;

import java.util.ArrayList;
import org.jsfml.graphics.FloatRect;
import org.jsfml.graphics.RenderWindow;
import org.jsfml.graphics.View;
import org.jsfml.system.Time;

/**
 * A single scene such as the main game or the title screen.
 * @author Ville-Matti Tanninen
 */
public abstract class Scene {
	/* *********************************************************************************************************************
	 *                                                   DATA MEMBERS
	 * **********************************************************************************************************************/
	
	
	//***********************Static variables:*************************************
	
	
	
	/**
         * List of all views available for use.
         */
	private static ArrayList<View> views = new ArrayList<View>();
        
        
        /**
         * The size of the view looking into the game world.
         * Not to be confused with the size of the actual window - that's different.
         */
        private static final FloatRect viewSize = new FloatRect(0,0,853,480);
			
			
			
			
	//************************Class variables:*************************************
	
	
	
	/**
	 * Current scene - used when moving from scene to scene,
	 */
	protected Scene currScene;
	
	/**
	 * Window to draw on.
	 */
	protected RenderWindow window;
	
	
	

	/* **********************************************************************************************************************
	 *                                                        METHODS
	 * **********************************************************************************************************************/
	
	
	
	//************************Constructors**********************************
	
	
	/**
	 * Constructs a new scene. 
	 * We obviously don't want to swap scenes yet, so current scene should be this scene.
	 */
	public Scene(RenderWindow window)
	{
		currScene = this;
		this.window = window;
		
		//If no views have been created, creates the first view.
		this.createView();
	}

	
	
	
	//************************Getters**********************************
		
		
	
	public Scene getCurrScene(){return this.currScene;}
	
	
	
	
	//************************Setters**********************************
	
	
	
	//No setters.
			
			
			
	//************************Other methods**********************************
			
			
	
		
	//Updating scene:	
	
	/**
	 * Updates the game logic.
	 */
	public abstract void update(Time deltaT);
	
	/**
	 * Handles user input.
	 * Polls JSFML events and maps them into custom events. 
	 * Update() uses these custom events to then perform the necessary actions.
	 */
	public abstract void processInput();
	
	/**
	 * Renders the scene.
	 */
	public abstract void render();
	
	/**
	 * Changes scene from current scene to the given scene.
	 * @param nextScene Scene to move to.
	 */
	 public void toScene(Scene nextScene)
	 {
	        this.currScene = nextScene;
	 }
	 
	 /**
	  * Closes the game.
	  */
	 public void exit()
	 {
		 this.window.close();
	 }
	 
	 /**
	  * Creates the first view, if it hasn't been created yet.
	  */
	 private void createView()
	 {
		 if (views.size() == 0)
			{
				views.add(new View(viewSize));
				window.setView(views.get(0));
			}
	 }
    
}