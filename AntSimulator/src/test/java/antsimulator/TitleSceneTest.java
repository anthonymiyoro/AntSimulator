/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antsimulator;


import antsimulator.framework.Scene;
import antsimulator.scenes.TitleScene;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.jsfml.graphics.RenderWindow;
import org.jsfml.system.Time;
import org.jsfml.window.VideoMode;
import org.jsfml.window.WindowStyle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ville-Matti
 */
public class TitleSceneTest {
    Scene scene;
    RenderWindow window;
    
    public TitleSceneTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        window = new RenderWindow();
        scene = new TitleScene(window);
        window.create(VideoMode.getFullscreenModes()[0], "AntSimulatorTestWindow", WindowStyle.CLOSE);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void windowClosesWhenEscIsPressed()
    {
        //Making sure the window was indeed open before we close it.
        assertTrue(window.isOpen());
        
        //Simulating a key press.
        try {
        Robot keyBot = new Robot();

        keyBot.keyPress(KeyEvent.VK_ESCAPE);

        } catch (AWTException e) {
                e.printStackTrace();
        }
        
        scene.processInput();
        scene.update(Time.ZERO);
        
        assertTrue(!window.isOpen());
    }
    
}
