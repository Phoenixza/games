package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;

/**
 * Created by welser on 03.08.2015.
 */
public class MenuState extends State {
    private Texture background;
    private Texture plyBtn;
    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("ed.png");
        plyBtn = new Texture("playbtn.png");
    }

    @Override
    public void handleImput() {
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
        sb.begin();
        sb.draw(background,0, 0, MyGdxGame.WIDTH*2, MyGdxGame.HEIGHT*2);
        sb.draw(plyBtn, (MyGdxGame.WIDTH/2)+(plyBtn.getWidth()/2), MyGdxGame.HEIGHT);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        plyBtn.dispose();
        System.out.print("Menu Stiate Disposed");
    }
}
