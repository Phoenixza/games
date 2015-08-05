package com.mygdx.game.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by welser on 03.08.2015.
 */
public abstract class State {

    //camera
    protected OrthographicCamera cam;
    // XZY coordinates
    protected Vector3 mouse;
    //
    protected GameStateManager gsm;


    protected State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();


    }


    protected abstract void handleImput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();


}
