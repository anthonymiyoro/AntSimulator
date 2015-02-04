package antsimulator.framework.event;

/**
 * Represents an event where the user zooms the camera.
 * @author Ville-Matti Tanninen
 */
public class ZoomEvent extends GameEvent{

		
		/* **********************************************************************************************************************
		 *                                                     DATA MEMBERS
		 * **********************************************************************************************************************/
		
		
		//***********************Static variables:**************************************
		
		
		
		//No static variables
		
		
		
		
		//************************Class variables:**************************************
	
	
		/**
		 * Index of the view to be zoomed.
                 * Used when dealing with multiple views such as minimaps on top of the actual game.
		 */
		private final int viewIndex;
		
		/**
		 *  The amount the view should be zoomed by.
		 */
		private final float delta;
		
		

		/* **********************************************************************************************************************
		 *                                                        METHODS
		 * **********************************************************************************************************************/
		
		
		
		//************************Constructors**********************************
		
		/**
		 * Constructs a new ZoomEvent.
		 * @param type Type of the FTAI_Event - this should be ZOOM_EVENT.
		 * @param viewInex Index of the view to be zoomed.
		 * @param delta The amount the view should be zoomed by.
		 */
		public ZoomEvent(Type type, int viewIndex, float delta)
		{
			super(type);
			this.viewIndex = viewIndex;
			this.delta = delta;
		}


		
		
		
		//************************Getters**********************************
		
		
		/**
		 * Gets the viewIndex.
		 * @return Index of the View to be zoomed.
		 */
		public int getViewIndex(){return this.viewIndex;}


		/**
		 * Gets the delta.
		 * @return The amount the view should be zoomed by.
		 */
		public float getDelta(){return this.delta;}
		
		
		
		
		
		//************************Setters**********************************
		
		
		
		
		//No setters
		
		
		
		
		//************************Other methods***********************************
		
		
		
		//Nope


	

}
