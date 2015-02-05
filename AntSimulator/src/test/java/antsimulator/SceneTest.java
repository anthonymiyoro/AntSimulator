/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antsimulator;

import antsimulator.framework.Scene;
import antsimulator.framework.event.GameEvent;
import antsimulator.framework.event.SceneChangeEvent;
import antsimulator.scenes.TitleScene;
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
public class SceneTest {
    Scene scene1;
    Scene scene2;
    RenderWindow window;
    public SceneTest() {
        
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
        scene1 = new TitleScene(window);
        scene2 = new TitleScene(window);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    private void openWindow()
    {
        window.create(VideoMode.getFullscreenModes()[0], "AntSimulatorTestWindow", WindowStyle.CLOSE);
    }
    
    @Test
    public void sceneChangesCorrectly()
    {
        scene1.toScene(scene2);
        scene1 = scene1.getCurrScene();
        assertEquals(scene1, scene2);
    }
    
    @Test
    public void sceneChangesViaUpdate()
    {
        scene1.notify(new SceneChangeEvent(SceneChangeEvent.Scene.TITLE_SCENE));
        scene1.update(Time.ZERO);
        assertNotSame(scene1, scene1.getCurrScene());
    }
    
    @Test
    public void windowClosesCorrectly()
    {
        openWindow();
        assertTrue(window.isOpen());
        scene1.exit();
        assertTrue(!window.isOpen());
    }
    
    @Test
    public void windowClosesViaUpdate()
    {
        openWindow();
        assertTrue(window.isOpen());
        scene1.notify(new GameEvent(GameEvent.Type.QUIT_ATTEMPT));
        scene1.update(Time.ZERO);
        assertTrue(!window.isOpen());
    }
    
}
