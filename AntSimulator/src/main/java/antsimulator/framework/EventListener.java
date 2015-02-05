/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antsimulator.framework;

import antsimulator.framework.event.GameEvent;

/**
 * Interface used when notifying others of events.
 * @author Ville-Matti Tanninen
 */
public interface EventListener {
    
    /**
     * Called to notify the listener of an event.
     * 
     * @param e The event the listener should know about.
     */
    public void notify(GameEvent e);
}
