package antsimulator.framework.event;

/**
 * Represents any event that might take place, such as the user attempting to close the game or move a character.
 * 
 * @author Ville-Matti Tanninen
 */
public class GameEvent {
    /* **********************************************************************************************************************
    *                                                     Nested FTAI_Event.Type
    * **********************************************************************************************************************/

    /**
    * Type of the event.
    * @author Ville-Matti Tanninen
    */
    public static enum Type
    {

           /* **********************************************************************************************************************
            *                                                     Enumerator constants
            * **********************************************************************************************************************/


           /**
            * User wishes to exit the game.
            * Better close the game!
            */
           QUIT_ATTEMPT,

           /**
            * User wishes to change scene.
            * We need to know which scene we are changing to!
            */
           SCENE_CHANGE,

           /**
            * User clicked a menu button.
            * We need to know which button!
            */
           MENU_BUTTON_PRESS,

           /**
            * User wishes to zoom a view!
            * We need to know which which view and by how much!
            */
           ZOOM_EVENT;

    }


    /* **********************************************************************************************************************
    *                                                     DATA MEMBERS
    * **********************************************************************************************************************/


    //***********************Static variables:**************************************



    //No static variables




    //************************Class variables:**************************************


    /**
    * Type of the event.
    */
    public final Type type;



    /* **********************************************************************************************************************
    *                                                        METHODS
    * **********************************************************************************************************************/



    //************************Constructors**********************************


    /**
    * Constructs an event of the given type.
    * @param type Type of the event.
    */
    public GameEvent(Type type)
    {
           this.type = type;
    }




    //************************Getters**********************************



    //No getters




    //************************Setters**********************************




    //No setters




    //************************Other methods***********************************


    /**
    * Returns the event as SceneChangeEvent.
    * Only to be used when it is certain the event is a SceneChangeEvent - determine by using event.type!
    * @return Event as SceneChangeEvent.
    */
    public SceneChangeEvent asSceneChangeEvent()
    {
           return (SceneChangeEvent) this;
    }


    /**
    * Returns the event as ZoomEvent.
    * Only to be used when it is certain the event is ZoomEvent - determine by using event.type!
    * @return Event as ZoomEvent
    */
    public ZoomEvent asZoomEvent()
    {
           return (ZoomEvent) this;
    }
}
