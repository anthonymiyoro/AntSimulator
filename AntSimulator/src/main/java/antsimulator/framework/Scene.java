/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antsimulator.framework;

import antsimulator.framework.event.GameEvent;
import antsimulator.framework.event.SceneChangeEvent;
import antsimulator.scenes.TitleScene;
import java.util.ArrayList;
import org.jsfml.graphics.Color;
import org.jsfml.graphics.Drawable;
import org.jsfml.graphics.FloatRect;
import org.jsfml.graphics.RenderWindow;
import org.jsfml.graphics.View;
import org.jsfml.system.Time;

/**
 * A single scene such as the main game or the title screen.
 * @author Ville-Matti Tanninen
 */
public abstract class Scene implements EventListener{
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
        
        
        /**
	 * List of events.
	 */
	protected ArrayList<GameEvent> events = new ArrayList<GameEvent>();
        
        /**
         * List of drawable objects.
         */
        protected ArrayList<Drawable> objects = new ArrayList<Drawable>();
        

	
	
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
                
                //If there is no view, creates one.
                this.createFirstView();
	}

	
	
	
	//************************Getters**********************************
		
		
	
	public Scene getCurrScene(){return this.currScene;}
	
	
	
	
	//************************Setters**********************************
	
	
	
	//No setters.
			
			
			
	//************************Other methods**********************************
			
			
	
		
	//Updating scene:	
	
	/**
	 * Updates the game logic.
         * 
         * To avoid copy-paste code, the abstract Scene class handles common events such as closing the game.
         * For now we'll opt for a lazy switch solution. Hopefully it can be replaced with something more elegant later on.
	 */
	public void update(Time deltaT)
        {
            	for(GameEvent event : this.events)
		{
			
			switch(event.type)
			{
			
				case QUIT_ATTEMPT:
				{
					
					this.exit();
					break;
					
				}//QUIT_ATTEMPT
				
				case SCENE_CHANGE:
				{

					SceneChangeEvent e = event.asSceneChangeEvent();
					switch(e.scene)
					{
					
						case TITLE_SCENE:
						{
							this.toScene(new TitleScene(this.window));
							break;
						}//TITLE_SCENE
						
						
					}//switch(e.scene)
					
					break;
				}//SCENE_CHANGE
				
			}//switch(event.type)

		}//for
        }
	
	/**
	 * Handles user input.
	 * Polls JSFML events and maps them into custom events. 
	 * Update() uses these custom events to then perform the necessary actions.
	 */
	public abstract void processInput();
	
	/**
	 * Renders the scene.
	 */
	public void render()
        {
            //Fills the window with black.
            window.clear(Color.BLACK);
            
            //Draws the objects.
            for(Drawable o : objects)
            {
                window.draw(o);
            }
        }
	
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
	 private void createFirstView()
	 {
		 if (views.isEmpty())
			{
				views.add(new View(viewSize));
				window.setView(views.get(0));
			}
	 }

        /**
         * Notifies the scene of an event.
         */
        @Override
        public void notify(GameEvent e) {
            events.add(e);
        }
    
}
