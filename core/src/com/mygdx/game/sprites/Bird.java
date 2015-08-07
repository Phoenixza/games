package com.mygdx.game.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by welser on 03.08.2015.
 */
public class Bird {
    private static final int GRAVITY = -15;
    private static final int MOVEMENT = 100;
    private Vector3 position;
    private Vector3 velocity;
    private Rectangle bounce;
    private Texture bird;
    private Animation birdAnimation;

    public TextureRegion getTexture() {
        return birdAnimation.getFrame();
    }

    public Vector3 getPosition() {
        return position;
    }

    public Bird(int x, int y){
        position = new Vector3(x,y,0);
        velocity = new Vector3(0,0,0);
        bird = new Texture("edbu.png");
        Texture texture = new Texture("edt.png");
        birdAnimation = new Animation(new TextureRegion(texture), 3,0.5f);

        bounce = new Rectangle(x,y,texture.getWidth()/3, texture.getHeight());

    }

    public void update(float dt){
        birdAnimation.update(dt);
        if(position.y >0){
            velocity.add(0,GRAVITY,0);
        }

        velocity.scl(dt);
        position.add(MOVEMENT*dt, velocity.y, 0);

        if(position.y < 0){
            position.y=0;
        }

        velocity.scl(1/dt);
        bounce.setPosition(position.x, position.y);
    }

    public void jump(){
        velocity.y = 250;
    }

    public  Rectangle getBounce(){
        return bounce;
    }

    public void dispose(){
        bird.dispose();
    }

}
