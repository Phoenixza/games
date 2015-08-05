package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;

/***
 * Created by welser on 04.08.2015.
 */
public class GameOverState extends State {

    private Texture bg;
    private BitmapFont go;
    private CharSequence gameOver = "Game Over \n\nHighscore:\n "  + PlayState.highscore;
    protected GameOverState(GameStateManager gsm) {
        super(gsm);
        bg = new Texture("ed.png");
        cam.setToOrtho(false, MyGdxGame.WIDTH/2, MyGdxGame.HEIGHT/2);
        go = new BitmapFont();
    }

    @Override
    protected void handleImput() {
        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleImput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bg, cam.position.x - (cam.viewportHeight / 2), 0);
        go.draw(sb,gameOver,90,350);
        sb.end();
    }

    @Override
    public void dispose() {
        bg.dispose();
        go.dispose();

    }
}
