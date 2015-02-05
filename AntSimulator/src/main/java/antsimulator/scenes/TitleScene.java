/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antsimulator.scenes;

import antsimulator.framework.Scene;
import antsimulator.framework.event.GameEvent;
import antsimulator.gameObjects.AntHive;
import org.jsfml.graphics.RenderWindow;
import org.jsfml.system.Time;
import org.jsfml.window.event.Event;
import org.jsfml.window.event.KeyEvent;

/**
 * A scene representing the start menu.
 * @author Ville-Matti Tanninen
 */
public class TitleScene extends Scene {
    
    public TitleScene(RenderWindow window)
    {
        super(window);
    }

    @Override
    public void update(Time deltaT) {
        super.update(deltaT);
    }

    @Override
    public void processInput() {
        //JSFML event -> GameEvent
        for(Event event : window.pollEvents()) 
        {

            switch(event.type)
            {

                case KEY_PRESSED:
                {

                    KeyEvent keyEvent = event.asKeyEvent();

                    switch(keyEvent.key)
                    {

                        case ESCAPE:
                        {

                            this.events.add(new GameEvent(GameEvent.Type.QUIT_ATTEMPT));
                            break;

                        }//Escape

                    }//switch(keyEvent.key)
                    break;

                }//KEY_PRESSED
            }//switch
        }//for
    }
    
}
