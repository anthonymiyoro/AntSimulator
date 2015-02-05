/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antsimulator.gameObjects;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.jsfml.graphics.Drawable;
import org.jsfml.graphics.RenderStates;
import org.jsfml.graphics.RenderTarget;
import org.jsfml.graphics.Sprite;
import org.jsfml.graphics.Texture;
import org.jsfml.system.Vector2f;
import org.jsfml.system.Vector2i;

/**
 * Represents a single ant hive.
 * @author Ville-Matti Tanninen
 */
public class AntHive implements Drawable {
    /* *********************************************************************************************************************
     *                                                   DATA MEMBERS
     * **********************************************************************************************************************/


    //***********************Static variables:**************************************
    
    /**
     * The path used to load the ant texture.
     */
    private static final Path PATH = Paths.get("data/images/ant.png");


    /**
     * The ant texture.
     */
    private static final Texture TEXTURE = new Texture();
    
    /**
     * Used when checking if the texture has already been loaded. 
     * The size of an empty texture is equal to NULL_VECTOR
     */
    protected static final Vector2i NULL_VECTOR = new Vector2i(0, 0);

    /**
     * The maximum amount of ants the hive can handle.
     */
    private static int hiveSize;
    
    /**
     * The speed at which the ants can move.
     */
    private static final float antSpeed = 5;
    
    /**
     * The sprite used to render the ants.
     */
    private static Sprite sprite = new Sprite();


    //************************Class variables:**************************************

    /**
    * Whether or not a given ant exitsts.
    */
    boolean[] exists;
    
    /**
     * Ant's current x position.
     */
    float[] posX;

    /**
     * Ant's current y position.
     */
    float[] posY;
    
    /**
     * Ant's current angle.
     */
    float[] angle;
    
    
    /**
     * Whether or not the ant is currently carrying food.
     */
    boolean[] carries;



    /* **********************************************************************************************************************
     *                                                        METHODS
     * **********************************************************************************************************************/



    //************************Constructors**********************************


    /**
     * Creates a new hive of the given size.
     * @param hiveSize The maximum amount of ants the hive can have.
     */
    public AntHive(int hiveSize)
    {
        this.hiveSize = hiveSize;
        
        exists = new boolean[hiveSize];
        posX = new float[hiveSize];
        posY = new float[hiveSize];
        angle = new float[hiveSize];
        carries = new boolean[hiveSize];
        
        loadTexture();
    }
    
    /**
     * Creates a new hive with the default size of 100000.
     */
    public AntHive()
    {
        this(100000);
    }




    //************************Getters**********************************


    //None




    //************************Setters**********************************


    //No setters.



    //************************Other methods**********************************


    /**
     * Loads texture from file if it hasn't already been loaded and sets it as Sprite's texture.
     * 
     * @throws IOException Image is missing.
     */
    private void loadTexture()
    {
            if (TEXTURE.getSize().equals(NULL_VECTOR))
            {
                try {
                        TEXTURE.loadFromFile(PATH);
                        TEXTURE.setSmooth(true);
                } catch (IOException e) {
                        //Image is missing! Let's do nothing about it!
                        e.printStackTrace();
                }
                sprite.setTexture(TEXTURE,true);
                sprite.setOrigin(new Vector2f(sprite.getTexture().getSize().x/2, sprite.getTexture().getSize().y / 2));
            }

    }

    /**
     * Draws the ants.
     * @param rt JSFML RenderTarget.
     * @param rs JFSML RenderStates.
     */
    @Override
    public void draw(RenderTarget rt, RenderStates rs) {
        for(int i = 0; i < hiveSize; i++)
        {
            if(exists[i])
            {
                sprite.setPosition(posX[i],posY[i]);
                sprite.setRotation(angle[i]);
                sprite.draw(rt, rs);
            }
        }
    }

    
}
