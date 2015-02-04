package antsimulator.framework.event;


/**
 * Represents an event where the user wishes to change scenes.
 * @author Ville-Matti Tanninsn
 */
public class SceneChangeEvent extends GameEvent{
	
	/* **********************************************************************************************************************
	 *                                                     Nested SceneChangeEvent.Scene
	 * **********************************************************************************************************************/
	
	/**
	 * Name of the scene we are changing to.
	 * @author Ville-Matti Tanninen
	 */
	public static enum Scene
	{
		
            /* **********************************************************************************************************************
             *                                                     Enumerator constants
             * **********************************************************************************************************************/
		
            //Should have name of every scene here.
            
            TITLE_SCENE;
		
	}
	
	
	/* **********************************************************************************************************************
	 *                                                     DATA MEMBERS
	 * **********************************************************************************************************************/
	
	
	//***********************Static variables:**************************************
	
	
	
	//No static variables
	
	
	
	
	//************************Class variables:**************************************
	
	/**
	 * Enumeration representing the scene we are going to change to.
	 */
	public final Scene scene;
	
	

	/* **********************************************************************************************************************
	 *                                                        METHODS
	 * **********************************************************************************************************************/
	
	
	
	//************************Constructors**********************************
	
	
	/**
	 * Constructs a new SceneChangeEvent.
	 * @param type Type of the event. This should be SCENE_CHANGE.
	 * @param scene Scene we are switching to.
	 */
	public SceneChangeEvent(Type type, Scene scene)
	{
		super(type);
		this.scene = scene;
	}
	
	
	
	
	//************************Getters**********************************
	
	
	
	//No getters
	
	
	
	
	//************************Setters**********************************
	
	
	
	
	//No setters
	
	
	
	
	//************************Other methods***********************************
	
	
	
	//No other methods.


}